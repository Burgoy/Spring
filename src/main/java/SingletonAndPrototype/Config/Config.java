package SingletonAndPrototype.Config;

import SingletonAndPrototype.Model.Human;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;

@ComponentScan(basePackages = "SingletonAndPrototype.*")
public class Config {

    @Bean("HumanP")
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    Human human1(){
        return new Human();
    }

    @Bean("HumanS")
    @Scope(BeanDefinition.SCOPE_SINGLETON)
    Human human2(){
        return new Human();
    }
}
