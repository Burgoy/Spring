package Chapter2.sq_ch3_ex2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "Chapter2.sq_ch3_ex2")
public class ClassConfig {
    @Bean
    public Parrot parrot(){
        Parrot parrot = new Parrot();
        return parrot;
    }
}
