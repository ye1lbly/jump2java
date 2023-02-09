package calculator;

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

    public static void main(String[] args) {
        Calculator cal1 = new Calculator(); //계산기1 객체 생성
        Calculator cal2 = new Calculator(); //계산기2 객체 생성

        System.out.println(cal1.sub(3));
        System.out.println(cal1.add(4));

        System.out.println(cal2.add(3));
        System.out.println(cal2.add(7));
    }
}
