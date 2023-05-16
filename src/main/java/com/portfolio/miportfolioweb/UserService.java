package com.portfolio.miportfolioweb;


public interface UserService {
    UserDTO createUser(SignupDTO signupDTO);

    boolean hasUserWithEmail(String email);
}
