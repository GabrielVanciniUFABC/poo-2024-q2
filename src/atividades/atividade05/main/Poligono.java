package main;

/**
 * Geometric object class.
 */
public abstract class Poligono extends FormaGeometrica {
    private final Ponto[] pontos;

    public Poligono(Ponto[] pontos){
        this.pontos = new Ponto[pontos.length];
        System.arraycopy(pontos, 0, this.pontos, 0, pontos.length);
    }

    public Ponto[] getPontos(){
        return pontos;
    }

    @Override
    public double perimetro(){
        SegmentoReta[] retas = new SegmentoReta[getPontos().length];
        double resultado = 0;

        for (int i = 0; i < getPontos().length; i++) {
            if (i + 1 < getPontos().length) {
                retas[i] = new SegmentoReta(getPontos()[i], getPontos()[i + 1]);
            } else {
                retas[i] = new SegmentoReta(getPontos()[i], getPontos()[0]);
            }
        }

        for (SegmentoReta reta : retas) {
            resultado += reta.comprimento();
        }

        return resultado;
    }
}