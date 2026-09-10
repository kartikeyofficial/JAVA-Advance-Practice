package Revision.OOPs.Encapsulation;

public class GetterSetterTest {
    static void main(String[] args) {
        Getter getter = new Getter();
        getter.setColor("Red");
        System.out.println(getter.getColor());
        getter.setModel("BMW M4");
        System.out.println(getter.getModel());
    }
}
