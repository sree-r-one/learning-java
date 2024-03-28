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

class Test {
    public static void main(String[] args) {
        Beverage tea = new Coffee();
        tea.pour();
    }
}

// class Test {
// public static void main(String[] args) {
// Teacher yourTA = new TeachingAssistant();
// yourTA.grade();
// yourTA.officeHour();
// }
// }

abstract class Teacher {
    public Teacher() {
        System.out.println("New Teacher created");
    }

    abstract void grade();

    void officeHour() {
        System.out.println("Office Hours");
    }
}

class TeachingAssistant extends Teacher {
    @Override
    void grade() {
        System.out.println("Grade your hw7 now");
    }
}
// class Test {
// public static void main(String[] args) {
// Beverage tea = new Coffee();
// tea.pour();
// }
// }

// abstract class Base {
// void fun() {
// System.out.println("Base fun() called");
// }
// }

// class Derived extends Base {
// }

// class Main {
// public static void main(String args[]) {
// Base b = new Derived();
// b.fun();
// }
// }

abstract class Base {
    void fun() {
        System.out.println("Base fun() called");
    }
}

class Derived extends Base {
    @Override
    void fun() {
        System.out.println("Fun overwritten!");
    }
}

// class Main {
// public static void main(String args[]) {
// Base b = new Derived();
// b.fun();
// }
// }
