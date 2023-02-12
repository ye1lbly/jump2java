package calculator;

public class MineralCalculator {
    int value = 0;

    public void add(Mineral mineral) {
        System.out.println(this.value += mineral.getValue());
    }

    public static void main(String[] args) {
        MineralCalculator cal = new MineralCalculator();
        cal.add(new Gold());
        cal.add(new Sliver());
        cal.add(new Bronze());
    }
}
