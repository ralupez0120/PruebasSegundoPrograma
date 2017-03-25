/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udea.edu.com.co.programa.dos.test;

import java.io.IOException;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import static udea.edu.com.co.programa.dos.Calculos.calcularMedia;
import static udea.edu.com.co.programa.dos.Calculos.calcularVarianza;
import udea.edu.com.co.programa.dos.GestionDatos;
import udea.edu.com.co.programa.dos.ListaLigada;

/**
 *
 * @author DAVID, SANTIAGO, RAFAEL
 */
public class TestCalculos {
    GestionDatos prueba = new GestionDatos();
    ListaLigada X, Y, datos;
    double media, suma;
    
    @Test
    public void mediaCero() throws IOException{
        datos = prueba.leerDatos(",");
        media = calcularMedia(datos);
        assertTrue(media!=0);
    }
    
    @Test
    public void mediaNegativa() throws IOException{
        datos = prueba.leerDatos(",");
        media = calcularMedia(datos);
        assertTrue(media>0);
    }
    
    @Test
    public void varianzaNegativa() throws IOException{
        datos = prueba.leerDatos(",");
        media = calcularVarianza(datos);
        assertTrue(media>0);
    }
    
    @Test
    public void vectoresXYDeIgualTamaño() throws IOException{
        X = prueba.leerDatos(",");
        Y = prueba.leerDatos(",");
        assertTrue(X.getCantidadNodos()==Y.getCantidadNodos());
    }
    
}
