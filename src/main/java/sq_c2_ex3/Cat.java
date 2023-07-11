package sq_c2_ex3;

import org.springframework.stereotype.Component;


public class Cat {
    private final String say = "Mew";
    public synchronized String getSay() {
        return say;
    }
}
