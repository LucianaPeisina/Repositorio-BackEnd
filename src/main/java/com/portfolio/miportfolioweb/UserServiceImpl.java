package com.portfolio.miportfolioweb;


import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
 
public class UserServiceImpl implements UserService {
 
    @Autowired
    private UserRepository UserRepo;
 
    @Autowired
    private PasswordEncoder passwordEncoder;
 
 
    @Override
    public String addUser(UserDTO UserDTO) {
 
        User User = new User(
 
                UserDTO.getId(),
                UserDTO.getUsername(),
                UserDTO.getEmail(),
 
               this.passwordEncoder.encode(UserDTO.getPassword())
        );
 
        UserRepo.save(User);
 
        return User.getUsername();
    }
    UserDTO UserDTO;
 
    @Override
    public LoginResponse  loginUser(LoginDTO loginDTO) {
        String msg = "";
        User User1 = UserRepo.findByEmail(loginDTO.getEmail());
        if (User1 != null) {
            String password = loginDTO.getPassword();
            String encodedPassword = User1.getPassword();
            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
            if (isPwdRight) {
                Optional<User> User = UserRepo.findOneByEmailAndPassword(loginDTO.getEmail(), encodedPassword);
                if (User.isPresent()) {
                    return new LoginResponse("Login Success", true);
                } else {
                    return new LoginResponse("Login Failed", false);
                }
            } else {
 
                return new LoginResponse("password Not Match", false);
            }
        }else {
            return new LoginResponse("Email not exits", false);
        }
    }
}
    
 