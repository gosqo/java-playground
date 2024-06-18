package staticfield;

public class StaticField01 {

    public static void main(String[] args) {
        int a;
        a = 10;
        Static st2 = new Static();
        System.out.println(st2.b);
        Static.b = a;

        Static st = new Static();

        System.out.println(Static.b++);
        System.out.println(st.b);
        System.out.println(a);
        System.out.println(st.a);
    }
}

class Static {

    public int a = 20;
    static int b = 0;

}