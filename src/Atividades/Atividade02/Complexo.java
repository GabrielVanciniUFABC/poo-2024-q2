
public class Complexo {

    private double real;
    private double imaginario;

    public Complexo(double r, double i) {
        this.real = r;
        this.imaginario = i;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginario() {
        return imaginario;
    }

    public void setImaginario(double imaginario) {
        this.imaginario = imaginario;
    }

    public String converteParaString() {
        return String.format("%.2f + %.2fi", this.real, this.imaginario);
    }

    public Complexo adiciona(Complexo c) {
        double somaReal = this.real + c.getReal();
        double somaImaginario = this.imaginario + c.getImaginario();
        Complexo resultado = new Complexo(somaReal, somaImaginario);

        return resultado;
    }

    public Complexo subtrai(Complexo c) {
        double subtracaoReal = this.real - c.getReal();
        double subtracaoImaginario = this.imaginario - c.getImaginario();
        Complexo resultado = new Complexo(subtracaoReal, subtracaoImaginario);

        return resultado;
    }

    public Complexo multiplica(Complexo c) {
        double distribuirReal = this.real * c.getReal();
        double distribuirRealImaginario1 = this.real * c.getImaginario();
        double distribuirRealImaginario2 = this.imaginario * c.getReal();
        double distribuirImaginario = this.imaginario * c.getImaginario() * -1;
        double somaReal = distribuirReal + distribuirImaginario;
        double somaImaginario = distribuirRealImaginario1 + distribuirRealImaginario2;

        Complexo resultado = new Complexo(somaReal, somaImaginario);

        return resultado;
    }

    public Complexo divide(Complexo c) {
        Complexo referencia = new Complexo(this.real,this.imaginario);
        Complexo conjugado = new Complexo(c.real, c.imaginario * -1);
        Complexo numeradorComplexo = referencia.multiplica(conjugado);
        Complexo denominadorComplexo = c.multiplica(conjugado);
        double divisaoReal = numeradorComplexo.getReal()/denominadorComplexo.real;
        double divisaoImaginario = numeradorComplexo.getImaginario()/denominadorComplexo.real;

        Complexo resultado = new Complexo(divisaoReal, divisaoImaginario);

        return resultado;
    }
}
