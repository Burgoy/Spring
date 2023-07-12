package Chapter2.sq_ch3_ex1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Spliterator;
import java.util.function.Supplier;

public class Main {
    AnnotationConfigApplicationContext TestContext =
            new AnnotationConfigApplicationContext(ConfigClass.class);

    public Main() {
        Human human = new Human();
        human.setName("Jac");
        Supplier<Human> Jac = ()-> human;
        TestContext.registerBean("Jac", Human.class, Jac, bd -> {bd.setPrimary(true);});
    }

    public static void main(String[] args) {
        Cat marysa = new Main().TestContext.getBean(Cat.class);
        Parrot parrot1 = new Main().TestContext.getBean(Parrot.class);
        Human Jac = new Main().TestContext.getBean(Human.class);

        marysa.setName("Marysa");
        System.out.println(Jac.toString());
        System.out.println(parrot1.toString());
        System.out.println(marysa.toString());


    }
}
