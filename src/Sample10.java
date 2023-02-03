class Calculator {
    int result = 0;
    int add(int num) {
        result += num;
        return result;
    }
    int sub(int num) {
        result -= num;
        return result;
    }
}

public class Sample10 {
    int sum(int a, int b) { //입력값과 리턴값이 있는 일반적인 매소드, 매개변수 a, b
        return a + b;
    }

    public static void main(String[] args) {
        Calculator cal1 = new Calculator(); //계산기1 객체 생성
        Calculator cal2 = new Calculator(); //계산기2 객체 생성

        System.out.println(cal1.sub(3));
        System.out.println(cal1.add(4));

        System.out.println(cal2.add(3));
        System.out.println(cal2.add(7));
    }
}
