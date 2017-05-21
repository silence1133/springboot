package cn;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by a000996 on 17/5/20.
 * test
 */
@RestController
@SpringBootApplication
public class MainDemo {

    @Value("${name}")
    private String name ;

    @RequestMapping("/")
    String home() {
        return "Hello World!"+name;
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(MainDemo.class, args);
    }

}
