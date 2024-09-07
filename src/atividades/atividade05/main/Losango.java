package main;

public class Losango extends Quadrilatero{
    public Losango(Ponto p1, Ponto p2, Ponto p3, Ponto p4){
        super(p1, p2, p3, p4);
    }

    @Override
    public double largura() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}