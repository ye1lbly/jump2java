package sample;

/* List 는 자바의 자료형으로 배열과 비슷함 */

import java.util.ArrayList; //ArrayList 를 사용하기 위해 ArrayList 를 먼저 import 해줌
import java.util.Arrays;
import java.util.Comparator;

public class Sample3 {
    public static void main(String[] args) {
        String[] data = {"138", "129", "142"};
        ArrayList<String> pitches = new ArrayList<>(Arrays.asList(data));

        pitches.add(3, "133"); //3번째 위치에 133 넣어줌
        System.out.println(pitches.get(3)); //3번째 인덱스값 추출
        System.out.println(pitches.size()); //객체 pitches 에 담긴 자료 갯수 출력
        System.out.println(pitches.contains("138")); //객체의 138 포함 유무 출력

        String result = String.join(" | ", pitches); //리스트의 각 요소에 구분자 |를 삽입하여 하나의 문자열로 만듬
        System.out.println(result);

        //오름차순(순방향)으로 정렬
        //내림차순(역방향)으로 정렬하고 싶다면 Comparator.reverseOrder() 사용
        pitches.sort(Comparator.naturalOrder());
        System.out.println(pitches);
    }
}
