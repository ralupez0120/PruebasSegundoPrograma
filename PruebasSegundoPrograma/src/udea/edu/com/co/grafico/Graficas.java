/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udea.edu.com.co.grafico;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.*;
import org.jfree.chart.renderer.xy.XYSplineRenderer;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.axis.*;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.*;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import udea.edu.com.co.programa.dos.Calculos;
import udea.edu.com.co.programa.dos.GestionDatos;
import udea.edu.com.co.programa.dos.ListaLigada;
import udea.edu.com.co.programa.dos.Nodo;


/**
 *
 * @author ELVIS
 */
public class Graficas extends javax.swing.JFrame {
    DefaultTableModel modelo;   
    ListaLigada X = null, Y = null;
    double B0, B1;
    /**
     * Creates new form Graficas
     */
    public Graficas() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.lineas.setVisible(false);
        this.setVisible(true);
        lineas.setVisible(true);
        capas.setLayer(lineas,0,0);
        modelo = new DefaultTableModel();
        modelo.addColumn("X");
        modelo.addColumn("Y");
        this.datos.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        capas = new javax.swing.JLayeredPane();
        lineas = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        datos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        capas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout lineasLayout = new javax.swing.GroupLayout(lineas);
        lineas.setLayout(lineasLayout);
        lineasLayout.setHorizontalGroup(
            lineasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 416, Short.MAX_VALUE)
        );
        lineasLayout.setVerticalGroup(
            lineasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 404, Short.MAX_VALUE)
        );

        capas.setLayer(lineas, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout capasLayout = new javax.swing.GroupLayout(capas);
        capas.setLayout(capasLayout);
        capasLayout.setHorizontalGroup(
            capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
            .addGroup(capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(capasLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lineas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        capasLayout.setVerticalGroup(
            capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 426, Short.MAX_VALUE)
            .addGroup(capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(capasLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lineas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 255));
        jDesktopPane1.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jButton1.setBackground(new java.awt.Color(0, 51, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Graficar");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 51, 102));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cargar datos");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(datos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jDesktopPane1))
                .addGap(18, 18, 18)
                .addComponent(capas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(capas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ChartPanel panel;
        JFreeChart chart = null;
        //GRAFICO DE LINEAS
        int validar=1;
        XYSplineRenderer renderer = new XYSplineRenderer();
        XYSeriesCollection dataset = new XYSeriesCollection();

        ValueAxis x = new NumberAxis();
        ValueAxis y = new NumberAxis();

        XYSeries serie = new XYSeries("Datos");

        XYPlot plot;
        lineas.removeAll();
        try{
            if(X!=null && Y!=null){
                B0 = Calculos.calcularBetaCero(X, Y);
                B1 = Calculos.calcularBetaUno(X, Y);
                double[][] resultados = Calculos.calcularYkEnFuncionDeXk(X, B0, B1);
                for(int i = 0; i < resultados.length; i++){
                    serie.add(resultados[1][i],resultados[0][i]);
                }
            }
        }catch(Exception ex){
            validar = 0;
        }
        if(validar==1){
            dataset.addSeries(serie);
            x.setLabel("Eje X");
            y.setLabel("Eje Y");
            plot = new XYPlot(dataset,x,y,renderer);
            chart = new JFreeChart(plot);
            chart.setTitle("Y = "+String.format("%.3f",B0)+" + "+String.format("%.3f",B1)+"X");
        }else{
            JOptionPane.showMessageDialog(this, "Debe llenar la tabla con datos numericos");
        }
        panel = new ChartPanel(chart);
        panel.setBounds(5,10,410,350);
        lineas.add(panel);
        lineas.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            obtenerDatos();
        } catch (IOException ex) {
            Logger.getLogger(Graficas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    public void obtenerDatos() throws IOException{
        GestionDatos g = new GestionDatos();
        X = g.leerDatos(",");
        Y = g.leerDatos(",");
        Nodo p,q;
        p = X.getPrimero();
        q = Y.getPrimero();
        String[] datosXY = new String[(int)X.getCabeza().getDato()];
        while(p!=null || q!=null){
            datosXY[0] = String.valueOf(p.getDato());
            datosXY[1] = String.valueOf(q.getDato());
            modelo.addRow(datosXY);
            p = p.getSiguiente();
            q = q.getSiguiente();
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Graficas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Graficas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Graficas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Graficas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Graficas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane capas;
    private javax.swing.JTable datos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel lineas;
    // End of variables declaration//GEN-END:variables
}
