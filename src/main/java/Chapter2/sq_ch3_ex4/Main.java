package Chapter2.sq_ch3_ex4;

import Chapter2.sq_ch3_ex3.ConfigClass;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(ConfigClass.class);
        context.getBean(BeanA.class);

    }
}
