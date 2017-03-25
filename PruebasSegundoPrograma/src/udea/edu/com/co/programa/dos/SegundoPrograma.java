/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udea.edu.com.co.programa.dos;

import java.io.IOException;

/**
 *
 * @author DAVID, SANTIAGO, RAFAEL
 */
public class SegundoPrograma {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        GestionDatos programa = new GestionDatos();
        ListaLigada X = programa.leerDatos(",");
        ListaLigada Y = programa.leerDatos(",");
        double B0 = Calculos.calcularBetaCero(X, Y);
        double B1 = Calculos.calcularBetaUno(X, Y);
        double[][] resultados = Calculos.calcularYkEnFuncionDeXk(X, B0, B1);
//        for(int i = 0; i < resultados.length; i++){
            System.out.print(String.format("Y = " + "%.4f",B0)+" + "+String.format("%.4f",B1)+"X");
//        }
    }
    
}
