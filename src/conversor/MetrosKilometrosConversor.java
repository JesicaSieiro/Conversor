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
public class MetrosKilometrosConversor extends Conversor {

    private static final double CONSTANTE_METROS_KM = 1000.0;
    //private double cent;
    @Override
    public String getLabelValor1() {
        return "Metros";
    }

    @Override
    public String getLableValor2() {
        return "Kilometros";
    }

    @Override
    public String toString() {
        return "Metros a Kilometros";
    }

    @Override
    public Double convertirValor1Valor2(Double valor1) {
        return valor1 / CONSTANTE_METROS_KM;
    }

    @Override
    public Double convertirValor2Valor1(Double valor2) {
        return valor2 * CONSTANTE_METROS_KM;
    }


}
