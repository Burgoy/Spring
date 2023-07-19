package LazyBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan(basePackages = "LazyBean")
public class Config {
    @Bean
    @Lazy
    StandardBean bean(){
        return new StandardBean();
    }

}
