package quiz.softeer.lv3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class PhiSquared {
    public static void main(String[] args) throws IndexOutOfBoundsException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        List<Integer> keyList = new ArrayList<>();
        List<Integer> valueList = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < count; i++) {
            keyList.add(i + 1);
            valueList.add(Integer.parseInt(st.nextToken()));
        }


        // System.out.println(keyList + " <- keyList");
        // System.out.println(valueList + " <- valueList");

        int pointer = 0;

        while (true) {
            // System.out.println(pointer + " <- pointer at.");

            Integer currentValue;
            Integer nextValue;
            Integer previousValue;

            if (pointer == 0) {
                currentValue = valueList.get(pointer);
                nextValue = valueList.get(pointer + 1);

                if (currentValue >= nextValue) {
                    valueList.set(pointer, currentValue + nextValue);

                    keyList.remove(pointer + 1);
                    valueList.remove(pointer + 1);

                    // System.out.println("=====================");
                    // System.out.println(keyList + " <- keyList");
                    // System.out.println(valueList + " <- valueList");
                    // System.out.println("=====================");
                    // System.out.println(keyList.size() + " <- keyList.size() after set");

                }

            } else if (pointer == keyList.size() - 1) {
                currentValue = valueList.get(valueList.size() - 1);
                previousValue = valueList.get(valueList.size() - 2);

                if (currentValue >= previousValue) {
                    valueList.set(pointer, currentValue + previousValue);

                    keyList.remove(pointer - 1);
                    valueList.remove(pointer - 1);

                    // System.out.println("=====================");
                    // System.out.println(keyList + " <- keyList");
                    // System.out.println(valueList + " <- valueList");
                    // System.out.println("=====================");
                    // System.out.println(keyList.size() + " <- keyList.size() after set");

                }

            } else {

                currentValue = valueList.get(pointer);
                nextValue = valueList.get(pointer + 1);
                previousValue = valueList.get(pointer - 1);

                if (currentValue >= nextValue && currentValue >= previousValue) {
                    valueList.set(pointer, currentValue + previousValue + nextValue);

                    keyList.remove(pointer + 1);
                    keyList.remove(pointer - 1);
                    valueList.remove(pointer + 1);
                    valueList.remove(pointer - 1);

                    // System.out.println("=====================");
                    // System.out.println(keyList + " <- keyList");
                    // System.out.println(valueList + " <- valueList");
                    // System.out.println("=====================");
                    // System.out.println(keyList.size() + " <- keyList.size() after set");

                } else if (currentValue >= nextValue && currentValue < previousValue) {
                    valueList.set(pointer, currentValue + nextValue);

                    keyList.remove(pointer + 1);
                    valueList.remove(pointer + 1);

                    // System.out.println("=====================");
                    // System.out.println(keyList + " <- keyList");
                    // System.out.println(valueList + " <- valueList");
                    // System.out.println("=====================");
                    // System.out.println(keyList.size() + " <- keyList.size() after set");

                } else if (currentValue < nextValue && currentValue >= previousValue) {
                    valueList.set(pointer, currentValue + previousValue);

                    keyList.remove(pointer - 1);
                    valueList.remove(pointer - 1);

                    // System.out.println("=====================");
                    // System.out.println(keyList + " <- keyList");
                    // System.out.println(valueList + " <- valueList");
                    // System.out.println("=====================");
                    // System.out.println(keyList.size() + " <- keyList.size() after set");

                    pointer--;

                }

            }

            if (pointer == keyList.size()) pointer = 0;
            pointer++;
            if (keyList.size() == 1) {
                break;
            }

        } // while ends.

        System.out.println(valueList.get(0));
        System.out.println(keyList.get(0));

    }

}
