package Main.sq_c2_ex2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ConfigClass {

    @Bean
    @Primary
    Parrot parrot(){
        var p = new Parrot();
        p.setName("Alfa");
        return p;
    }

    @Bean
    Parrot parrot1(){
        var p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean(name = "Petux")
    Parrot parrot2(){
        var p = new Parrot();
        p.setName("Petya");
        return p;
    }

    @Bean
    Parrot parrot3(){
        var p = new Parrot();
        p.setName("Nasty");
        return p;
    }
}
