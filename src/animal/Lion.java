package animal;

class Lion extends Animal implements Predator, BarkAnimal {
    public String getFood() { return "banana"; }

    public void bark() { System.out.println("크앙"); }
}
