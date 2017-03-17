/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.etec.bean;

/**
 *
 * @author Aluno
 */
public class Calculadora {
    private double Numero1;
    private double Numero2;
    private double Total;

    public double Somar (double N1, double N2){
        this.Total = N1 + N2;
        return this.Total;
    }

    public double Subtrair(double N1, double N2){
        this.Total = N1 - N2;
        return this.Total;
    }

    public double Multiplicar (double N1, double N2){
        this.Total = N1 * N2;
        return this.Total;
    }

    public double Dividir (double N1, double N2){
        if (N2 == 0){
            
        } else{
            this.Total = N1 / N2;
        }
        return this.Total;
    }
}
