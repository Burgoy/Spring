package sq_c2_ex2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context =
                new AnnotationConfigApplicationContext(ConfigClass.class);

        Parrot p = context.getBean("Petux",Parrot.class);

        System.out.println(p.getName());

    }
}
