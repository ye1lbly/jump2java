import java.util.ArrayList;
import java.util.Arrays;

public class Sample6 {
     public static void main(String[] args) {
          int cash = 1000;
          boolean card = true; //카드 가능
          boolean line = false; //대기줄 없음
          String[] bags = {"note", "airpod", "pouch"};
          ArrayList<String> bag = new ArrayList<>(Arrays.asList(bags));

          if (bag.contains("airpod")) { //리스트의 contaions method 활용
               System.out.println("노래 들으며 가자~");
          } else {
               System.out.println("주변 풍경이나 보자,,ㅎ");
          }

          if (cash >= 2000 || card) { //if(조건)문, 현금 또는 카드
               System.out.println("집에 붕어빵 사가자!!");
          }else if (cash >= 1000 && !line) { //else if문은 다중조건 판단을 가능하게 함, 바로위 if문이 거짓일 때 수행됨, 사용 개수에 제한이 없음
               // !~는 ~가 거짓이면 참이라는 뜻, 돈 천원이상은 갖고 있고 대기줄은 없음
               System.out.println("붕어빵 딱 천원어치만 먹지 뭐,,");
          }else {
               System.out.println("집 가자ㅠ");
          }
     }
}
