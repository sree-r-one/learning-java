// abstract class A {
//     public void display();
// }

// class B extends A {
//     @Override
//     public void display() {
//         System.out.print("Two");
//     }

//     public void reset() {
//         System.out.print("Zero");
//     }
// }

// public class C {
//     public static void main(String args[]) {
//         A screen = new B();
//         screen.display();
//         screen.reset();
//     }
// }

abstract class Calculation {
    abstract void calculate(int number);
}

class Summation extends Calculation {
    int result;

    @Override
    public void calculate(int number) {
        this.result = number + number;
    }
}

class Main {
    public static void main(String args[]) {
        Summation summation = new Summation();
        summation.result = 0;
        summation.calculate(2);
        System.out.print(summation.result);
    }
}