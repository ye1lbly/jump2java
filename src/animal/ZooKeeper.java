package animal;

class ZooKeeper {
    void feed(Predator predator) { System.out.println("feed " + predator.getFood()); }
    //사자가 오면 바나나를 던져줌 >> lion 은 Lion 클래스의 객체기도 하지만 Predator 인터페이스의 객체기도 함 >> 윗줄과 같이 수정 가능
    //void feed(Lion lion) { System.out.println("feed banana"); }

    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        //좌변에 Animal animal, Predator predator, BarkAnimal barkAnimal 이 들어가도 됨
        //Lion 클래스의 객체는 위과 같이 여러가지 자료형으로 표현 가능한데 이를 객체지향에서 다형성(polymorphism)이라 함

        zooKeeper.feed(tiger);
        zooKeeper.feed(lion);

        Bouncer bouncer = new Bouncer();

        bouncer.barkAnimal(tiger);
        bouncer.barkAnimal(lion);
    }
}
