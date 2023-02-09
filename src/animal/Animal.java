package animal;

class Animal {
    String name; //string 변수 추가, 즉 클래스에 선언된 변수로 객체 변수라 함

    void setName(String name) { //setName 메소드를 통해 반복 사용 가능
        this.name = name;
    }

    public static void main(String[] args) {
        Animal cat = new Animal(); //new 를 통해 animal 클래스의 instance 인 객체 cat 생성
        cat.setName("jelly"); //메소드 호출

        System.out.println(cat.name); //객체.객체변수
    }
}
