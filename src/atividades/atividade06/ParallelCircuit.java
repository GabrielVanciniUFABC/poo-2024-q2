public class ParallelCircuit extends CompositeCircuit {

    public ParallelCircuit(Circuit[] circuits) {
        super(circuits);
    }

    @Override
    public double getResistance() {
        double reciprocalSum = 0;
        for (Circuit circuit : circuits) {
            reciprocalSum += 1.0 / circuit.getResistance();
        }
        return 1.0 / reciprocalSum;
    }
}