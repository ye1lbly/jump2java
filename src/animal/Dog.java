package animal;

class Dog extends Animal { //Animal 클래스 상속
    void sleep() { //자식 클래스는 상속받은 부모 클래스의 기능에 추가 가능
        System.out.println(this.name + " zzz");
    }

    public static void main(String[] args) {
        Dog dog = new Dog(); //Animal dog = new Dog()라고도 표현 가능(Dog 는 Animal 이다. 즉, 개로 만든 객체는 동물 자료형이다.)
        //하지만 Dog 클래스에만 존재하는 sleep 메소드는 사용 불가능
        //Dog dog = new Animal()는 오류남(동물은 개가 아니기 때문)
        dog.setName("happy");

        System.out.println(dog.name); //객체변수는 공유되지 않으므로 고양이와 강아지의 값이 각각 독립적으로 유지

        dog.sleep();
    }
}
