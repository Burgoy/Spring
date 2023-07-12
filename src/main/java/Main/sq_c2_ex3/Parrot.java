package Main.sq_c2_ex3;

import org.springframework.stereotype.Component;

@Component
public class Parrot {
    private String name = "Default name";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
