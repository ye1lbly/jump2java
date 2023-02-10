package animal;

/*
인터페이스를 통해
동물의 종류에 의존하고, 동물 마다 feed 메서드를 반복해서 사용해야 했던 zooKeeper 클래스가
단 한 개의 feed 메서드로 구현 가능한 독립적인 클래스가 됨
*/

interface Predator {
    String getFood(); //인터페이스는 메서드 이름과 입출력만 정의하고 구현은 구현체에서 함 >> 반드시 구현해야 함(강제성)

    default void printFood() { //default 메서드를 사용하면 인터페이스에서 구현 가능 + 오버라이딩 가능
        System.out.printf("my food is %s/n", getFood());
    }
}
