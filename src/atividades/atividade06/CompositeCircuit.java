public abstract class CompositeCircuit implements Circuit {
    protected Circuit[] circuits;

    public CompositeCircuit(Circuit[] circuits) {
        this.circuits = circuits.clone();
    }

    public Circuit[] getCircuits() {
        return circuits.clone();
    }
}