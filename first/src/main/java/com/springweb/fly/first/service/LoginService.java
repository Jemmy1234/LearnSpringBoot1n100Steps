package com.springweb.fly.first.service;

import org.springframework.stereotype.Component;

@Component
public class LoginService {
  public boolean validateUser(String name, String pass) {
    return (name.equalsIgnoreCase("Eric") &&
        pass.equalsIgnoreCase("abcde"));
  }
}
