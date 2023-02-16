package animal;

class Animal {
    String name; //string 변수 추가, 즉 클래스에 선언된 변수로 객체 변수라 함

    void setName(String name) { //setName 메소드를 통해 반복 사용 가능
        this.name = name; //instance name(우변)가 자기 자신(객체 변수 name, 좌변)을 참조하기 위해 참조 변수 this 사용
    }

    public static void main(String[] args) {
        Animal cat = new Animal(); //new 를 통해 animal 클래스의 instance 인 객체 cat 생성
        cat.setName("jelly"); //메소드 호출

        System.out.println(cat.name); //객체.객체변수
    }
}
