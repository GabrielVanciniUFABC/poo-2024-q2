package aula04.retangulos;

/**
 * Axis-aligned rectangle abstraction.
 */
public class Retangulo {

    double centroX;
    double centroY;
    double largura;
    double altura;

    Retangulo(double centroX, double centroY, double largura, double altura) {
        this.centroX = centroX;
        this.centroY = centroY;
        this.largura = largura;
        this.altura = altura;
    }

    double area() {
        return this.largura * this.altura;
    }

    double perimetro() {
        return this.largura * 2 + this.altura * 2;
    }

    /**
     * Um retângulo não intersecciona outro se: 
     * * lado direito do retângulo A está à esquerda do lado esquerdo do retângulo B
     * * lado esquerdo do retângulo A está à direita do lado direito do retângulo B
     * * lado superior do retângulo A está abaixo do lado inferior do retângulo B
     * * lado inferior do retângulo A está acima do lado superior do retângulo B
     * Inversamente, se nenhuma dessas condições for verdadeira, os retângulos interseccionam.
     */
    boolean interseciona(Retangulo b) {
        boolean aEsquerdaDeB = this.centroX + this.largura / 2 < b.centroX - b.largura / 2;
        boolean aDireitaDeB = this.centroX - this.largura / 2 > b.centroX + b.largura / 2;
        boolean aAbaixoDeB = this.centroY + this.altura / 2 < b.centroY - b.altura / 2;
        boolean aAcimaDeB = this.centroY - this.altura / 2 > b.centroY + b.altura / 2;

        return !aEsquerdaDeB && !aDireitaDeB && !aAcimaDeB && !aAbaixoDeB;
    }

    /**
     * Um retângulo contém outro se o retângulo contido estiver completamente dentro do
     * retângulo contenedor. Isso significa que:
     * * lado superior do retângulo contido está abaixo do lado superior do retângulo contenedor
     * * lado inferior do retângulo contido está acima do lado inferior do retângulo contenedor
     * * lado esquerdo do retângulo contido está à direita do lado esquerdo do retângulo contenedor
     * * lado direito do retângulo contido está à esquerda do lado direito do retângulo contenedor
     * Se todas essas condições forem verdadeiras, o retângulo contenedor contém o retângulo contido.
     */
    boolean contem(Retangulo b) {
        double aEsquerdo = this.centroX - this.largura / 2;
        double aDireito = this.centroX + this.largura / 2;
        double aTopo = this.centroY + this.altura / 2;
        double aBase = this.centroY - this.altura / 2;

        double bEsquerdo = b.centroX - b.largura / 2;
        double bDireito = b.centroX + b.largura / 2;
        double bTopo = b.centroY + b.altura / 2;
        double bBase = b.centroY - b.altura / 2;

        return bEsquerdo >= aEsquerdo && bTopo <= aTopo && bDireito <= aDireito && bBase >= aBase;
    }
}