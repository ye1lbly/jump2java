import java.util.ArrayList;

//Thread 클래스를 상속하면 다른 클래스 상속 불가능 -> Runnable 인터페이스 구현하는 방식으로 수정
public class Sample12 implements Runnable {
    int seq;
    public Sample12(int seq) {
        this.seq = seq;
    }

    public void run() { //Thread 를 상속 -> run 메소드 구현
        System.out.println(this.seq + " thread start."); //Thread 시작 지점
        try {
            Thread.sleep(1000); //1초 대기
        } catch (Exception e) {}
        System.out.println(this.seq + " thread end."); //Thread 종료 지점
    }

    public static void main(String[] args) {
        ArrayList<Thread> threads = new ArrayList<>(); //Thread 생성시 threads 에 저장
        for (int i = 0; i < 10; i++) { //총 10개의 Thread 생성 및 동시 실행
            Thread t = new Thread(new Sample12(i));
            t.start(); //start() 실행시 Thread 클래스의 run 메소드 수행
            threads.add(t);
        }

        for (int i = 0; i < threads.size(); i++) {
            Thread t = threads.get(i);
            try {
                t.join(); //Thread t 가 종료할 때까지 대기
            } catch (Exception e) {}
        }
        System.out.println("main end.");
    }
}
