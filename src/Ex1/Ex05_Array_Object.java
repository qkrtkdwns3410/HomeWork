package Ex1;

/*
객체 배열 ( Car[]...Person[] ) >> 배열은 주소값을 갖는다.

값 타입 배열 (int [] char[] ) >>배열의 값을 갖는다
 */
class Person {      //default class
    String name;        //default String
    int age;            //default int

    void print() {      //default void
        System.out.println(name + " : " + age);
    }
}

public class Ex05_Array_Object {
    public static void main(String[] args) {

        int[] intarr = new int[10]; //값 배열
        boolean[] boarr = new boolean[5];  //false (default) ..
        //값 타입 배열은 각 타입의 기본값(default) 들어 있다..

        //참조타입
        Person p = new Person();
        p.name = "홍길동";
        p.age = 100;
        //사람을 3명을 만드세요.
        Person[] personarr = new Person[3];
        //heap 3개의 방 ... 각각의 방은 Person 이라는 하는 타입을 가지는 객체에 주소를 담을 수 있는 것 뿐입니다.
        System.out.println("personarr: " + personarr);
        System.out.println("personarr[0] : " + personarr[0]);


        //방에는 주소값 >> Person 타입의 주소값(new)
        personarr[0] = new Person();
        personarr[1] = new Person();

        System.out.println("personarr[0]" + personarr[0]);
        System.out.println(personarr[0].age);
        System.out.println(personarr[0].name);

        personarr[0].name = "아무개";
        personarr[0].age = 100;

        System.out.println(personarr[0].age);
        System.out.println(personarr[0].name);

        //객체배열은 2번 작업 (방을 만들고 ,... 방을 채웁니다)
        personarr[2] = new Person();
        //객체 배열 (개선된 for문 : name 값만 출력
        System.out.println("---------------------------------------------------------------");
        for (int i = 0; i < personarr.length; i++) {
            System.out.println(personarr[i].name);

        }
        System.out.println("---------------------------------------------------------------");
        //2. int[] arr=  new int[]{1,2,3}
        Person[] parray2 = new Person[]{new Person(), new Person(), new Person()};

        //3. int[] arr = {1,2,3}
        Person[] parray3 = {new Person(), new Person(), new Person()};


    }

}

















