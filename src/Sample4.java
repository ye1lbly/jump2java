//Map은 key와 value를 한 쌍으로 갖는 자료형임

import java.util.HashMap;

public class Sample4 {
    public static void main(String[] args){
        HashMap<String, String> map = new HashMap<>(); //key, value 모두 string 타입으로 다른 자료형 사용 불가
        map.put("people", "사람"); //key, value를 put method를 이용하여 추가
        map.put("baseball", "야구");
        System.out.println(map.get("people")); //key에 해당하는 value 값 사람 출력, 해당 value가 없을 시 null이 return됨
        System.out.println(map.containsKey("people")); //map에 key people의 유무를 보여줌
        System.out.println(map.keySet()); //map의 모든 key를 모아 리턴
    }
}
