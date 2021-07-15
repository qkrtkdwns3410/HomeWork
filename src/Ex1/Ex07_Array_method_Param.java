package Ex1;

import java.util.Random;

class Human {
    String name;
}

class OverTest {
    int add(int i, int j) {
        return i + j;
    }

    void objectAdd(Human human) { // Point : human이라는 타입을 가지는 객체의 [주소] 값
        System.out.println(human.name);
    }

    //Today Point  : 배열은 객체다
    int[] arrAdd(int[] param) { //int []의 주소값을 받아서 돌다가 ... int[] 주소값을 리턴해라...
        int[] target = new int[param.length]; //파라매터로 받은 객체와 같은 길이로 설정합니다
        for (int i = 0; i < target.length; i++) {
            target[i] = param[i] + 1;
        }
        return target;
    }

    int[] arrAdd2(int[] so, int[] so2) {

        int soLength = 0;

        if (so.length > so2.length) {
            soLength = so2.length;
        } else {
            soLength = so.length;
        }

        int[] plus3 = new int[soLength];

        for (int i = 0; i < soLength; i++) {
            plus3[i] = so[i] + so2[i];
        }

        return plus3;
    }
}



public class Ex07_Array_method_Param {
    public static void main(String[] args) {
        OverTest ot = new OverTest();
        int result = ot.add(10, 20);
        System.out.println("result : " + result);

        Human h = new Human();
        h.name = "슈퍼맨";
        ot.objectAdd(h);

        System.out.println("---------------------------------------------------------------");

        int[] source = {10, 20, 30, 40, 50};
        int[] target = ot.arrAdd(source);

        for (int value : target) {
            System.out.println(value);
        }
        System.out.println("---------------------------------------------------------------");

        int[] plus1 = new int[]{10, 20, 30, 40, 50, 70, 80};
        int[] plus2 = new int[]{20, 30, 40, 50, 60};
        int[] plus3 = ot.arrAdd2(plus1, plus2);

        for (int i : plus3) {
            System.out.println(i);
        }
    }

}

