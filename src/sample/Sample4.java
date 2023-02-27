package sample;

import java.util.HashMap;

/* Map 은 key 와 value 를 한 쌍으로 갖는 자료형임 */

public class Sample4 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>(); //key, value 모두 string 타입으로 다른 자료형 사용 불가
        map.put("people", "사람"); //key, value 를 put method 를 이용하여 추가
        map.put("baseball", "야구");
        System.out.println(map.get("people")); //key 에 해당하는 value 값 사람 출력, 해당 value 가 없을 시 null 이 return 됨
        System.out.println(map.containsKey("people")); //map 에 key people 의 유무를 보여줌
        System.out.println(map.keySet()); //map 의 모든 key 를 모아 리턴
    }
}
