/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

/**
 *
 * @author jesic
 */
public class PesosEuroConversor extends Conversor {

    private static final double CONSTANTE_PESOS_EURO = 96.5;
    //private double cent;
    @Override
    public String getLabelValor1() {
        return "Pesos";
    }

    @Override
    public String getLableValor2() {
        return "Euro";
    }

    @Override
    public String toString() {
        return "Pesos a Euro";
    }

    @Override
    public Double convertirValor1Valor2(Double valor1) {
        return valor1 / CONSTANTE_PESOS_EURO;
    }

    @Override
    public Double convertirValor2Valor1(Double valor2) {
        return valor2 * CONSTANTE_PESOS_EURO;
    }


}
