package com.springweb.fly.first.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.SessionAttributes;

@Component
public class LoginService {
  public boolean validateUser(String name, String pass) {
    return (name.equalsIgnoreCase("in28Minutes") &&
        pass.equalsIgnoreCase("abcde"));
  }
}
