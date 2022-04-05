package com.springweb.fly.first.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

  @RequestMapping("/login1")
  @ResponseBody
  public String loginMessage() {
    return "Hello World Modified!!";
  }

  @RequestMapping("/login2")
  public String loginJsp() {
    return "testlogin";
  }
}
