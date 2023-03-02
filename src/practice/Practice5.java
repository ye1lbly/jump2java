package practice;

import java.awt.*;
import java.io.*;
import java.util.*;

class OddException extends Exception {}

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

    static void execute(int n) throws OddException {
        System.out.printf("입력 숫자 : %d\n", n);
        if (n % 2 == 1) {
            throw new OddException();
        }
        System.out.println("짝수입니다.");
    }

    static String dashInsert(String d) {
        int[] numbers = Arrays.stream(d.split("")) //숫자 -> 정수 배열 변환
                .mapToInt(Integer::parseInt)
                .toArray();
        ArrayList<String> resultList = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            resultList.add("" + numbers[i]);
            if (i < numbers.length - 1) { //다음 수가 있는지 확인
                if (numbers[i] % 2 == 1 && numbers[i+1] % 2 == 1) {
                    resultList.add("-");
                } else if (numbers[i] % 2 == 0 && numbers[i+1] % 2 == 0) {
                    resultList.add("*");
                }
            }
        }
        return String.join("", resultList);
    }

    static String strCompress(String c) {
        ArrayList<String> al = new ArrayList<>();
        int count = 0;
        for (int l = 0; l < c.length(); l++) {
//            al.add("" + c[l+1]);
//            if (l < c.length() -1) {
//                for (c[l] == c[l+1]) {
//                    al.add(count++);
//                }
//            }
        }
        return String.join("", al);
    }

    public static void main(String[] args) throws IOException {
        /* Q9-1 */
        String s = "a:b:c:d";
        System.out.println(s);

        String[] data = s.split(":"); //split 메서드를 사용해 문자열 s 를 :을 기준으로 나눈 후 문자열 배열로 변환
        System.out.println(Arrays.toString(data));

        String result = String.join("#", data);
        System.out.println(result);

        /* Q9-2 */
        HashMap<String, Integer> h = new HashMap<>();
        h.put("B", 80);
        System.out.println(h.getOrDefault("C", 70)); //h Map 에는 C 라는 key 가 없으므로 null 이 출력되겠지만, getOrDefault 를 통해 값을 얻을 수 있게 함

        /* Q9-3 */
        int[] A = {20, 55, 67, 82, 45, 33, 90, 87, 100, 25};
        int a = Arrays.stream(A).filter((n) -> n >= 50).sum();
        System.out.println(a);

        /* Q9-4 */
        for (int i = 0; i < 10; i++) { System.out.print(fibonnaci(i) + " "); }

        /* Q9-5 */
        Scanner sc = new Scanner(System.in); //Scanner 클래스를 사용하기 위해 인스턴스 생성
        System.out.print("출력을 원하는 구구단 숫자를 입력하시오 : "); //print 를 사용하면 줄바꿈 없이 값 출력 (println 을 사용하면 줄바꿈된 출력값 확인 가능)
        int num = sc.nextInt(); //콘솔에서 숫자 입력 받음
        for (int p = 1; p < 10; p++) { System.out.printf("%d ", num * p); }

        /* Q9-6 */
        Scanner scanner = new Scanner(System.in);
        System.out.print("총합을 구하고 싶은 숫자를 입력하시오 : ");
        String userInput = scanner.nextLine(); //콘솔에서 한 줄 입력 받음
        String[] numbers = userInput.split(",");
        int total = 0;
        for (String nums : numbers) {
            nums = nums.trim(); //공백 제거
            int N = Integer.parseInt(nums); //String -> Int
            total += N;
        }
        System.out.printf("총합은 %d 입니다.\n", total);

        /* Q9-7 */
        ArrayList<String> alphabet = new ArrayList<>();

        //파일의 각 라인을 읽고 alphabet 에 저장
        BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
        while (true) {
            String line = br.readLine();
            if (line == null) break;
            alphabet.add(line);
        }
        br.close();

        alphabet.sort(Comparator.reverseOrder());

        //역순 정렬된 내용 result.txt 에 저장
        PrintWriter pw = new PrintWriter("result.txt");
        for (String line : alphabet) {
            pw.println(line);
        }
        pw.close();

        /* Q9-8 */
        ArrayList<String> numbs = new ArrayList<>();
        BufferedReader bdr = new BufferedReader(new FileReader("sample.txt"));
        while (true) {
            String line = bdr.readLine();
            if (line == null) break;
            numbs.add(line);
        }
        br.close();

        int sum = 0;
        for (String line : numbs) {
            line = line.trim();
            int N = Integer.parseInt(line);
            sum += N;
        }

        double avg = (double) sum / numbs.size(); //소수점까지 표현해주기 위해 int 대신 double 로 수정
        System.out.printf("총합 : %d, 평균 : %.2f\n", sum, avg); // %.2f 를 사용하여 소수점 이하 둘째 자리까지만 나타냄

        PrintWriter ptw = new PrintWriter("result2.txt");
        ptw.write(String.format("%.2f", avg)); //실수 문자열로 변환 후 저장
        ptw.close();

        /* Q9-10 */
        Random r = new Random();
        for (int m = 0; m < 10; m++) {
            try {
                execute(r.nextInt(10)); //범위내 정수 중 임의의 정수(난수) 리턴
            } catch (OddException e) {
                e.printStackTrace();
            }
        }

        /* Q9-11 */
        String d = "4546793";
        String answer = dashInsert(d);
        System.out.println(answer);

        /* Q9-12 */
        String c = "aaabbcccccca";
        String comp = strCompress(c);
        System.out.println(comp);

        /* Q9-13 */

        /* Q9-14 */

        /* Q9-15 */
    }
}
