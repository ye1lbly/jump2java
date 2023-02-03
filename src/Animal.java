class Animal {
    String name; //string 변수 추가, 즉 클래스에 선언된 변수로 객체 변수라 함

    void setName(String name) { //setName 메소드를 통해 반복 사용 가능
        this.name = name;
    }
}

class Dog extends Animal { //Animal 클래스 상속
    void sleep() { //자식 클래스는 상속받은 부모 클래스의 기능에 추가 가능
        System.out.println(this.name + " zzz");
    }
}

class HouseDog extends Dog {
    HouseDog(String name) { //클래스명과 메스드명을 동일하게 하고 리턴타입을 정의하지 않는(void 도 사용 X) 생성자 HouseDog 는 객체변수 값이 있어야 후에 객체 생성
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
        Animal cat = new Animal(); //new 를 통해 animal 클래스의 instance 인 객체 cat 생성
        cat.setName("jelly"); //메소드 호출

        Dog dog = new Dog(); //Animal dog = new Dog()라고도 표현 가능(개는 동물이다. 즉, 개로 만든 객체는 동물 자료형이다.)
        //하지만 Dog 클래스에만 존재하는 sleep 메소드는 사용 불가능
        //Dog dog = new Animal()는 오류남(동물은 개가 아니기 때문)
        dog.setName("happy");

        HouseDog houseDog = new HouseDog("doggy"); //new 를 통해 객체를 생성하며 문자열을 전달해 생성자 호출
        HouseDog bichon = new HouseDog(2);

        System.out.println(cat.name); //객체.객체변수
        System.out.println(dog.name); //객체변수는 공유되지 않으므로 고양이와 강아지의 값이 각각 독립적으로 유지
        System.out.println(bichon.name);

        dog.sleep();
        houseDog.sleep();
        houseDog.sleep(3);
    }
}