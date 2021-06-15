package ca.smckinlay.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
public class DemoController {

    // http://localhost:8080/todo-list/hello
    @ResponseBody
    @GetMapping("/hello")
    public String hello() {
        // returns text as response body
        return "hello";
    }

    // http://localhost:8080/todo-list/welcome

    @GetMapping("welcome")
    public String welcome(Model model) {
        // key/value pair to model --> can use in jsp
        model.addAttribute("user", "Stewart");
        log.info("model= ${}", model);
        // prefix + name + suffix = created from view resolver
        // WEB-INF/view/welcome.jsp
        // return is view name
        return "welcome";
    }


    @ModelAttribute("welcomeMessage")
    public String welcomeMessage() {
        log.info("welcomeMessage() called");
        return "Welcome to this DEMO application";
    }

}
