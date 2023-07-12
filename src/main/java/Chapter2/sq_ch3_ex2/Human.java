package Chapter2.sq_ch3_ex2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Human {
    private final String Name = "Elena";
    private final Cat cat;
    private final Parrot parrot;

    @Autowired
    public Human(Cat cat, Parrot parrot) {
        this.cat = cat;
        this.parrot = parrot;
    }

    public String getName() {
        return Name;
    }

    public Cat getCat() {
        return cat;
    }

    public Parrot getParrot() {
        return parrot;
    }
}

