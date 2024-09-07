public class SerialCircuit extends CompositeCircuit {

    public SerialCircuit(Circuit[] circuits) {
        super(circuits);
    }

    @Override
    public double getResistance() {
        double totalResistance = 0;
        for (Circuit circuit : circuits) {
            totalResistance += circuit.getResistance();
        }
        return totalResistance;
    }
}