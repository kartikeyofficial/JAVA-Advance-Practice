package Revision.OOPs.Inheritance;

import java.util.Objects;

public class EqualsAndHashCode {
    public String name;

    public EqualsAndHashCode(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof EqualsAndHashCode that)) return false;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    static void main(String[] args) {

        EqualsAndHashCode name1 = new EqualsAndHashCode("Kartikey");
        EqualsAndHashCode name2 = new EqualsAndHashCode("Kartikey");
        if (name1.equals(name2)){
            System.out.println("Equals");
        }else {
            System.out.println("Not Equals");
        }
        System.out.println(name2.hashCode());
    }
}
