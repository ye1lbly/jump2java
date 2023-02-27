package sample;

public class Sample2 {
    public static void main(String[] args){
        String a = "hello";
        String b = new String("hello");
        String c = "Hello Java";
        System.out.println(a.equals(b)); //true(문자열값 비교)
        System.out.println(a.equals(c)); //false
        System.out.println(a == b); //false(두 자료형이 동일한 객체인가 판단)
        System.out.println(c.substring(0, 5)); //Hello 시작위치 0부터 끝위치 5 전까지 출력
    }
}
