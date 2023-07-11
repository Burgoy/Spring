package Main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigParrot {
    @Bean
    Parrot parrot(){
        var p = new Parrot();
        p.setName("Koko");
        return p;
    }
}
