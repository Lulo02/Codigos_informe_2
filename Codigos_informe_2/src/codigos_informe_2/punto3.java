
package codigos_informe_2;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class punto3 extends javax.swing.JDialog {

     protected int tamaño;
     protected int a;
     protected double [] arreglo2;
   
     public punto3(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        mostrar_arreglo = new javax.swing.JLabel();
        mostrar_respuesta = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        set_tamaño = new javax.swing.JButton();
        Insercion_asc = new javax.swing.JButton();
        MergeSort = new javax.swing.JButton();
        Seleccion_asc = new javax.swing.JButton();
        Burbuja_asc = new javax.swing.JButton();
        Insercion_des = new javax.swing.JButton();
        seleccion_des = new javax.swing.JButton();
        Burbuja_des = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        arreglo = new javax.swing.JLabel();
        ordenado = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jDialog1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jDialog1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 150));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("El arreglo es: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 230, -1));

        jLabel3.setFont(new java.awt.Font("Segoe Print", 0, 30)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Respuesta:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 190, 40));

        mostrar_arreglo.setFont(new java.awt.Font("Yu Gothic Light", 0, 24)); // NOI18N
        mostrar_arreglo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mostrar_arreglo.setText("jLabel1");
        jPanel1.add(mostrar_arreglo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 380, 50));

        mostrar_respuesta.setFont(new java.awt.Font("Yu Gothic Light", 0, 24)); // NOI18N
        mostrar_respuesta.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mostrar_respuesta.setText("jLabel1");
        jPanel1.add(mostrar_respuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 370, 60));

        jDialog1.getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 230));

        jPanel2.setBackground(new java.awt.Color(174, 225, 225));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 550));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_interfaz/botones_p1.png"))); // NOI18N
        jButton1.setText("MEDIA ");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_interfaz/botones_p1_pres.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 140, 90));

        jButton2.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_interfaz/botones_p1.png"))); // NOI18N
        jButton2.setText("VARIANZA");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_interfaz/botones_p1_pres.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 140, 90));

        jButton3.setFont(new java.awt.Font("Segoe Print", 0, 16)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_interfaz/botones_p1.png"))); // NOI18N
        jButton3.setText("DESVIACION");
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_interfaz/botones_p1_pres.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 140, 90));

        jButton4.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_interfaz/botones_p1.png"))); // NOI18N
        jButton4.setText("<html><center>Inserte el set_tamaño del arreglo<html>");
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_interfaz/botones_p1_pres.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 140, 90));

        jDialog1.getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 400, 320));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(229, 207, 229));
        jPanel4.setPreferredSize(new java.awt.Dimension(400, 550));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        set_tamaño.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        set_tamaño.setForeground(new java.awt.Color(255, 255, 255));
        set_tamaño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_interfaz/botone2_p3.png"))); // NOI18N
        set_tamaño.setText("<html><center>Inserte el tamaño del arreglo<html>");
        set_tamaño.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        set_tamaño.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_interfaz/botone2_p3_pres.png"))); // NOI18N
        set_tamaño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                set_tamañoActionPerformed(evt);
            }
        });
        jPanel4.add(set_tamaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 360, 40));

        Insercion_asc.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        Insercion_asc.setForeground(new java.awt.Color(255, 255, 255));
        Insercion_asc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_interfaz/botones_p3.png"))); // NOI18N
        Insercion_asc.setText("<html><center>INSERCIÓN ASCENDENTE<html>");
        Insercion_asc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Insercion_asc.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_interfaz/botones_p3_pres.png"))); // NOI18N
        Insercion_asc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Insercion_ascActionPerformed(evt);
            }
        });
        jPanel4.add(Insercion_asc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 170, 60));

        MergeSort.setFont(new java.awt.Font("Segoe Print", 0, 16)); // NOI18N
        MergeSort.setForeground(new java.awt.Color(255, 255, 255));
        MergeSort.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_interfaz/botones_p3.png"))); // NOI18N
        MergeSort.setText("<html><center>MERGE SORT<html>");
        MergeSort.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MergeSort.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_interfaz/botones_p3_pres.png"))); // NOI18N
        MergeSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MergeSortActionPerformed(evt);
            }
        });
        jPanel4.add(MergeSort, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 170, 60));

        Seleccion_asc.setFont(new java.awt.Font("Segoe Print", 0, 16)); // NOI18N
        Seleccion_asc.setForeground(new java.awt.Color(255, 255, 255));
        Seleccion_asc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_interfaz/botones_p3.png"))); // NOI18N
        Seleccion_asc.setText("<html><center>SELECCIÓN ASCENDENTE<html>");
        Seleccion_asc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Seleccion_asc.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_interfaz/botones_p3_pres.png"))); // NOI18N
        Seleccion_asc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Seleccion_ascActionPerformed(evt);
            }
        });
        jPanel4.add(Seleccion_asc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 170, 60));

        Burbuja_asc.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        Burbuja_asc.setForeground(new java.awt.Color(255, 255, 255));
        Burbuja_asc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_interfaz/botones_p3.png"))); // NOI18N
        Burbuja_asc.setText("<html><center>BURBUJA ASCENDENTE<html>");
        Burbuja_asc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Burbuja_asc.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_interfaz/botones_p3_pres.png"))); // NOI18N
        Burbuja_asc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Burbuja_ascActionPerformed(evt);
            }
        });
        jPanel4.add(Burbuja_asc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 170, 60));

        Insercion_des.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        Insercion_des.setForeground(new java.awt.Color(255, 255, 255));
        Insercion_des.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_interfaz/botones_p3.png"))); // NOI18N
        Insercion_des.setText("<html><center>INSERCIÓN DESCENDENTE<html>");
        Insercion_des.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Insercion_des.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_interfaz/botones_p3_pres.png"))); // NOI18N
        Insercion_des.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Insercion_desActionPerformed(evt);
            }
        });
        jPanel4.add(Insercion_des, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 170, 60));

        seleccion_des.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        seleccion_des.setForeground(new java.awt.Color(255, 255, 255));
        seleccion_des.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_interfaz/botones_p3.png"))); // NOI18N
        seleccion_des.setText("<html><center>SELECCIÓN DESCENDENTE<html>");
        seleccion_des.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        seleccion_des.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_interfaz/botones_p3_pres.png"))); // NOI18N
        seleccion_des.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccion_desActionPerformed(evt);
            }
        });
        jPanel4.add(seleccion_des, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 170, 60));

        Burbuja_des.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        Burbuja_des.setForeground(new java.awt.Color(255, 255, 255));
        Burbuja_des.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_interfaz/botones_p3.png"))); // NOI18N
        Burbuja_des.setText("<html><center>BURBUJA DESCENDENTE<html>");
        Burbuja_des.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Burbuja_des.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_interfaz/botones_p3_pres.png"))); // NOI18N
        Burbuja_des.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Burbuja_desActionPerformed(evt);
            }
        });
        jPanel4.add(Burbuja_des, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 170, 60));

        jLabel5.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Arreglo ordenado:");
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(229, 207, 229), null, null));
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 230, 50));

        jLabel4.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("El arreglo es: ");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(229, 207, 229), null, null));
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 190, -1));

        arreglo.setFont(new java.awt.Font("Yu Gothic Light", 0, 21)); // NOI18N
        arreglo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel4.add(arreglo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 380, 40));

        ordenado.setFont(new java.awt.Font("Yu Gothic Light", 0, 21)); // NOI18N
        ordenado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel4.add(ordenado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 370, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_interfaz/fondo_p4.png"))); // NOI18N
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 400, 570));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void Burbuja_ascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Burbuja_ascActionPerformed
       int longitud;
        longitud=arreglo2.length;
        double tem;
        int inverso=longitud;
                double []numeros=new double[longitud];
                
                
     for(int i=0; i<longitud-1;i++){
         for(int j=0;j<longitud-1;j++){
             if(arreglo2[j]<arreglo2[j+1]){
                 tem=arreglo2[j];
                 arreglo2[j]=arreglo2[j+1];
                 arreglo2[j+1]=tem;
             }
         }
     }   
     
         for(int i=0;i<longitud;i++){
                
                
                numeros[i]= arreglo2[inverso-1];
                inverso--;
            }
         
          ordenado.setText(Arrays.toString(numeros));
     
    }//GEN-LAST:event_Burbuja_ascActionPerformed

    private void Insercion_ascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Insercion_ascActionPerformed
         int longitud, pos;
        double aux;
        longitud=arreglo2.length;
       
        for(int i=0;i<longitud;i++){
            pos=i;
            aux=arreglo2[i];
            
            while((pos>0 && arreglo2[pos-1]> aux)){
                arreglo2 [pos]=arreglo2[pos-1];
                pos--;
            }
            arreglo2[pos]=aux;
            longitud=arreglo2.length;
        }
        ordenado.setText(Arrays.toString(arreglo2));
    }//GEN-LAST:event_Insercion_ascActionPerformed

    private void MergeSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MergeSortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MergeSortActionPerformed

    private void set_tamañoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_set_tamañoActionPerformed
        int tamaño=Integer.parseInt(JOptionPane.showInputDialog(""));
         
         a=tamaño;
         
        int lugar=0;
                
        arreglo2 = new double[a];
        for (int i=0; i<a; i++){
            
                double numero=Math.random()*100;
            arreglo2[lugar]=(int) numero;
            lugar++;
            }
        
        arreglo.setText(Arrays.toString(arreglo2));
    }//GEN-LAST:event_set_tamañoActionPerformed

    private void Seleccion_ascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Seleccion_ascActionPerformed
        int longitud;
        longitud=arreglo2.length;
       
        double menor,tem;
        int pos;
        for(int i=0; i<longitud-1;i++){
           
            menor=arreglo2[i];
            pos=i;
            for(int j=i+1;j<longitud;j++){
                if(arreglo2[j]<menor){
                  
                 menor=arreglo2[j];
                 pos=j;
               
                } 
                
            }
            if(pos!=i){
                tem=arreglo2[i];
                arreglo2[i]=arreglo2[pos];
                arreglo2[pos]=tem;
            }
            ordenado.setText(Arrays.toString(arreglo2));
        }
        
    }//GEN-LAST:event_Seleccion_ascActionPerformed

    private void Burbuja_desActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Burbuja_desActionPerformed
        int longitud;
        longitud=arreglo2.length;
        double tem;
        
     for(int i=0; i<longitud-1;i++){
         for(int j=0;j<longitud-1;j++){
             if(arreglo2[j]<arreglo2[j+1]){
                 tem=arreglo2[j];
                 arreglo2[j]=arreglo2[j+1];
                 arreglo2[j+1]=tem;
             }
         }
     }   
     
         
          ordenado.setText(Arrays.toString(arreglo2));
    }//GEN-LAST:event_Burbuja_desActionPerformed

    private void seleccion_desActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccion_desActionPerformed
        int longitud;
        longitud=arreglo2.length;
        int inverso=longitud;
                double []numeros=new double[longitud];
        double menor,tem;
        int pos;
        for(int i=0; i<longitud-1;i++){
           
            menor=arreglo2[i];
            pos=i;
            for(int j=i+1;j<longitud;j++){
                if(arreglo2[j]<menor){
                  
                 menor=arreglo2[j];
                 pos=j;
               
                } 
                
            }
            if(pos!=i){
                tem=arreglo2[i];
                arreglo2[i]=arreglo2[pos];
                arreglo2[pos]=tem;
            }}
             for(int i=0;i<longitud;i++){
                
                
                numeros[i]= arreglo2[inverso-1];
                inverso--;
            ordenado.setText(Arrays.toString(numeros));
        }
    }//GEN-LAST:event_seleccion_desActionPerformed

    private void Insercion_desActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Insercion_desActionPerformed
        int longitud, pos;
        double aux;
        longitud=arreglo2.length;
        
        int inverso=longitud;
                double []numeros=new double[longitud];
        for(int i=0;i<longitud;i++){
            pos=i;
            aux=arreglo2[i];
            
            while((pos>0 && arreglo2[pos-1]> aux)){
                arreglo2 [pos]=arreglo2[pos-1];
                pos--;
            }
            arreglo2[pos]=aux;
            longitud=arreglo2.length;
            
        }
        for(int i=0;i<longitud;i++){
                
                
                numeros[i]= arreglo2[inverso-1];
                inverso--;
            }
        
        ordenado.setText(Arrays.toString(numeros));
    }//GEN-LAST:event_Insercion_desActionPerformed

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
            java.util.logging.Logger.getLogger(punto3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(punto3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(punto3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(punto3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                punto3 dialog = new punto3(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton Burbuja_asc;
    private javax.swing.JButton Burbuja_des;
    private javax.swing.JButton Insercion_asc;
    private javax.swing.JButton Insercion_des;
    private javax.swing.JButton MergeSort;
    private javax.swing.JButton Seleccion_asc;
    private javax.swing.JLabel arreglo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel mostrar_arreglo;
    private javax.swing.JLabel mostrar_respuesta;
    private javax.swing.JLabel ordenado;
    private javax.swing.JButton seleccion_des;
    private javax.swing.JButton set_tamaño;
    // End of variables declaration//GEN-END:variables
}
