/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udea.edu.com.co.grafico;

import java.io.IOException;
import static java.lang.Math.pow;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.*;
import org.jfree.chart.renderer.xy.XYSplineRenderer;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.axis.*;
import org.jfree.data.xy.*;
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
    ListaLigada columnaX = null, columnaY = null;
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
        
        this.labelYk1.setVisible(false);
        this.textYk.setVisible(false);
        this.btnCalcularYk.setVisible(false);
        this.labelResultYk.setVisible(false);
        this.textResultYk.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelYk = new javax.swing.JLabel();
        capas = new javax.swing.JLayeredPane();
        lineas = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        datos = new javax.swing.JTable();
        textBeta1 = new javax.swing.JTextField();
        textErreXY = new javax.swing.JTextField();
        textErre2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textBeta0 = new javax.swing.JTextField();
        textYk = new javax.swing.JTextField();
        btnCalcularYk = new javax.swing.JButton();
        textResultYk = new javax.swing.JTextField();
        labelResultYk = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        labelYk1 = new javax.swing.JLabel();

        labelYk.setText("X(k)");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        capas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout lineasLayout = new javax.swing.GroupLayout(lineas);
        lineas.setLayout(lineasLayout);
        lineasLayout.setHorizontalGroup(
            lineasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 466, Short.MAX_VALUE)
        );
        lineasLayout.setVerticalGroup(
            lineasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        capas.setLayer(lineas, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout capasLayout = new javax.swing.GroupLayout(capas);
        capas.setLayout(capasLayout);
        capasLayout.setHorizontalGroup(
            capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(capasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lineas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        capasLayout.setVerticalGroup(
            capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(capasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lineas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

        textBeta1.setEditable(false);
        textBeta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textBeta1ActionPerformed(evt);
            }
        });

        textErreXY.setEditable(false);
        textErreXY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textErreXYActionPerformed(evt);
            }
        });

        textErre2.setEditable(false);
        textErre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textErre2ActionPerformed(evt);
            }
        });

        jLabel5.setText("r(x,y)");

        jLabel3.setText("Beta 0");

        jLabel4.setText("Beta 1");

        textBeta0.setEditable(false);
        textBeta0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textBeta0ActionPerformed(evt);
            }
        });

        textYk.setText(" ");
        textYk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textYkActionPerformed(evt);
            }
        });

        btnCalcularYk.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        btnCalcularYk.setText("Y(k)");
        btnCalcularYk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularYkActionPerformed(evt);
            }
        });

        textResultYk.setEditable(false);
        textResultYk.setText(" ");
        textResultYk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textResultYkActionPerformed(evt);
            }
        });

        labelResultYk.setText("Resultado Y(k)");

        jLabel6.setText("r^2");

        labelYk1.setText("X(k)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jDesktopPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textBeta0, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textBeta1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textErreXY, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelResultYk)
                            .addComponent(jLabel6)
                            .addComponent(labelYk1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textResultYk, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(textYk, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(2, 2, 2)
                                    .addComponent(btnCalcularYk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(textErre2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(capas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(capas)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(textBeta0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textBeta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textErreXY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textErre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textYk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCalcularYk)
                            .addComponent(labelYk1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textResultYk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelResultYk))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
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
            if(columnaX!=null && columnaY!=null){
                B0 = Calculos.calcularBetaCero(columnaX, columnaY);
                B1 = Calculos.calcularBetaUno(columnaX, columnaY);
                double r = Calculos.calcularR(columnaX, columnaY);
                double[][] resultados = Calculos.calcularYkEnFuncionDeXk(columnaX, B0, B1);
                for(int i = 0; i < resultados.length; i++){
                    serie.add(resultados[1][i],resultados[0][i]);
                }
                        
                B0 = Calculos.roundDouble(B0, 4);
                B1 = Calculos.roundDouble(B1, 4);
                r = Calculos.roundDouble(r, 4);
                double rCuadrado = Calculos.roundDouble(pow(r, 2), 4);

                this.textBeta0.setText(String.valueOf(B0));
                this.textBeta1.setText(String.valueOf(B1));
                this.textErreXY.setText(String.valueOf(r));
                this.textErre2.setText(String.valueOf(rCuadrado));
                
                this.labelYk1.setVisible(true);
                this.textYk.setVisible(true);
                this.btnCalcularYk.setVisible(true);
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

    private void textBeta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textBeta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textBeta1ActionPerformed

    private void textErreXYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textErreXYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textErreXYActionPerformed

    private void textErre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textErre2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textErre2ActionPerformed

    private void textBeta0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textBeta0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textBeta0ActionPerformed

    private void textYkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textYkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textYkActionPerformed

    private void btnCalcularYkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularYkActionPerformed
        double dato=0;
        if (!this.textYk.getText().equals("")) {
            try {
                dato = Double.parseDouble(this.textYk.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese un valor numérico con formato ###.####");
            }
            double resultYk = Calculos.calcularYk(B0, B1, dato);

            resultYk = Calculos.roundDouble(resultYk, 4);

            this.labelResultYk.setVisible(true);
            this.textResultYk.setVisible(true);
            this.textResultYk.setText(String.valueOf(resultYk));

        }
    }//GEN-LAST:event_btnCalcularYkActionPerformed

    private void textResultYkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textResultYkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textResultYkActionPerformed

    public void obtenerDatos() throws IOException{
        GestionDatos g = new GestionDatos();
        columnaX = g.leerDatos(",");
        columnaY = g.leerDatos(",");
        Nodo p,q;
        p = columnaX.getPrimero();
        q = columnaY.getPrimero();
        String[] datosXY = new String[(int)columnaX.getCabeza().getDato()];
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
    private javax.swing.JButton btnCalcularYk;
    private javax.swing.JLayeredPane capas;
    private javax.swing.JTable datos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelResultYk;
    private javax.swing.JLabel labelYk;
    private javax.swing.JLabel labelYk1;
    private javax.swing.JPanel lineas;
    private javax.swing.JTextField textBeta0;
    private javax.swing.JTextField textBeta1;
    private javax.swing.JTextField textErre2;
    private javax.swing.JTextField textErreXY;
    private javax.swing.JTextField textResultYk;
    private javax.swing.JTextField textYk;
    // End of variables declaration//GEN-END:variables
}
