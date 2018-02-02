package lanit.qa.firstjava;

public class MyFirstProgram {

    public static void main(String[] args) {
        func("world");
        func("user");
        func("Lena");

        double m = 6;
        System.out.println("Площадь квадрата со стороной " + m + " = " + area(m));

        double a = 4;
        double b = 6;
        System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " = " + area(a, b));
    }

    public static void func(String val) {
        System.out.println("Hello, " + val + "!");
    }

    public static double area(double len){
        return len * len;
    }

    public static double area(double a, double b) {
    return a * b;
    }
    }