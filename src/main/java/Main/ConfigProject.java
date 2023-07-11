package Main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration
public class ConfigProject {
    @Bean
    Parrot parrot(){
        var p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean
    String hello(){
        return "Hello world";
    }

    @Bean
    Integer nextInt(){
        return  new Scanner(System.in).nextInt();
    }
}
