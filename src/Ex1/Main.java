package Ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
//1. StringBuffer 활용하는 방법
//        StringBuffer sb = new StringBuffer();
//        sb.append(str);
//        System.out.println(sb.reverse());

        //2. char 배열을 활용하는 방법
        char[] chArr = new char[str.length()];

        for (int i = 0; i < chArr.length; i++) {
            chArr[i] = str.charAt(i); //문자열을 한글자씩 담습니다.
        }
        for (int i = chArr.length - 1; i >= 0; i--) {
            System.out.printf("%s", chArr[i]);
        }

    }

}

