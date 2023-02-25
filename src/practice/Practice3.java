package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class Practice3 {
    public static void main(String[] args) {
        int[] data = {5, 6, 4, 2, 3, 1, 1, 2, 2, 4, 8};

//        //짝수만 포함하는 ArrayList 생성
//        ArrayList<Integer> dataList = new ArrayList<>();
//        for (int i = 0; i < data.length; i++) {
//            if (data[i] % 2 == 0) {
//                dataList.add(data[i]);
//            }
//        }
//
//        //Set 으로 중복하는 숫자 제거
//        HashSet<Integer> dataSet = new HashSet<>(dataList);
//
//        //Set -> List 변경
//        ArrayList<Integer> distinctList = new ArrayList<>(dataSet);
//
//        //역순 정렬
//        distinctList.sort(Comparator.reverseOrder());
//
//        //정수 리스트를 정수 배열로 변환
//        int[] result = new int[distinctList.size()];
//        for (int i = 0; i < distinctList.size(); i++) {
//            result[i] = distinctList.get(i);
//        }

        /* stream 사용으로 위 코드 축약 가능 */
        int[] result = Arrays.stream(data)
                .boxed()
                .filter((a) -> a % 2 == 0) //람다 함수를 이용해 짝수만 필터링하여 뽑아냄
                .distinct() //stream 에서 중복 제거
                .sorted(Comparator.reverseOrder()) //역순 정렬
                .mapToInt(Integer::intValue)
                .toArray(); //int[] 배열로 반환

        System.out.println(Arrays.toString(result));

        //Q7-4.
        int[] numbers = {1, 2, 3, 4, 5};
        int[] answer = Arrays.stream(numbers)
                .boxed()
                .filter((n) -> n % 2 == 1)

                .mapToInt(Integer::intValue)
                .toArray();

        //Q7-5.
        int[] nums = {1, -2, 3, -5, 8, -3};
        int[] ans = Arrays.stream(nums)
                .boxed()
                .filter((m) -> m >= 0)
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println(Arrays.toString(ans));
    }
}
