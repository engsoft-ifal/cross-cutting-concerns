package br.edu.ifal.crosscutingconcerns;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/")
    public String myhome() {
        return "home";
    }

    @GetMapping("/hello")
    public String myhello() {
        return "hello";
    }

    @GetMapping("/logout")
    public String mylogout() {
        return "home";
    }

    @GetMapping("/login")
    public String mylogint() {
        return "login";
    }

    @PostMapping("/login")
    public String mylogin(@RequestParam String username, @RequestParam String password) {
        System.out.println("Login: " + username);
        System.out.println("Senha: " + password);
        return "home";
    }

}
