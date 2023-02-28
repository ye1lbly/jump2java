package practice;

import java.awt.*;
import java.util.*;

public class Practice5 {
    static int fibonnaci(int init) {
        if (init == 0) {
            return 0;
        } else if (init == 1) {
            return 1;
        } else {
            return fibonnaci(init - 2) + fibonnaci(init - 1);
        }
    }

    public static void main(String[] args) {
        //Q9-1.
        String s = "a:b:c:d";
        System.out.println(s);

        String[] data = s.split(":"); //split 메서드를 사용해 문자열 s 를 :을 기준으로 나눈 후 문자열 배열로 변환
        System.out.println(Arrays.toString(data));

        String result = String.join("#", data);
        System.out.println(result);

        //Q9-2.
        HashMap<String, Integer> h = new HashMap<>();
        h.put("B", 80);
        System.out.println(h.getOrDefault("C", 70)); //h Map 에는 C 라는 key 가 없으므로 null 이 출력되겠지만, getOrDefault 를 통해 값을 얻을 수 있게 함

        //Q9-3.
        int[] A = {20, 55, 67, 82, 45, 33, 90, 87, 100, 25};
        int a = Arrays.stream(A).filter((n) -> n >= 50).sum();
        System.out.println(a);

        //Q9-4.
        for (int i = 0; i < 10; i++) { System.out.print(fibonnaci(i) + " "); }

        //Q9-5.
        Scanner sc = new Scanner(System.in); //Scanner 클래스를 사용하기 위해 인스턴스 생성
        System.out.print("출력을 원하는 구구단 숫자를 입력하시오 : "); //print 를 사용하면 줄바꿈 없이 값 출력 (println 을 사용하면 줄바꿈된 출력값 확인 가능)
        int num = sc.nextInt(); //콘솔에서 숫자 입력 받음
        for (int p = 1; p < 10; p++) { System.out.printf("%d ", num * p); }

        //Q9-6.
        int[] user = {65, 45, 2, 3, 45, 8};
        int u = Arrays.stream(user).sum();
        System.out.println(u);

        //Q9-7.
        String[] abc = {"AAA", "BBB", "CCC", "DDD", "EEE"};
        ArrayList<String> alphabet = new ArrayList<>(Arrays.asList(abc));
        alphabet.sort(Comparator.reverseOrder());
        System.out.println(alphabet);

        //Q9-8.
        double[] sample = {70, 60, 55, 75, 95, 90, 80, 80, 87, 100};
        double sum = Arrays.stream(sample).sum();
        System.out.println(sum);

        double avg = sum / sample.length;
        System.out.println(avg); //소수점까지 표현해주기 위해 int 대신 double 로 수정


    }
}
