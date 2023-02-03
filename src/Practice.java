import java.util.*;

public class Practice {
    enum CoffeeType{ //상수집합
        AMERICANO, ICE_AMERICANO, CAFE_LATTE
    };

    static void priceCoffee(CoffeeType type) { //상수집합을 사용하여 잘못된 값을 사용했을 시 사용이 불가하는 등 코드가 명확해짐
        HashMap<CoffeeType, Integer> priceMap = new HashMap<>();
        priceMap.put(CoffeeType.AMERICANO, 3000);
        priceMap.put(CoffeeType.ICE_AMERICANO, 4000);
        priceMap.put(CoffeeType.CAFE_LATTE, 5000);
        int price = priceMap.get(type);
        System.out.println(String.format("가격은 %d원 입니다.", price)); //%d는 문자열 포맷 코드로 숫자 넣을 수 있음 + 문자열을 넣고 싶다면 %s라 쓰면됨
    }

    public static void main(String[] args) {
        //Q3-1.
        int 국어 = 80;
        int 영어 = 75;
        int 수학 = 55;
        System.out.println((국어 + 영어 + 수학) / 3); //맵으로 하고 싶은데,,

        //Q3-2.
        int n = 13; //13으로 국한하지 않고 자연수 전체로 넓힐 수 있는 방법은?
        boolean odd = n % 2 == 1; //참 또는 거짓의 값을 갖는 불 자료형
        boolean even = n % 2 == 0;
        if (odd) {
            System.out.println("홀수입니다.");
        }
        if (even) {
            System.out.println("짝수입니다.");
        }

        //Q3-3.
        String HGD = "881120-1068234";
        String yymmdd = HGD.substring(0,6);
        String afternum = HGD.substring(7); //중간부터 끝까지 추출하고 싶을 땐 시작부분만 표기해도 됨
        System.out.println(yymmdd);
        System.out.println(afternum);

        //Q3-4.
        System.out.println(HGD.charAt(7)); //7번째 인덱스에 위치한 문자 출력

        //Q3-5.
        String a = "a:b:c:d";
        System.out.println(a.replaceAll(":", "#")); //문자열 중 특정 모든 문자열을 다른 문자열로 바꿈

        //Q3-6.
        ArrayList<Integer> mL = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2));
        mL.sort(Comparator.reverseOrder());
        System.out.println(mL);

        //Q3-7.
        ArrayList<String> myList = new ArrayList<>(Arrays.asList("Life", "is", "too", "short", "!"));
        String happy = String.join(" ", myList);
        System.out.println(happy);

        //Q3-8.
        HashMap<String, Integer> grade = new HashMap<>();
        grade.put("A", 90);
        grade.put("B", 80);
        grade.put("C", 70);
        System.out.println(grade.remove("B"));
        System.out.println(grade);

        //Q3-9.
        HashSet<Integer> numbset = new HashSet<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5)); //집합 자료형은 중복을 허용하지 않고, 순서가 없음
        System.out.println(numbset);

        //Q3-10. again,,
        priceCoffee(CoffeeType.AMERICANO); //아메리카노의 가격
    }
}