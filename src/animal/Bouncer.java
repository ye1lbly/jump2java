package animal;

class Bouncer {
    void barkAnimal(Animal animal) {
        if (animal instanceof Tiger) { //animal 객체가 Tiger 클래스의 객체인지를 묻는 조건문
            System.out.println("어흥");
        } else if (animal instanceof Lion) {
            System.out.println("크앙");
        }
    }
}
