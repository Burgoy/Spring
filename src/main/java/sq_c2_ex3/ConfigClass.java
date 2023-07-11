package sq_c2_ex3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import sq_c2_ex2.Parrot;

@Configuration
@ComponentScan(basePackages = "sq_c2_ex3")
public class ConfigClass {
    @Bean
    Cat cat(){
        return new Cat();
    }
}

