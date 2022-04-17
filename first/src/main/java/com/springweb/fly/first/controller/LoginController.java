package com.springweb.fly.first.controller;

import com.springweb.fly.first.service.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

  @Autowired
  LoginService loginService;

  @RequestMapping("/login1")
  @ResponseBody
  public String loginMessage(ModelMap model) {
    return "abclogin";
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

  @RequestMapping("/login3")
  public String loginJspWithoutInput(ModelMap model) {

    return "testlogin2";
  }

  @RequestMapping(value = "/login4", method = RequestMethod.GET)
  public String loginPage(ModelMap model) {
    return "loginpage";
  }

  // @RequestMapping(value = "/login4", method = RequestMethod.POST)
  // public String welcomepage(ModelMap model, @RequestParam String keyinput,
  // @RequestParam String pass) {
  // model.put("name", keyinput);
  // model.put("yourpass", pass);
  // return "welcomepage";
  // }

  @RequestMapping(value = "/login4", method = RequestMethod.POST)
  public String welcomePageWithService(ModelMap model, @RequestParam String keyinput, @RequestParam String pass) {

    if (!loginService.validateUser(keyinput, pass)) {
      model.put("errorMessage", "Your password is wrong");
      return "loginpage";
    }

    model.put("name", keyinput);
    model.put("yourpass", pass);
    return "welcomepage";
  }
}
