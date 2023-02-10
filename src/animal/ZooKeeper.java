package animal;

class ZooKeeper extends Animal {
    void feed(Predator predator) { System.out.println("feed " + predator.getFood()); }
    //사자가 오면 바나나를 던져줌 >> lion 은 Lion 클래스의 객체기도 하지만 Predator 인터페이스의 객체기도 함 >> 윗줄과 같이 수정 가능
    //void feed(Lion lion) { System.out.println("feed banana"); }

    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();

        zooKeeper.feed(tiger);
        zooKeeper.feed(lion);
    }
}
