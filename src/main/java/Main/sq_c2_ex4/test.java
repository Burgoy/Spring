package Main.sq_c2_ex4;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionCustomizer;

import java.util.function.Supplier;

public class test implements Supplier, BeanDefinitionCustomizer {

    @Override
    public Object get() {
        return null;
    }

    @Override
    public void customize(BeanDefinition bd) {

    }
}
