package com.portfolio.miportfolioweb;

import javax.persistence.Id;
import lombok.Data;


@Data

public class UserDTO {
 
  private Long id;
  private String Username;
  private String email;
  private String password;

  public UserDTO() {
  }

  public UserDTO(Long id, String Username, String email, String password) {
      this.id = id;
      this.Username = Username;
      this.email = email;
      this.password = password;
  }
 
public Long getId() {
    return id;
}

public void setUserid(Long id) {
    this.id = id;
}

public String getUsername() {
    return Username;
}

public void setUsername(String Username) {
    this.Username = Username;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public String getPassword() {
    return password;
}

public void setPassword(String password) {
    this.password = password;
}

@Override
public String toString() {
    return "UserDTO{" +
            "Id=" + id +
            ", Username='" + Username + '\'' +
            ", email='" + email + '\'' +
            ", password='" + password + '\'' +
            '}';
}
}