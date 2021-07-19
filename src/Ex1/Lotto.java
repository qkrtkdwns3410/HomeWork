package Ex1;

public class Lotto {
    static int[] lo = new int[6];
    public int num = (int) (Math.random() * 45 + 1);

    public Lotto() {
    }


    public void bubbleSort() {

        for (int i = 0; i < lo.length - 1; i++) {

            for (int j = 0; j < lo.length - i - 1; j++) {

                if (lo[j] > lo[j + 1]) {

                    int temp = lo[j];
                    lo[j] = lo[j + 1];
                    lo[j + 1] = temp;

                }
            }
        }
    }


    public void lottoDiff() {

        for (int i = 0; i < lo.length; i++) {

            for (int j = 0; j < i; j++) {

                while (lo[i] == lo[j]) {
                    lo[i] = (int) (Math.random() * 45 + 1); //값이 같으면 다시 랜덤값을 넣어줍니다.
                }

            }

        }
    }

    public void lottoPick() {

        for (int i = 0; i < lo.length; i++) {

            lo[i] = num;
        }

    }

    public void print(int[] lotto) {
        for (int i : lotto) {
            System.out.println(i);
        }
    }

}

























