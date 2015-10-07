package br.edu.pucgoias.equacao;

import java.io.Serializable;

/**
 * Created by Heider on 02/06/2015.
 */
public class Parametros implements Serializable {

    private int valorA;
    private int valorB;
    private int valorC;

    public Parametros(int a,int b,int c) {
        this.valorA = a;
        this.valorB = b;
        this.valorC = c;
    }

    public int getA() {
        return this.valorA;
    }
    public int getB() {
        return this.valorB;
    }
    public int getC() {
        return this.valorC;
    }

}
