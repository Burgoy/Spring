package Chapter2.sq_ch3_ex1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

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

    @Bean
    @Primary
    Women Natalia(){
        Women women = new Women();
        women.setCat(CatVasiliy());
        women.getCat().setName("Vasiliy");
        return women;
    }
}
