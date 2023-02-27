package sample;

public class Sample8 {
    public static void main(String[] args) {
        int treeHit = 0;
        while (treeHit < 10) { //while 문의 조건문이 참인 동안 반복 수행됨
            treeHit += 1; //treeHit++과 같은 역할
            System.out.println("나무를 " + treeHit + "번 찍었습니다.");
            if (treeHit == 10) { //treeHit 이 더이상 10보다 작지 않기 때문에 밑 문장 출력하고 while 문 빠져나감
                System.out.println("나무 넘어갑니다.");
            }
        }

        int coco = 3;
        int money = 1500;
        while (money > 0) { //조건문이 항상 참이므로 무한하게 수행됨
            System.out.println("돈이 들어왔으니 코코팜을 준다.");
            coco--;
            System.out.println("자판기 내 남은 코코팜은 " + coco + "개 입니다.");
            if (coco == 0) {
                System.out.println("코코팜이 다 떨어졌으니 판매를 중지합니다.");
                break; //무한루프를 막기위해 break 로 while 문을 강제로 멈춤
            }
        }

        int zero = 0;
        while (zero < 10) {
            zero++;
            if (zero % 2 == 0) {
                continue; //짝수인 경우 다시 조건문으로 돌아감
            }
            System.out.println(zero);
        }
    }
}
