package com.springweb.fly.first.controller;

import com.springweb.fly.first.service.TodoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class TodoController {

  @Autowired
  TodoService todoService;

  @RequestMapping(value = "/todo-list", method = RequestMethod.GET)
  public String showTodoList(ModelMap model) {
    String name = (String) model.get("name");
    model.put("todowhole", todoService.retrieveTodos(name));
    return "todo-page";
  }
}
