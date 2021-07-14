package Ex1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.SocketHandler;

/*
배열 이란?
1.같은 타입의 여러 변수를 하나의 묶음으로.
2.많은 양의 데이터를 다룰 떄 유용
3.배열의 각 요소는 서로 연속적

아파트 >> 1층 ~ 5층 같은 평수..
>> 동 과 호를 붙여서 구분하는 방식과 비슷합니다..
>>동 : 배열의 이름 ,  호: 배열의 공간

score[0] >> 여기에서 0을 index라고 부릅니다.

배열은 객체다 (Array)

    1. new를 통해서
    2. heap 메모리에서 생성
    3. 고정배열(정적) 배열 : 배열의 크기가 한번 정해지면 변경할 수 없습니다 (고정)    < - > Collection (동적배열)
    4. 같은 데이터를 표현하는 데 : 일반 변수,, or Array >> Array 쓰는 사람에게 추가 점수를 준다. : 자료구조 필수 요소입니다.


 */
public class Ex01_Array_Basic {
    public static void main(String[] args) {

        int s1, s2, s3, s4; //같은 타입의 정수.....

        int[] score = new int[3]; // new를 사용하면 정수형 방이 연속적으로 이어진 아파트 !! 의 배열을 만들 수 있습니다. >> 처음시작하는 방의 번호를 0번으로 생각합니다..
        // int라는 타입을 갖는 방 3개 연속적으로 생성합니다 .. 생성된 방은 ( 방번호 : index : 첨자 ) 방의 시작값은 : 0
        System.out.println(score[0]); //배열 타입은 default 값을 가집니다. 0 0 0이 세팅되어있습니다. >> 배열값 Read..

        score[0] = 101; //배열값을 Write
        score[1] = 102; //배열값을 Write
        score[2] = 103; //배열값을 Write
        System.out.println(score[0]); //n개의 방이라면 : 마지막 인덱스는 score[n-1]

        //방의 개수는 index(첨자) 값보다 1크다.

        for (int i : score) {
            System.out.println(i);
        }
        for (int i = 0; i < 3; i++) {
            System.out.printf("[%d]=[%d]\t" , i  ,score[i]);
        }
        System.out.println();
        //위는 잘 안씀  숫자를 지칭하려면 배열의 갯수를 알고 있어야합니다... 그래서!!!!!!!!!!!!!!!!!!!!

        for (int i = 0; i < score.length; i++) {
            System.out.printf("[%d]=[%d]\t" , i  ,score[i]);
        }
        System.out.println();

        //Tip Array 도와주는 클래스 (쓰지마세요.... - - >>초보자는 코드를 풀어서 쳐야합니다)


        //for 문을 쓰지 않아도 배열 방에 있는 값을 이쁘게 출력해줍니다.
        String resultArray = Arrays.toString(score);
        System.out.println(resultArray);

        //----------------------------------------------------------------------
        //입사시험
        //12, 8,1,20
        //낮은 값 순으로 출력
        int[] score2 = {12, 8, 1, 20};
        int max = 0;
        int min = 0;

        for (int i = 0; i < score2.length; i++) {
            for (int j = 0; j < score2.length - 1; j++) {
                if (score2[i] > max) {
                    max = score2[i];
                }
                if (score2[i] < min) {
                    min = score2[i];
                }
            }
        }
        for (int i : score2) {
            System.out.printf("%d ",i);
        }
//-----------------------------------------------------------------------------------
        //Today Point
        //암기
        //배열 생성 방법 3가지

        int[] arr = new int[5]; //기본
        int[] arr2 = new int[]{10, 20, 30}; //초기값을 정의해서 방을 만들고 초기화
        int[] arr3 = {11, 22, 33, 44, 55}; //컴파일러가 알아서
                                                        //내부적으로 new하고 값을 사용....
                                                        //let carArr = [1,2,3,4,5] >> es6의 경우 대괄호입니다
        System.out.println();

        //자바는 중괄호임
        for (int i : arr3) {
            System.out.println(i);
        }

        System.out.println();
        for (int i = 0; i < arr3.length; i++) {
            System.out.printf("%d ",arr3[i]);
        }
        System.out.println();

        //선언과 할당
        int[] arr4; //선언    arr4는 참조변수 (주소)
        arr4 = new int[]{21, 22, 23, 24, 25}; //할당

        System.out.println(arr4); //[I@61bbe9ba

        int[] arr5 = arr4; //주소값의 할당 arr5 과 arr4는 같은 배열을 바라보고있습니다..
        System.out.println(arr4 == arr5); //true

        //Array 타입은 8가지 기본타입 + String + *** 사용자정의 타입(class) ***
        String[] strArr = new String[]{"가", "나", "다", "라", "마"};

        //----------------------------------------------------------------------

        for (String i : strArr) {
            System.out.printf("%s ",i);
        }

        char[] chArr = new char[10];
        for (int i = 0; i < chArr.length;i++) {
            System.out.println(">"+chArr[i]+"<");
        }

        //객체배열
        //class Car{  }
        //자동차 10대를 생상하세요

        //Car c =new Car(); Car c2 = new Car(); ..... >>No! >>
        //Car[] cars = new Car[10]; >>객체배열..


    }

}



























