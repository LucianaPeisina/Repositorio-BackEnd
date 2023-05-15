package com.portfolio.miportfolioweb;



public interface UserService {
  String addUser(UserDTO UserDTO);

  LoginResponse loginUser(LoginDTO loginDTO);
}