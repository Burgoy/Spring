package Main.sq_c2_ex3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "sq_c2_ex3")
public class ConfigClass {
    @Bean
    Cat cat(){
        Cat cat = new Cat();
        cat.setSay("Hello");
        return cat;
    }
}

