/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udea.edu.com.co.programa.dos;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author DAVID, SANTIAGO, RAFAEL
 */
public class GestionDatos extends JFrame{
    private JFrame mainFrame;
    
    public String abrirArchivo(){
        String fileName = "";
        JFileChooser  fileDialog = new JFileChooser();
        int returnVal = fileDialog.showOpenDialog(mainFrame);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
               fileName = fileDialog.getSelectedFile().getAbsolutePath();
        } else { 
           fileName = "";
        }
        return fileName;
    }
    
    public ListaLigada leerDatos(String delimiter) throws FileNotFoundException, IOException{
        String filePath = abrirArchivo();
        ListaLigada values = new ListaLigada();
        InputStream in = null;
        BufferedInputStream s;
        BufferedReader myInput;
        StringTokenizer st;
        Nodo value = null;
        double dato = 0;
        try{
            in = new FileInputStream(filePath);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No ha abierto ningun archivo");
            return null;
        }
        String thisLine;
        s = new BufferedInputStream(in);
        myInput = new BufferedReader(new InputStreamReader(s));
        while ((thisLine = myInput.readLine()) != null) {
            st = new StringTokenizer(thisLine, delimiter);
            while(st.hasMoreElements()){
                try{
                    dato = Double.parseDouble((String) st.nextElement());
                } catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null,"Error al cargar los datos.\n Formato erròneo\nPor favor verifique el archivo e intente nuevamente :)");
                    ListaLigada leerDatos = leerDatos(delimiter);
                    return leerDatos;
                }                
                value = new Nodo(dato);
                values.addNodo(value);
            }
        }
        return(values);
    }
    
    
}
