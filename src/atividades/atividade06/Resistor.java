public class Resistor implements Circuit {
    private final double resistance;

    public Resistor(double resistance) {
        this.resistance = resistance;
    }

    @Override
    public double getResistance() {
        return resistance;
    }
}