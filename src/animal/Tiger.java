package animal;

//인터페이스 구현(implements)
class Tiger extends Animal implements Predator, BarkAnimal { //콤마를 이용해 여러 인터페이스 구현 가능
    public String getFood() { return "orange"; } //인터페이스의 메서드는 항상 public으로 구현

    public void bark() { System.out.println("어흥"); }
}
