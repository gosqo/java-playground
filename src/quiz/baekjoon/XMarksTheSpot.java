package quiz.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class XMarksTheSpot {
    public static void main(String[] args) throws IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
//        System.out.println(n);
        String[] arrS = new String[n];
        String[] arrT = new String[n];

        for (int i = 0; i < n; i++) {
//            System.out.println(line);
            StringTokenizer stFor = new StringTokenizer(br.readLine());
//            System.out.println(stFor.toString());
            arrS[i] = stFor.nextToken();
            arrT[i] = stFor.nextToken();
//            System.out.println(arrS[i]);
//            System.out.println(arrT[i]);
        }
//        br.close();

        int pointer = -1;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            pointer = arrS[i].indexOf('x') != -1
                    ? arrS[i].indexOf('x')
                    : arrS[i].indexOf('X') != -1
                        ? arrS[i].indexOf('X')
                        : -1;

            builder.append(arrT[i].charAt(pointer) >= 'a' && arrT[i].charAt(pointer) <= 'z'
                    ? Character.toUpperCase(arrT[i].charAt(pointer))
                    : arrT[i].charAt(pointer)
            );
        }
        System.out.println(builder.toString());

    }
}