package practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;

public class Practice3 {
    public static void main(String[] args) {
        int[] data = {5, 6, 4, 2, 3, 1, 1, 2, 2, 4, 8};

        //짝수만 포함하는 ArrayList 생성
        ArrayList<Integer> dataList = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 == 0) {
                dataList.add(data[i]);
            }
        }

        //Set 으로 중복하는 숫자 제거
        HashSet<Integer> dataSet = new HashSet<>(dataList);

        //Set -> List 변경
        ArrayList<Integer> distinctList = new ArrayList<>(dataSet);

        //역순 정렬
        distinctList.sort(Comparator.reverseOrder());

        //정수 리스트를 정수 배열로 변환
        int[] result = new int[distinctList.size()];
        for (int i = 0; i < distinctList.size(); i++) {
            result[i] = distinctList.get(i);
        }
    }
}
