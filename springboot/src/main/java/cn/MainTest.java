package cn;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by a000996 on 17/5/20.
 */
@Component
public class MainTest implements CommandLineRunner {

    @Value("${name}")
    private String name ;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(name);
    }
}
