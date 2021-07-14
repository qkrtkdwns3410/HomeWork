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

//----------------------------------------------------------------------
        //10개의 정수방이 만들어지고, 그방에는 default값 : 0
        //10개의 방에 있는 값을 1~10까지의 정수로 초기화 시키세요.

        //new!!!!>> 배열은 객체!

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
            System.out.println(numbers[i]);
        }
        //----------------------------------------------------------------------
        System.out.println("----------------------------------------------------------------------");
        //어느 학생의 기말고사 시험점수 ( 5과목 )
        int sum = 0;
        float avg = 0.0f;
        int[] jumsu = {100, 55, 90, 60, 78};
        /*
        1. 총 과목의 수 구하셈 ㅇㅇ
        2. 과목의 합 구하셈 ㅇㅇ
        3. 과목의 평균 구하셈 ㅇㅇ = sum/과목수

       단 2,3번은 하나의 for 으로 해결하세요.

        아니 for문 하나만 쓰라매 if 쓰라는 말이 없었는데 갑자기 if를 추가해버리노

         */

        System.out.println("1. 과목의 수: " + jumsu.length);
        for (int i = 0; i < jumsu.length; i++) {
            sum += jumsu[i];
            if (i == jumsu.length - 1) {
                avg = sum / (float) jumsu.length;
            }
        }
        System.out.println("2. 과목의 합 : " + sum);
        System.out.println("3. 과목의 평균 : "+avg);
    }

}

