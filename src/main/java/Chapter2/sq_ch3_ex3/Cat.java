package Chapter2.sq_ch3_ex3;

import org.springframework.stereotype.Component;

@Component
public class Cat {
    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
