package sample;

public class Sample11 {
    public void shouldBeRun() {
        System.out.println("ok thanks.");
    }

    public static void main(String[] args) {
        Sample11 sample11 = new Sample11();
        int c;
        try { //예외가 발생하지 않을 때 try 문 수행
            c = 4 / 0;
        } catch (ArithmeticException e) { //예외에 해당하는 catch 문 수행
            //오류 객체 e를 통해 예외 클래스 ArithmeticException 의 변수나 메서드 호출
            c = -1;
        } finally { //예외와 상관없이 항상 수행
            sample11.shouldBeRun();
        }
    }
}
