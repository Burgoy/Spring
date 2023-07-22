package SingletonAndPrototype.Model;

import java.util.Objects;


public class Human {
    private String Name;

    public Human() {
        System.out.println("Class Human has create");
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(Name, human.Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name);
    }
}
