package quiz;

abstract class Beverage {
    abstract void pour();
}

class Tea extends Beverage {
    @Override
    void pour() {
        System.out.println("Pouring Tea");
    }
}

class Coffee extends Beverage {
    @Override
    void pour() {
        System.out.println("Pouring Coffee");
    }
}

// class Test {
// public static void main(String[] args) {
// Beverage tea = new Coffee();
// tea.pour();
// }
// }
