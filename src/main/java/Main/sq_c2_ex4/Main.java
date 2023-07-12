package Main.sq_c2_ex4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
       var context = new AnnotationConfigApplicationContext(ConfigClass.class);

       Parrot parrot = new Parrot();
        parrot.setName("miki");

       context.register(null, Parrot.class);//Регистрируем Parrot

        Supplier<Parrot> ParrotSupplier = () -> parrot; //Добавили Supplier для возврата экземпляра Parrot

        context.registerBean((String) null, Parrot.class, ParrotSupplier);//Вместо имени экземпляра поставил null
        context.registerBean(
                "parrot1",
                Parrot.class,
                ParrotSupplier,
                bd -> {bd.setPrimary(true);}
        );//Добавили другой бин


        Parrot p = context.getBean(Parrot.class);
        Parrot p1 = context.getBean(Parrot.class);

        p1.getName();

        p.getName();
    }
}
