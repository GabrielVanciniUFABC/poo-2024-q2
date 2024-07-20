package aula04.datas;

public final class Data {

    final String[] MESES = {
        "",
        "Janeiro",
        "Fevereiro",
        "Março",
        "Abril",
        "Maio",
        "Junho",
        "Julho",
        "Agosto",
        "Setembro",
        "Outubro",
        "Novembro",
        "Dezembro"
    };
    final int[] MESES_31 = new int[]{1, 3, 5, 7, 8, 10, 12};
    int dia;
    int mes;
    int ano;

    boolean anoBissexto(int ano) {
        validaAno(ano);
        // not divisible by 4, not a leap year
        if (ano % 4 != 0) {
            return false;
        }
        // divisible by 4, not divisible by 100, leap year
        if (ano % 100 != 0) {
            return true;
        }
        // divisible by 100, divisible by 400, leap year
        return ano % 400 == 0;
    }

    boolean testaMes31(int month) {
        for (var m : MESES_31) {
            if (m == month) {
                return true;
            }
        }

        return false;
    }

    void validaAno(int ano) {
        if (ano < 0 || ano > 2999) {
            throw new IllegalArgumentException("Ano deve estar em [0,2999]");
        }
    }

    Data(int dia, int mes, int ano) {
        if (dia < 1 || dia > 31) {
            throw new IllegalArgumentException("Dia deve estar em [1,31]");
        }
        if (mes < 1 || mes > 12) {
            throw new IllegalArgumentException("Mes deve estar em [1,12]");
        }
        validaAno(ano);
        if (dia == 31 && !testaMes31(mes)) {
            throw new IllegalArgumentException(
                String.format("%s nao tem 31 dias", MESES[mes]));
        }
        if (dia == 29 && mes == 2 && !anoBissexto(ano)) {
            throw new IllegalArgumentException("Fevereiro pode ter 29 dias apenas nos anos bissextos");
        }
        if (dia > 28 && mes == 2) {
            throw new IllegalArgumentException(String.format("Fevereiro nao pode ter %d dias", dia));
        }
        
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    boolean anterior(Data data) {
        if (this.ano < data.ano) {
            return true;
        }
        if (this.ano == data.ano && this.mes < data.mes) {
            return true;
        }
        return this.ano == data.ano && this.mes == data.mes && this.dia < data.dia;
    }

    boolean posterior(Data data) {
        if (this.ano > data.ano) {
            return true;
        }
        if (this.ano == data.ano && this.mes > data.mes) {
            return true;
        }
        return this.ano == data.ano && this.mes == data.mes && this.dia > data.dia;
    }

    String converteParaString() {
        return String.format("%02d de %s de %d", dia, MESES[this.mes], this.ano);
    }
}