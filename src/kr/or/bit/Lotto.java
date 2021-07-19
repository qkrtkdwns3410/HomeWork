package kr.or.bit;

import javafx.scene.control.TreeTableCell;

import java.util.Random;
import java.util.Scanner;

// 1. 정보 (데이터) : 6개의 정수
public class Lotto {

    private int[] numbers; //멤버는 무조건 캡슐화..
    private Scanner sc;
    private Random r;
    //3개의 자원은 모든 함수에서 사용 가능합니다.

    //원칙 : 생성자 함수 public Lotto(){}
    {//초기자
        numbers = new int[6];
        sc = new Scanner(System.in);
        r = new Random();
    }

    //기능
    //공통함수(private 내부에서 쓰이는 함수)
    //일반함수 ( public ....)
    //실번호 추ㅜㄹ해 주세요
    //중복값 나오면 안돼요
    //낮은 순으로 정렬해 주세요
    //화면에 출력해 주세요
    //메뉴 기능을 만들어 주세요

    public void selectLottoNumber() {

        loop_1:while (true) {

            String selectnum = showMenu();
            switch (selectnum) {

                case "1":
                    do {
                        makeLottoNumbers();
                    } while (!checkAverage()); //return true >> false 탈출
                    showSortLottoNumbers();
                    break;

                case "2": //프로그램 종료 >> 함수종료 (return) , 프로세스의 종료료:
                    break loop_1; //루프문을 벗어납니다. >> 탈출해라 (라벨)로... >> (while)탈출
                default:
                    System.out.println("not  in operation ~~");
                    break; //스위치 탈출.. while문 또 돕니다..
            }
       }
    }

    private boolean checkAverage() {
        int sum = 0;
        int avg = 0;
        for (int num : numbers) {
            sum += num;
        }
        avg = sum / numbers.length;
        System.out.println("평균 : " + avg);
        return (avg >= 15 && avg <= 35); //true(ok) , false(재추출)
    }

    private String showMenu() {
        System.out.println("****************************");
        System.out.println("***1. 당첨 예상 번호추출***");
        System.out.println("***2. 프로그램         종료***");
        System.out.println("***********************");
        System.out.println("원하는 메뉴 번호를 입력하세요");
        String selectNum = sc.nextLine();
        return selectNum;
    }

    private void makeLottoNumbers() {
        //번호 추출 , 중복값 제거
        for (int i = 0; i < 6; i++) {
            numbers[i] = r.nextInt(45)+1; //(int)(Math.random()*45+1);
            for (int j = 0; j < 6; j++) {
                if (numbers[i] == numbers[j]) {
                    i--;
                    break;
                }
            }
        }
    }

    private void showSortLottoNumbers() {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println("[ 선택한 Lotto번호 ]");
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("[%2d]",numbers[i]);
        }
        System.out.println();
    }




}

























