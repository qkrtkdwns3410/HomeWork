package Ex1;

public class Ex04_Array_for {
    public static void main(String[] args) {
        //TodayPoint
        //개선된 for문 ( 향상된 for 문)
        //JAVA : for(type 변수명 : array or collection) {실행}
        //C#    : for(type 변수명 in array or collection) {실행}
        //JAVAScript : for(type 변수명 in 배열) {실행블럭}

        int[] arr = {5, 6, 7, 8, 9};
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
       System.out.println("\n---------------------------------------------------------------");
        //개선된 for 문

        for (int i : arr) {     //논리가 생략되어 있습니다... 컴파일러가 ..... //거꾸로 돌지는 못합니다.. 순방향만 가능합니다...
            System.out.printf("%d ", i);
        }
        System.out.println("\n---------------------------------------------------------------");
        String[] strArr = {"A", "B", "C", "D", "FFFFF"};
        for (String str : strArr) {
            System.out.println(str);
        }
        System.out.println("---------------------------------------------------------------");
    }

}

