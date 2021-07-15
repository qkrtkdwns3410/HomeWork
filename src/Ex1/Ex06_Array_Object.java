package Ex1;

import kr.or.bit.Emp;

import java.util.Scanner;

public class Ex06_Array_Object {
    public static void main(String[] args) {
/*
1. 사원 3명을 만드세요 (단, 배열을 만드세요)
  사번        이름
 1000,      홍길동
 2000,      유관순
 3000,      김유신
 사번과 이름을 가지게 하십시오.


* */
        Scanner sc = new Scanner(System.in);

        Emp[] empArr = new Emp[3];
//        for (int i = 0; i < empArr.length; i++) {
//            empArr[i] = new Emp();
////            System.out.println((i+1)+"번째 사원의 사번을 입력해주세요 : ");
////            empArr[i].setEmpno(Integer.parseInt(sc.nextLine()));
////            System.out.println((i+1)+"번째 사원의 성명을 입력해주세요 : ");
////            empArr[i].setEname(sc.nextLine());
//
//        }
        for (int i = 0; i < empArr.length; i++) {
            empArr[i] = new Emp();
        }
        empArr[0].setEmpno(1000);
        empArr[1].setEmpno(2000);
        empArr[2].setEmpno(3000);
        empArr[0].setEname("홍길동");
        empArr[1].setEname("유관순");
        empArr[2].setEname("김유신");

        System.out.println("사원들의 사번과 이름을 출력하겠습니다.");

        for (int i = 0; i < empArr.length; i++) {
            empArr[i].empInfo();
        }

        //2.생성자 함수 (member field 초기화)
        Emp[] emplist2 = new Emp[]{new Emp(1, "이씨"), new Emp(2, "김씨"), new Emp(3, "박씨")};
        for (Emp emp : emplist2) {
            emp.empInfo();
        }

        Emp[] emplist3 = {new Emp(1, "이씨"), new Emp(2, "박씨"), new Emp(3, "김씨")};
        for (Emp emp : emplist3) {
            emp.empInfo();
        }
    }

}

