package cn.antfish.sso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;

@Controller
public class IndexController {
  @GetMapping("/")
  public String index() {
    return "index";
  }

  @GetMapping("/user")
  @ResponseBody
  public Principal user(Principal principal) {
    return principal;
  }
}
