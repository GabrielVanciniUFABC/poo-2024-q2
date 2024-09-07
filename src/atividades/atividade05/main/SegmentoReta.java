package main;

public class SegmentoReta extends ObjetoGeometrico {

    private Ponto A;
    private Ponto B;

    public SegmentoReta(Ponto p1, Ponto p2) {
        setPontoA(p1);
        setPontoB(p2);
    }

    private void setPontoA(Ponto p) {
        this.A = new Ponto(p.getCoordX(), p.getCoordY());
    }

    private void setPontoB(Ponto p) {
        this.B = new Ponto(p.getCoordX(), p.getCoordY());
    }

    public double comprimento() {
        double componentX = this.B.getCoordX() - this.A.getCoordX();
        double componentY = this.B.getCoordY() - this.A.getCoordY();
        double result = Math.sqrt(Math.pow((componentX), 2) + Math.pow(componentY, 2));

        return result;
    }

    public double coeficienteAngular() {
        double componentX = this.B.getCoordX() - this.A.getCoordX();
        double componentY = this.B.getCoordY() - this.A.getCoordY();

        if (componentX == 0) {

            return Double.POSITIVE_INFINITY;
        } else {
            double result = componentY / componentX;

            return result;
        }

    }

    public boolean paralelo(SegmentoReta s) {
        double a = this.coeficienteAngular();
        double b = s.coeficienteAngular();
        double epsilon = 1e-2;
        boolean paralels = Math.abs(a - b) < epsilon;

        return paralels;
    }

    public boolean comparar(SegmentoReta s) {
        double a = this.comprimento();
        double b = s.comprimento();
        double epsilon = 1e-4;
        boolean equals = Math.abs(a - b) < epsilon;

        return equals;
    }

    public Ponto getP1() {
        return A;
    }

    public Ponto getP2() {
        return B;
    }
}
