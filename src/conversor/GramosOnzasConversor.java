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
public class GramosOnzasConversor extends Conversor {

    private static final double CONSTANTE_ONZAS = 0.035274;
    //private double cent;
    @Override
    public String getLabelValor1() {
        return "Gramos";
    }

    @Override
    public String getLableValor2() {
        return "Onzas";
    }

    @Override
    public String toString() {
        return "Gramos a Onzas";
    }

    @Override
    public Double convertirValor1Valor2(Double valor1) {
        return valor1 * CONSTANTE_ONZAS;
    }

    @Override
    public Double convertirValor2Valor1(Double valor2) {
        return valor2 / CONSTANTE_ONZAS;
    }


}
