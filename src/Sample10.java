class FoolExcept extends Exception {}

public class Sample10 {
    int sum(int a, int b) { //입력값과 리턴값이 있는 일반적인 매소드, 매개변수 a, b
        return a + b;
    }

    String say() { //입력값은 없지만 리턴값은 있는 메소드
        return "hi";
    }

    void nSum(int x, int y) { //입력값은 있지만 리턴값은 없는 void 메소드
        System.out.println(x + "와 " + y + "의 차는 " + (x - y) + "입니다.");
    }

    void say2() { //입력값과 리턴값 모두 없는 메소드
        System.out.println("hello");
    }

    public void sayNickName(String nick) throws FoolExcept {
        if ("fool".equals(nick)) {
            throw new FoolExcept(); //닉네임이 바보와 일치할 경우 단독으로 sayNickName 메소드를 즉시 빠져나감
        }
        System.out.println("내 별명은 " + nick + "입니다.");
    }

    public static void main(String[] args) {
        Sample10 sample10 = new Sample10();
        int c = sample10.sum(3, 4); //인수 3, 4
        String A = sample10.say();

        System.out.println(c);
        System.out.println(A);

        sample10.nSum(3, 4);
        sample10.say2();
        try {
            sample10.sayNickName("fool"); //fool 대신 다른 문자열 넣으면 문장 출력
            sample10.sayNickName("ye1l"); //수행되지 않음
        } catch (FoolExcept e) {
            System.err.println("FoolExcept 발생");
        }
    }
}
