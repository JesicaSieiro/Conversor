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
public class CentimetrosPulgadasConversor extends Conversor {

    private static final double CONSTANTE_PULG_CENT = 2.54;
    //private double cent;
    @Override
    public String getLabelValor1() {
        return "Centimetros";
    }

    @Override
    public String getLableValor2() {
        return "Pulgadas";
    }

    @Override
    public String toString() {
        return "Centimetros a Pulgadas";
    }

    @Override
    public Double convertirValor1Valor2(Double valor1) {
        return valor1 / CONSTANTE_PULG_CENT;
    }

    @Override
    public Double convertirValor2Valor1(Double valor2) {
        return valor2 * CONSTANTE_PULG_CENT;
    }


}
