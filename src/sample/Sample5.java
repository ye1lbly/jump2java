package sample;

import java.util.List;

public class Sample5 {
    public static void main(String[] args){
        String num = "123"; //문자열
        int n = Integer.parseInt(num); //문자열 정수로 변환
        System.out.println(n);

        int m = 123; //정수
        String numb = "" + m; //정수 앞에 빈문자열""을 더해 문자열로 변환
        System.out.println(numb);

        String num1 = String.valueOf(m);
        String num2 = Integer.toString(m); //윗줄과 이줄 모두 정수를 문자열로 바꾸어 리턴

        String number = "3.14159";
        double d = Double.parseDouble(number); //실수 형태의 문자열 실수로 변환 + Float.parseFloat 를 사용해도 됨
        int p = (int) d; //실수를 정수로 바뀔 땐 반드시 int 형으로 캐스팅해줘야함. 이때 (int)이 캐스팅
        System.out.println(p);

        final List<String> a = List.of("a", "b");
        //final 은 자료형에 값을 단 한 번만 설정할 수 있게 강제하는 키워드로 값을 설정하면 재설정이 불가능함
        //리스트의 경우 final 선언시 재할당만 불가할 뿐 리스트에 값을 더하거나(add) 뺄(remove) 수는 있음
        //List.of로 값을 더하거나 빼는 것도 안되게 할 수 있음
        System.out.println(a);
    }
}
