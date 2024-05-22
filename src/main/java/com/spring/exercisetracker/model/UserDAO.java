package com.spring.exercisetracker.model;

public interface UserDAO {
    Long getId();
    void setId(Long id);
    String getUsername();
    void setUsername(String username);
    String getEmail();
    void setEmail(String email);
    String getPassword();
    void setPassword(String password);
}
