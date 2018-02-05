package lanit.qa.firstjava;

public class MyFirstProgram {

    public static void main(String[] args) {
        func("world");
        func("user");
        func("Lena");

        Square s = new Square(6);
        System.out.println("Площадь квадрата со стороной " + s.m + " = " + s.area());

        Rectangle n = new Rectangle(4, 6);
        System.out.println("Площадь прямоугольника со сторонами " + n.a + " и " + n.b + " = " + n.area());
    }

    public static void func(String val) {
        System.out.println("Hello, " + val + "!");
    }
    }