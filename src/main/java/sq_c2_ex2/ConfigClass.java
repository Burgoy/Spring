package sq_c2_ex2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClass {
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
