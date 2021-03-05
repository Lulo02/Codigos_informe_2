
package codigos_informe_2;

import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class punto1 extends javax.swing.JDialog {

protected int tamaño;
 protected int a;
 
 protected int [] arreglo;
 protected double varianza;
    protected double desviacion_e;
    public punto1(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
     
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        MEDIA = new javax.swing.JButton();
        VARIANZA = new javax.swing.JButton();
        DESVIACION = new javax.swing.JButton();
        tomar_tamaño = new javax.swing.JButton();
        mostrar_respuesta = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        mostrar_arreglo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(99, 209, 180));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 550));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MEDIA.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        MEDIA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_interfaz/botones_p1.png"))); // NOI18N
        MEDIA.setText("MEDIA ");
        MEDIA.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MEDIA.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_interfaz/botones_p1_pres.png"))); // NOI18N
        MEDIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MEDIAActionPerformed(evt);
            }
        });
        jPanel2.add(MEDIA, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 140, 90));

        VARIANZA.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        VARIANZA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_interfaz/botones_p1.png"))); // NOI18N
        VARIANZA.setText("VARIANZA");
        VARIANZA.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        VARIANZA.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_interfaz/botones_p1_pres.png"))); // NOI18N
        VARIANZA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VARIANZAActionPerformed(evt);
            }
        });
        jPanel2.add(VARIANZA, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 140, 90));

        DESVIACION.setFont(new java.awt.Font("Segoe Print", 0, 16)); // NOI18N
        DESVIACION.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_interfaz/botones_p1.png"))); // NOI18N
        DESVIACION.setText("DESVIACION");
        DESVIACION.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        DESVIACION.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_interfaz/botones_p1_pres.png"))); // NOI18N
        DESVIACION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DESVIACIONActionPerformed(evt);
            }
        });
        jPanel2.add(DESVIACION, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 140, 90));

        tomar_tamaño.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        tomar_tamaño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_interfaz/botones_p1.png"))); // NOI18N
        tomar_tamaño.setText("<html><center>Inserte el tamaño del arreglo<html>");
        tomar_tamaño.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tomar_tamaño.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_interfaz/botones_p1_pres.png"))); // NOI18N
        tomar_tamaño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tomar_tamañoActionPerformed(evt);
            }
        });
        jPanel2.add(tomar_tamaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 140, 90));

        mostrar_respuesta.setFont(new java.awt.Font("Yu Gothic Light", 0, 24)); // NOI18N
        mostrar_respuesta.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(mostrar_respuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 370, 60));

        jLabel3.setFont(new java.awt.Font("Segoe Print", 0, 30)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Respuesta:");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(174, 225, 225), null, null));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 190, 50));

        mostrar_arreglo.setFont(new java.awt.Font("Yu Gothic Light", 0, 24)); // NOI18N
        mostrar_arreglo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(mostrar_arreglo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 380, 50));

        jLabel2.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("El arreglo es: ");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(174, 225, 225), null, null));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 190, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_interfaz/fondo_p3.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 550));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MEDIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MEDIAActionPerformed
        double suma=0;
        double media;
            for(int i=0;i<a;i++){
            
                suma=suma+arreglo[i];
                            }
                
                 media=suma/a;
                 mostrar_respuesta.setText(Double.toString(media));
                 
                 
    }//GEN-LAST:event_MEDIAActionPerformed

    private void VARIANZAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VARIANZAActionPerformed
         double suma=0;
         double media;
        for(int i=0;i<a;i++){
            
                suma=suma+arreglo[i];
                            }
        media=suma/a;
        
        double rango;
        
        for(int i=0;i<a;i++){
            
            rango= Math.pow((arreglo[i]-media),2);
            varianza= (varianza+rango);
        }
        double resultado;
            resultado=varianza/(a-1);           
             mostrar_respuesta.setText(Double.toString(resultado));
    }//GEN-LAST:event_VARIANZAActionPerformed

    private void DESVIACIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DESVIACIONActionPerformed
       double suma=0;
       double media;
              for(int i=0;i<a;i++){
            
                suma=suma+arreglo[i];
                            }
        media=suma/a;
         
        double rango;
        
        for(int i=0;i<a;i++){
            
            rango= Math.pow((arreglo[i]-media),2);
            varianza= (varianza+rango);
        }
            varianza=varianza/(a-1);  
            desviacion_e= Math.sqrt(varianza);
            mostrar_respuesta.setText(Double.toString(desviacion_e));
    }//GEN-LAST:event_DESVIACIONActionPerformed

    private void tomar_tamañoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tomar_tamañoActionPerformed
         
         int tamaño=Integer.parseInt(JOptionPane.showInputDialog(""));
         
         a=tamaño;
         
        int lugar=0;
                
        arreglo = new int[a];
        for (int i=0; i<a; i++){
            
                double numero=Math.random()*100;
            arreglo[lugar]=(int) numero;
            lugar++;
            }
        
        mostrar_arreglo.setText(Arrays.toString(arreglo));
    }//GEN-LAST:event_tomar_tamañoActionPerformed



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
            java.util.logging.Logger.getLogger(punto1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(punto1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(punto1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(punto1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                punto1 dialog = new punto1(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DESVIACION;
    private javax.swing.JButton MEDIA;
    private javax.swing.JButton VARIANZA;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel mostrar_arreglo;
    private javax.swing.JLabel mostrar_respuesta;
    private javax.swing.JButton tomar_tamaño;
    // End of variables declaration//GEN-END:variables
}
