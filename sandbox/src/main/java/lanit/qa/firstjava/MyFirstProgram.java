package lanit.qa.firstjava;

public class MyFirstProgram {

    public static void main(String[] args) {
        func("world");
        func("user");
        func("Lena");

        Square s = new Square(6);
        System.out.println("Площадь квадрата со стороной " + s.m + " = " + area(s));

        Rectangle n = new Rectangle(4, 6);
        System.out.println("Площадь прямоугольника со сторонами " + n.a + " и " + n.b + " = " + area(n));
    }

    public static void func(String val) {
        System.out.println("Hello, " + val + "!");
    }

    public static double area(Square s){
        return s.m * s.m;
    }

    public static double area(Rectangle n) {
    return n.a * n.b;
    }
    }