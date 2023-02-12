package calculator;

class Calculator {

    int result = 0;

    int sub(int num) {
        result -= num;
        return result;
    }

    //Q5-1.
    int value;

    Calculator() {
        this.value = 0 ;
    }

    void add(int val) {
        this.value += val;
    }

    int getValue() {
        return this.value;
    }

    //Q5-3.
    boolean isOdd(int t) {
        return t % 2 == 1;
    }

    //Q5-4.
    int[] data = {1, 3, 5, 7, 9};
    int sum = 0;
    void add(int[] data) {
        for (int dataArray: data) {
            sum += dataArray;
        }
    }
//    void avg(int[] data) {
//        add % data.length;
//    }

    public static void main(String[] args) {
        Calculator cal1 = new Calculator(); //계산기1 객체 생성
        Calculator cal2 = new Calculator(); //계산기2 객체 생성
        Calculator cal3 = new Calculator();

        System.out.println(cal1.sub(3));

        UpgradeCalculator cal = new UpgradeCalculator();
        cal.add(10);
        cal.minus(7);

        System.out.println(cal.getValue());

        MaxLimitCalculator MCal = new MaxLimitCalculator();
        MCal.add(60);
        MCal.add(50);

        System.out.println(MCal.getValue());

        System.out.println(cal2.isOdd(5));
        System.out.println(cal2.isOdd(2));

//        int average = cal3.avg(data);
//        System.out.println(average);
    }
}
