package sample;

import java.util.ArrayList;

//Thread 클래스를 상속하면 다른 클래스 상속 불가능 -> Runnable 인터페이스 구현하는 방식으로 수정
public class Sample12 implements Runnable {
    int seq;
    public Sample12(int seq) {
        this.seq = seq;
    }

    @Override
    public void run() { //Thread 를 상속 -> run 메소드 구현
        System.out.println(this.seq + " thread start."); //Thread 시작 지점
        try {
            Thread.sleep(1000); //1초 대기
        } catch (Exception e) {}
        System.out.println(this.seq + " thread end."); //Thread 종료 지점

        work();
    }

    //Q7-3.
    String name;
    Sample12(String name) {
        this.name = name;
    }

    public void work() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(100); //0.5초 정도 대기
            } catch (Exception e) {}
        }
        System.out.printf("%s done.\n", this.name);
    }

    public static void main(String[] args) throws InterruptedException {
        ArrayList<Thread> threads = new ArrayList<>(); //Thread 생성시 threads 리스트에 저장
        for (int i = 0; i < 10; i++) { //총 10개의 Thread 생성 및 동시 실행
            Thread t = new Thread(new Sample12(i));
            t.start(); //start() 실행시 Thread 클래스의 run 메소드 수행
            threads.add(t);
        }

        for (int i = 0; i < threads.size(); i++) {
            Thread t = threads.get(i);
            try {
                t.join(); //저장한 Thread t 가 종료할 때까지 대기
            } catch (Exception e) {}
        }
        System.out.println("main end.");

        long start = System.currentTimeMillis();
        ArrayList<Thread> threads2 = new ArrayList<>();
        for (int i = 1; i < 5; i++) {
            Thread t2 = new Thread(new Sample12("w" + i));
            threads2.add(t2); //thread 저장
            t2.start();
        }
        for (Thread t2 : threads2) {
            t2.join();
        }
        long end = System.currentTimeMillis();
        System.out.printf("elapsed time : %s ms\n", end - start);
    }
}
