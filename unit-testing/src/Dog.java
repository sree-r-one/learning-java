
public class Dog extends Animal {
    public Dog(String name) {
        super(4, name);

    }

    @Override
    public void walk() {
        System.out.println("Walking like a Dog");
    }

}
