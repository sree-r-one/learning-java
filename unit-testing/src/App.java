public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Person person1 = new Person("Sree");
        System.err.println(person1.getName());
        person1.setName("Sreeraj");
        System.err.println(person1.getName());
    }
}
