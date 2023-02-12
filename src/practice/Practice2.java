package practice;

public class Practice2 {
    public static void main(String[] args) {
        //Q4-2. again,,
        int n = 0;
        int answer = 0; //결과값 지정
        while (n <= 1000) {
            n++;
            if (n % 3 == 0) {
                answer += n; //지정해둔 결과값에 3의 배수 더해가기
            }
        }
        System.out.println(answer);

        //Q4-3. again,,
        int i = 0;
        while (true) {
            i += 1;
            if (i > 5) {
                break;
            }
            for(int j = 0; j < i; j++) {
                System.out.print("*"); //i의 값만큼 반복하여 *출력
            }
            System.out.println("");
        }

        //Q4-4.
        for(int k = 1; k < 101; k++) {
            System.out.print(k + " ");
        }
        System.out.println("");

        //Q4-5.
        int[] mid = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
        int sum = 0;
        for(int midterm: mid) {
            sum += midterm;
        }
        float average = (float) sum / mid.length;
        System.out.println(average);
    }
}
