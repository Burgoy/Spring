package Chapter2.sq_ch3_ex3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ConfigClass.class);
        Person Alex = context.getBean("Vania", Person.class);
        Alex.getCat().setName("Myrzik");
        System.out.println(Alex.getCat().getName());
    }
}
