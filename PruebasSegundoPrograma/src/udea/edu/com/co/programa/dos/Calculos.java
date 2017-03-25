/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udea.edu.com.co.programa.dos;

/**
 *
 * @author DAVID, RAFAEL, SANTIAGO
 */
public class Calculos {
    
    public static double calcularMedia(ListaLigada datos){
        double media = 0;
        if(datos.getCabeza().getDato()==0)
            return media;
        else{
            double numerador;
            numerador = datos.sumar();
            media = numerador/datos.getCabeza().getDato();
        }
        return media;
    }
    
    public static double calcularVarianza(ListaLigada datos){
        if(datos.getCabeza().getDato()==0) return -1;
        double varianza = 0, n, diferencia = 0, media = calcularMedia(datos);
        n = datos.getCabeza().getDato();
        Nodo p = datos.getPrimero();
        while(p!=null){
            diferencia = diferencia + Math.pow((p.getDato() - media),2);
            p = p.getSiguiente();
        }
        varianza = Math.sqrt((1/(n-1))*diferencia);
        return varianza;
    }
    
    public static double sumarProductoListas(ListaLigada X, ListaLigada Y){
        if(X.getCabeza().getDato() != Y.getCabeza().getDato() || 
                X.getCabeza().getDato()==0 || Y.getCabeza().getDato()==0) return -1;
        double suma = 0;
        Nodo p, q;
        p = X.getPrimero();
        q = Y.getPrimero();
        while(p!=null && q!=null){
            suma = suma + (p.getDato() * q.getDato());
            p = p.getSiguiente();
            q = q.getSiguiente();
        }
        return suma;
    }
    
    public static double sumaCuadratica(ListaLigada X){
        if(X.getCabeza().getDato()==0) return -1;
        double suma;
        Nodo p;
        suma = 0;
        p = X.getPrimero();
        while(p!=null){
            suma = suma + Math.pow(p.getDato(),2);
            p = p.getSiguiente();
        }
        return suma;
    }
    
    public static double calcularBetaUno(ListaLigada X, ListaLigada Y){
        double beta = 0, numerador, denominador, n, xMedia, yMedia;
        xMedia = calcularMedia(X);
        yMedia = calcularMedia(Y);
        n = X.getCabeza().getDato();
        numerador = sumarProductoListas(X, Y) - (n * xMedia * yMedia);
        denominador = sumaCuadratica(X) - (n * Math.pow(xMedia, 2));
        try{
        beta = numerador / denominador;
        }catch(Exception e){
            System.out.println("No se puede dividir por cero");
        }
        return beta;
    }
    
    public static double calcularBetaCero(ListaLigada X, ListaLigada Y){
        double xMedia, yMedia, beta2;
        xMedia = calcularMedia(X);
        yMedia = calcularMedia(Y);
        beta2 = yMedia - (calcularBetaUno(X, Y) * xMedia);
        return beta2;
    }
    
    public static double calcularR(ListaLigada X, ListaLigada Y){
        double n, numerador, denominador, calculosX, calculosY, r = 0;
        if(X.getCabeza().getDato() == 0) return 0;
        n = X.getCabeza().getDato();
        numerador = (n * sumarProductoListas(X, Y)) - (X.sumar() * Y.sumar());
        calculosX = (n * sumaCuadratica(X) - Math.pow(X.sumar(), 2));
        calculosY = (n * sumaCuadratica(Y) - Math.pow(Y.sumar(), 2));
        denominador = Math.sqrt(calculosX * calculosY);
        try{
            r = numerador / denominador;
        }catch(Exception e){
            System.out.println("No se puede dividir por cero");
        }
        return r;
    }
    
    public static double[][] calcularYkEnFuncionDeXk(ListaLigada X, double beta0, double beta1){
        if(X.getCantidadNodos()==0) return null;
        Nodo p = X.getPrimero();
        double[][] Y = new double[(int)X.getCantidadNodos()][(int)X.getCantidadNodos()];
        int i = 0;
        while(p!=null){
            Y[0][i] = beta0 + (beta1 * p.getDato());            
            Y[1][i] = p.getDato();
            i = i + 1;
            p = p.getSiguiente();
        }
        return Y;
    }
    
    public static double calcularYk(double beta0, double beta1, double xk){
        return (beta0 + (beta1*xk));
    }
    
    public static double roundDouble(double value, int places) {
    if (places < 0) throw new IllegalArgumentException();

    long factor = (long) Math.pow(10, places);
    value = value * factor;
    long tmp = Math.round(value);
    return (double) tmp / factor;
}
    
}
