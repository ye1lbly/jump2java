package practice;

public class Practice4 {
    static int getTotalPage(int n, int m) { // n : 게시물 총 갯수, m : 한 페이지에 보일 게시물 수
        if (n % m == 0) {
            return n / m;
        } else {
            return n / m + 1;
        }
    }

    static int getDigitCount(int i) {
        String s = "" + i; //숫자 i 문자열로 변환
        return s.length();
    }

    static int getCharCount(String st) {
        int answer = 0;
        for (int a = 0; a < st.length(); a++) {
            if (st.charAt(a) != ' ') {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int result = 0;
        for (int n = 1; n < 1000; n++) {
            if (n % 3 == 0 || n % 5 == 0) {
                result += n;
            }
        }
        System.out.println(result);

        //총 페이지 수 출력
        System.out.println(getTotalPage(5, 10));
        System.out.println(getTotalPage(15, 10));
        System.out.println(getTotalPage(30, 10));

        //문자열의 자릿수 출력
        System.out.println(getDigitCount(3));
        System.out.println(getDigitCount(23));
        System.out.println(getDigitCount(563));
        System.out.println(getDigitCount(7893));

        //공백 제외한 글자수 출력
        System.out.println(getCharCount("점프 투 자바"));
        System.out.println(getCharCount("점프 투 자바 종합문제 풀이"));
    }
}
