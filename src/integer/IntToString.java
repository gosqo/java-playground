package integer;

public class IntToString {
    public static void main(String[] args) {
        int a = 99;
        int b = 19;
        int ab = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        System.out.println(ab);
    }
}
