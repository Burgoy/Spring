package Chapter2.sq_ch3_ex1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "Chapter2.sq_ch3_ex1")
public class ConfigClass {

    @Bean
    @Primary
    Cat CatPetya(){
        return new Cat();
    }

    @Bean
    Cat CatVasiliy(){
        return new Cat();
    }

}
