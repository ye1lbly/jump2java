package animal;

class Bouncer {
    void barkAnimal(BarkAnimal animal) {
        animal.bark();

        /* animal 객체가 Tiger 클래스의 객체인지를 묻는 조건문으로 instanceof 사용 */
//        if (animal instanceof Tiger) {
//            System.out.println("어흥");
//        } else if (animal instanceof Lion) {
//            System.out.println("크앙");
//        }
    }
}
