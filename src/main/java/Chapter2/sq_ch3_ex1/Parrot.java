package Chapter2.sq_ch3_ex1;

import org.springframework.stereotype.Component;

@Component
public class Parrot {

    private String name = "Kek";

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Parrot " +
                "name = " + name;
    }
}
