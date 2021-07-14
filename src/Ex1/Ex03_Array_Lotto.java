package Ex1;

/*
1. 1~45까지의 난수를 발생시켜서 6개의 배열방에 담으세요


2. 배열에 담긴 6개의 배열 값은 중복값이 나오면 안됩니다.

ex)
lotto[0] = 45;
난수 값을 추출 : 45 lotto[1]=45 (x) 다시 뽑아야합니다

 3. 배열에 담긴 6개의 값을 낮은 순으로 출력하시오 -정렬 -(버블) ( 꼼수 x)

4.결과 배열 6개 출력

class로 뺴서 함수 만들어서 하는 것은 별도의 문제로 나갑니다~~~~

//today 조별과제 입니다..!
//(2인 1조 혹은 같은 풀던지 )
//(각자 풀고 비교)


 */

public class Ex03_Array_Lotto {
    public static void main(String[] args) {

        int num;
        int[] lotto = new int[6];

        for (int i = 0; i < lotto.length; i++) {

            num = (int) (Math.random() * 45 + 1);

            lotto[i] = num;

            for (int j = 0; j < i; j++) {

                while (lotto[i] == lotto[j]) {
                    lotto[i] = (int) (Math.random() * 45 + 1); //값이 같으면 다시 랜덤값을 넣어줍니다.
                }
            }

            System.out.println(lotto[i]);

        }

        //버블소트 (Bubble sort)

        for (int i = 0; i < lotto.length-1; i++) {
            for (int j = 0; j < lotto.length - i - 1; j++) {

                if (lotto[j] > lotto[j + 1]) {

                    int temp = lotto[j];
                    lotto[j] = lotto[j+1];
                    lotto[j + 1] = temp;

                }
            }
        }

        for (int i = 0; i < lotto.length; i++) {
            System.out.printf("%d ", lotto[i]);
        }

//        for (int i : lotto) {
//            System.out.printf("%d ",i);
//        }



    }

}

