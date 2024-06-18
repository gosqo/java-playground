package inherit;

class Parent03 {
    void show() {
        System.out.println("Parent");
    }
}

class Child03 extends Parent03 {
    void show() {
        System.out.println("Child");
    }
}

public class Inherit03 {


    public static void main(String[] args) {


        Parent03 pa = new Child03();
        pa.show();
    }
}
