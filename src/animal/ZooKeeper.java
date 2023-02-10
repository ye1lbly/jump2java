package animal;

class ZooKeeper extends Animal {
    void feed(Tiger tiger) { System.out.println("feed orange"); } //호랑이가 오면 오렌지를 던져줌
    void feed(Lion lion) { System.out.println("feed banana"); }

    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();

        zooKeeper.feed(tiger);
        zooKeeper.feed(lion);
    }
}
