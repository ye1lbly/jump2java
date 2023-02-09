package animal;

class HouseDog extends Dog {
    HouseDog(String name) {
        //클래스명과 메스드명을 동일하게 하고 리턴타입을 정의하지 않는(void 도 사용 X) 생성자 HouseDog 는 객체변수 값이 있어야 후에 객체 생성
        this.setName(name);
    }

    HouseDog(int type) { //생성자 오버로딩
        if (type == 1) {
            this.setName("poodle");
        } else if (type == 2) {
            this.setName("bichon");
        }
    }

    void sleep() { //method overriding(메소드 덮어쓰기)
        // 부모 클래스(Dog)에서의 sleep 메소드를 자식 클래스가 동일한 형태로 다시 구현
        System.out.println(this.name + " zzz in house");
    }

    void sleep(int hour) { //method overloading
        //sleep 메소드에 int 자료형을 추가하여 동일한 메소드 생성 가능
        System.out.println(this.name + " zzz in house for " + hour + " hours");
    }

    public static void main(String[] args) {
        HouseDog houseDog = new HouseDog("doggy"); //new 를 통해 객체를 생성하며 문자열을 전달해 생성자 호출
        HouseDog bichon = new HouseDog(2);

        System.out.println(bichon.name);

        houseDog.sleep();
        houseDog.sleep(3);
    }
}
