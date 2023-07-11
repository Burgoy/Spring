package Main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context =
                new AnnotationConfigApplicationContext(
                        ConfigParrot.class
                );
        Parrot parrot = new Parrot();
        Parrot p = context.getBean(Parrot.class);

        System.out.println(p.getName());


    }
}
