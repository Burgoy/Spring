package Chapter2.sq_ch3_ex2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Human {
    private final String Name = "Elena";

    @Autowired
    private Cat cat;

    @Autowired
    private Parrot parrot;

    public String getName() {
        return Name;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Parrot getParrot() {
        return parrot;
    }

    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }
}

