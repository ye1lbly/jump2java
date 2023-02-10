package animal;

class Tiger extends Animal implements Predator { //Predator 인터페이스 구현(implements)
    public String getFood() { return "orange"; } //인터페이스의 메서드는 항상 public으로 구현
}
