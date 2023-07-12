package Chapter2.sq_ch3_ex2;

import org.springframework.stereotype.Component;

@Component
public class Cat {
    private String name = "Alex";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat name = " + name;
    }


}
