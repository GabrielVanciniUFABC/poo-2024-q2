package aula04.datas;

public class App {
    public static void main(String[] args) {
        var data1 = new Data(1, 1, 2020);
        var data2 = new Data(1, 1, 2021);
        var data3 = new Data(1, 2, 2020);
        var data4 = new Data(10, 1, 2020);
        var data5 = new Data(1, 1, 2020);

        System.out.println(data1.converteParaString());
        System.out.println(data2.converteParaString());
        System.out.println(data3.converteParaString());
        System.out.println(data4.converteParaString());
        System.out.println(data5.converteParaString());
        System.out.println();
        System.out.println(data1.anterior(data2));
        System.out.println(data1.anterior(data3));
        System.out.println(data1.anterior(data4));
        System.out.println(data1.anterior(data5)); 
        System.out.println();
        System.out.println(data1.posterior(data2));
        System.out.println(data1.posterior(data3));
        System.out.println(data1.posterior(data4));
        System.out.println(data1.posterior(data5));
        System.out.println();
        System.out.println(data2.posterior(data1));
        System.out.println(data3.posterior(data1));
        System.out.println(data4.posterior(data1));
        System.out.println(data5.posterior(data1));
    }
}