package Chapter2.sq_ch3_ex2;

import org.springframework.stereotype.Component;


public class Parrot {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parrot name=" + name;
    }
}
