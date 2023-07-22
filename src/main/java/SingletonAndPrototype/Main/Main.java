package SingletonAndPrototype.Main;

import SingletonAndPrototype.Config.Config;
import SingletonAndPrototype.Model.Human;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        Human name1 = context.getBean("HumanP", Human.class);
        Human name2 = context.getBean("HumanS", Human.class);

        System.out.println("-----------------------------------");

        Human testP = context.getBean("HumanP", Human.class);
        System.out.println(name1 == testP);
        System.out.println(name1.equals(testP));

        System.out.println("-----------------------------------");

        Human testS = context.getBean("HumanS", Human.class);
        System.out.println(name2 == testS);
        System.out.println(name2.equals(testS));

       context.close();
    }
}
