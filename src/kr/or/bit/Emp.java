package kr.or.bit;

/*
Emp emp = new Emp(); //>> 사실 Emp() 가 기본 생성자의 호출입니다..!
or
Emp emp = new Emp(100,"김유신") >> 도 가능합니다.. 2개의 값을 내가 받아서 >> Emp클래스의 인스턴스 변수를 초기화 시킨다는 의미입니다.

 */
public class Emp {
    private int empno;
    private String ename;


    //함수인데 특수한 목적의 함수
    //생성자 함수
    //리턴 타입이 없고 , 함수의 이름 : 클래스 이름
    //생성자 함수는 member field 초기화를 목적으로 사용됩니다.

    public Emp() {        //default constructor //기본 생성자..
        System.out.println("기본 생성자");
    }

    public Emp(int empno, String ename) {       //초기화
        this.empno = empno;
        this.ename = ename;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void empInfo() {
        System.out.printf("사번 : [%d], 이름 : [%s] 입니다\n", empno, ename);

    }
}
















