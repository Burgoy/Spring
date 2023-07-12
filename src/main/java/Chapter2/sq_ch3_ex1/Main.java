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

        human.setParrot(TestContext.getBean(Parrot.class));
    }

    public static void main(String[] args) {

        Main main = new Main();

        Cat marysa = main.TestContext.getBean(Cat.class);
        Parrot parrot1 = main.TestContext.getBean(Parrot.class);
        Human Jac = main.TestContext.getBean(Human.class);
        Women Natalia = main.TestContext.getBean("Natalia", Women.class);

        marysa.setName("Marysa");
        System.out.println(Jac);
        System.out.println(parrot1);
        System.out.println(marysa);

        //Establishing communication "has a":

        System.out.println("Human Jac has a parrot " + Jac.getParrot().getName());
        System.out.println("Woman Natalia has a cat " + Natalia.getCat().getName());


    }
}
