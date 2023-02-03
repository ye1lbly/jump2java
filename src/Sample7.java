//switch case 문은 if 문과 비슷하지만 좀 더 정형화된 조건 판단문임
//switch case 문은 if else 구조로 변경 가능하지만 반대는 아닌 경우도 있음(충분조건 느낌)

public class Sample7 {
    public static void main(String[] args) {
        int month = 11; //입력값이 정형화된 경우 if 문보다는 switch case 문을 쓸 때 가독성이 올라감
        String monthString = "";
        switch (month) {
            case 1: monthString = "January";
                break; //case 문마다 break 문장이 있기에 실행 후 switch 문을 빠져나갈 수 있음
            case 2: monthString = "February";
                break;
            case 3: monthString = "March";
                break;
            case 4: monthString = "April";
                break;
            case 5: monthString = "May";
                break;
            case 6: monthString = "June";
                break;
            case 7: monthString = "July";
                break;
            case 8: monthString = "August";
                break;
            case 9: monthString = "September";
                break;
            case 10: monthString = "October";
                break;
            case 11: monthString = "November";
                break;
            case 12: monthString = "December";
                break;
            default: monthString = "invalid month";
                break;
        }
        System.out.println(monthString);
    }
}
