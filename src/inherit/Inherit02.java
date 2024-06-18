package inherit;

class Parent02 {
    int x = 100;

    Parent02() {
        this(500);
    }

    Parent02(int x) {
        this.x = x;
    }

    int getX() {
        return x;
    }
}

class Child02 extends Parent02 {
    int x = 4000;

    Child02() {
        this(5000);
    }

    Child02(int x) {
        this.x = x;
    }
}

public class Inherit02 {
    public static void main(String[] args) {

        Child02 obj = new Child02();
        Parent02 obj2 = new Child02();
        Parent02 obj3 = new Parent02();

        System.out.println(System.identityHashCode(obj));
        System.out.println(System.identityHashCode(obj2));
        System.out.println(System.identityHashCode(obj3));
        System.out.println(obj.getX());
        System.out.println(obj.x);
        System.out.println(obj2.getX());
        System.out.println(obj2.x);
        System.out.println(obj3.getX());
        System.out.println(obj3.x);

    }
}
