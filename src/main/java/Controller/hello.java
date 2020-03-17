package Controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
    @RequestMapping("/Hello")
    public String sayHello(){
        return "Hello World !";
    }

    @SpringBootApplication
    public static class App {
        public static void main(String[] args) {
            SpringApplication.run(App.class, args);
        }
    }
}
