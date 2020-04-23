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
public class LitrosGalonesConversor extends Conversor {

    private static final double CONSTANTE_GALONES = 0.264172;
    //private double cent;
    @Override
    public String getLabelValor1() {
        return "Litros";
    }

    @Override
    public String getLableValor2() {
        return "Galones";
    }

    @Override
    public String toString() {
        return "Litros a Galones";
    }

    @Override
    public Double convertirValor1Valor2(Double valor1) {
        return valor1 * CONSTANTE_GALONES;
    }

    @Override
    public Double convertirValor2Valor1(Double valor2) {
        return valor2 / CONSTANTE_GALONES;
    }


}
