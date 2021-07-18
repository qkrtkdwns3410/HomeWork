package Ex1;

import javax.swing.table.TableCellRenderer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean[] check = new boolean[10001]; //1부터 10000

        for (int i = 1; i < 10000; i++) {

            int n = d(i); //sum 값이 n에 담깁니다.
            if (n < 10001) {//10000이 넘는 수는 필요없습니다.
                check[n] = true;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < 10001; i++) {
            if (!check[i]) { //false인 인덱스만 출력합니다.
                sb.append(i).append('\n');

            }
        }
        System.out.println(sb);

    }

    public static int d(int num) {
        int sum = num;

        while (num != 0) {
            sum = sum + (num % 10); //첫째 자리수.
            num /= 10; //10을 나누어 첫 째의 자리를 없앱니다.
        }
        return sum;
    }
}

