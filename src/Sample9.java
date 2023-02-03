//for문은 while문과 마찬가지로 반복 수행할 때 쓰임

public class Sample9 {
    public static void main(String[] args) {
        int[] score = {90, 25, 67, 45, 80};
        for(int i = 0; i < score.length; i++) { //초기치; 조건문; 증가치(조건문을 만족시키는 동안)
            if (score[i] >= 60) {
                System.out.println((i + 1) + "번 학생은 합격입니다.");
            }else {
                System.out.println((i + 1) + "번 학생은 불합격입니다.");
            }
        }

        for(int i = 2; i < 10; i++) {
            for(int j = 1; j < 10; j++) { //이중 for문 이용하여 구구단 출력
                System.out.print(i * j + " ");
            }
            System.out.println(""); //줄바꿈 역할
        }
    }
}