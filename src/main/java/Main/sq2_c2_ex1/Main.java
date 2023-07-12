package Main.sq2_c2_ex1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context =
                new AnnotationConfigApplicationContext(ConfigProject.class);
        Parrot parrot = new Parrot();
        Parrot p = context.getBean(Parrot.class);

        System.out.println(p.getName());

        String str = context.getBean(String.class);
        Integer integer = context.getBean(Integer.class);

        System.out.println(str);
        System.out.println(integer);

    }
}
