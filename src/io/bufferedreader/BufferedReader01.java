package io.bufferedreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReader01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = 0;
        boolean bl = br.ready();
        String str1 = "";


        while (true) {

            try {
                n = Integer.parseInt(br.readLine());
                str1 = br.readLine();
                if (n == 0){

                    throw new NumberFormatException("Integer only.");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
                br = new BufferedReader(new InputStreamReader(System.in));
            }

        }
        boolean bl2 = br.ready();

        System.out.println(n);
        System.out.println(bl);
        System.out.println(bl2);
        System.out.println(str1);
    }
}
