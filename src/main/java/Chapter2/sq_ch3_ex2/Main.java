package Chapter2.sq_ch3_ex2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(ClassConfig.class);

    public static void main(String[] args) {
        Main m = new Main();

        Human human = m.context.getBean(Human.class);
        Cat cat = m.context.getBean(Cat.class);

        System.out.println(human.getName());
        System.out.println(human.getCat());

    }
}
