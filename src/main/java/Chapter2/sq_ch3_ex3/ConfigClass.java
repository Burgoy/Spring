package Chapter2.sq_ch3_ex3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "Chapter2.sq_ch3_ex3")
public class ConfigClass {
    @Bean
    @Primary
    Person Vania(){
        Person person = new Person("Vania");
        Cat cat = new Cat();
        person.setCat(cat);
        return person;
    }
}
