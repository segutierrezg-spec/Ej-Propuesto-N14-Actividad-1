/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciopropueston14;

/**
 *
 * @author sebas
 */
public class EjercicioPropuestoN14 {

    public static void main(String[] args) {
        double numero, cuadrado, cubo;
        numero=4;
        cuadrado=Calculos.calcular_cuadrado(numero);
        cubo=Calculos.calcular_cubo(numero);
        System.out.println("Cuadrado "+cuadrado);
        System.out.println("Cubo "+cubo);
    }
}
