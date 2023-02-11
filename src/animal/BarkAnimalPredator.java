package animal;

//단일 상속만 가능한 일반 클래스와 달리 인터페이스는 extends 를 이용해 여러 인터페이스 동시에 상속 가능(다중 상속)
interface BarkAnimalPredator extends Predator, BarkAnimal {
}
