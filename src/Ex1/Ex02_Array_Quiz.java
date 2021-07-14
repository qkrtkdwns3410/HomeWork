package Ex1;

public class Ex02_Array_Quiz {
    public static void main(String[] args) {
        //수학과 학생들의 기말고사 점수
        int[] score = new int[]{79, 88, 97, 54, 56, 95};
        int max = score[0];
        int min = score[0];

        /*
        제어문을 사용하여 max 라는 변수의 시험점수 중에서
        max 최대 : min최소
        max >> 97 , min >>54 나오게해라

        조건 : for문을 한번만 사용
         */

//        for (int i : score) {
//            if (i > max) {
//                max = i;
//            }
//            if (i < min) {
//                min = i;
//            }
//        }

        for (int i = 1; i < score.length; i ++) {
//            if (max < score[i]) {
//                max = score[i];
//                continue;
//            }
//            if (min > score[i]) {
//                min = score[i];
//            }

            //삼항 연산자가 더 직관적인거 같음..
            //개인적으로 맘에 드는 친구..

            max = (score[i] > max) ? score[i] : max;
            min = (score[i] < min) ? score[i] : min;
        }

        System.out.println("max : " + max + ", min : " + min);

    }

}

