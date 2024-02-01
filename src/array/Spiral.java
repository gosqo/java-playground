package array;

import java.util.Arrays;

public class Spiral {

    public static void main(String[] args) {

        Spiral spiral = new Spiral();
        int[][] arr = spiral.solution(10);

        for (int[] element : arr) {
            System.out.println(Arrays.toString(element));
        }
    }

    int[][] solution(int n) {
        int[][] arr = new int[n][n];
        int x = 0, y = 0;
        int cellCount = /*(int) Math.pow(n,2)*/ n * n;
        System.out.println(cellCount);

        // 0. 1 부터 cellCount 까지의 값을 생성.
        int value = 1; // arr[y][x] = value++ 할당, 증가

        xPlus(arr, n, x, y, value, cellCount);
        // 1. y 고정, x 를 증가시킴. x 의 최대값인 n-1 에 도달, 혹은 x+1 에 값이 존재함
//        while (true) {
//            arr[x++][y] = value++;
//            if (x == n || arr[y][x] != 0) {
//                x--;
//                y++;
//                // 다음 메서드 콜 x, y 인자로 넘김.
//                break;
//            }
//        }
//        // 2. x 고정, y 를 증가시킴. y 의 최대값인 n-1 에 도달, 혹은 y+1 에 값이 존재함
//        while (true) {
//            arr[x][y++] = value++;
//            if (y == n || arr[y][x] != 0) {
//                x--;
//                y--;
//                // 다음 메서드 콜 x, y 넘김
//                break;
//            }
//        }
//        // 3. y 고정, x 를 감소시킴. x 의 최소값인 0 에 도달, 혹은 x-1 에 값이 존재함
//        while (true) {
//            arr[x--][y] = value++;
//            if (x == -1 || arr[y][x] != 0) {
//                x++;
//                y--;
//                // 다음 메서드 콜 x, y 인자로 넘김.
//                break;
//            }
//        }
//        // 4. x 고정, y 를 감소시킴. y 의 최소값인 0 에 도달, 혹은 y-1 에 값이 존재함
//        while (true) {
//            arr[x][y--] = value++;
//            if (y == -1 || arr[y][x] != 0) {
//                x++;
//                y++;
//                // 다음 메서드 콜 x, y 넘김
//                break;
//            }
//        }
        // 5. 1. 로 회귀.


        return arr;
    }

    public void xPlus(int[][] arr, int n, int x, int y, int value, int cellCount) {
        while (true) {
            arr[y][x++] = value++;
            if (x == n || arr[y][x] != 0) {
                if (value == cellCount + 1) {
                    break;
                }
                x--;
                y++;
                // 다음 메서드 콜 x, y 인자로 넘김.
                yPlus(arr, n, x, y, value, cellCount);
                break;
            }
        }
    }

    public void yPlus(int[][] arr, int n, int x, int y, int value, int cellCount) {
        while (true) {
            arr[y++][x] = value++;
            if (y == n || arr[y][x] != 0) {
                if (value == cellCount + 1) {
                    break;
                }
                x--;
                y--;
                // 다음 메서드 콜 x, y 넘김
                xMinus(arr, n, x, y, value, cellCount);
                break;
            }
        }
    }

    public void xMinus(int[][] arr, int n, int x, int y, int value, int cellCount) {
        while (true) {
            arr[y][x--] = value++;
            if (x == -1 || arr[y][x] != 0) {
                if (value == cellCount + 1) {
                    break;
                }
                x++;
                y--;
                // 다음 메서드 콜 x, y 인자로 넘김.
                yMinus(arr, n, x, y, value, cellCount);
                break;
            }
        }
    }

    public void yMinus(int[][] arr, int n, int x, int y, int value, int cellCount) {
        while (true) {
            arr[y--][x] = value++;
            if (y == -1 || arr[y][x] != 0) {
                if (value == cellCount + 1) {
                    break;
                }
                x++;
                y++;
                // 다음 메서드 콜 x, y 넘김
                xPlus(arr, n, x, y, value, cellCount);
                break;
            }
        }
    }
}
