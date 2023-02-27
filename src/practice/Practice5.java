package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

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
        for (int i = 0; i < 10; i++) { System.out.println(fibonnaci(i)); }

        //Q9-5.

        //Q9-6.

        //Q9-7.

        //Q9-8.
    }
}
