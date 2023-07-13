package Chapter2.sq_ch3_ex3;

import org.springframework.beans.factory.annotation.Autowired;


public class Person {
    private Cat cat;
    private String Name;

    public Person(String Name) {
        this.Name = Name;
    }

    public Cat getCat() {
        return cat;
    }

    @Autowired
        public void setCat(Cat cat) {
        this.cat = cat;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
