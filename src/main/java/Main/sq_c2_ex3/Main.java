package Main.sq_c2_ex3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ConfigClass.class);

        Parrot parrot = context.getBean(Parrot.class);
        Cat cat = context.getBean(Cat.class);

        System.out.println(parrot.getName());
        System.out.println(cat.getSay());

    }
}
