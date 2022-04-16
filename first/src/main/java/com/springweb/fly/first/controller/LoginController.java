package com.springweb.fly.first.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

  @RequestMapping("/login1")
  @ResponseBody
  public String loginMessage() {
    return "Hello World Modified!!";
  }

  @RequestMapping("/login2")
  public String loginJsp(
      @RequestParam String input,
      @RequestParam String input2,
      ModelMap model) {

    model.put("name", input);
    model.put("action", input2);

    return "testlogin";
  }
}
