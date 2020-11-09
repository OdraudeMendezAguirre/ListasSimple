/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import javax.swing.event.ListSelectionListener;

/**
 *
 * @author odraude
 */
public class Modificar extends javax.swing.JFrame {
    ListaAlumno lista= new ListaAlumno();
    Alumno alumno= lista.getAlumno();
    String listaNombre[]= new String [20];
    String viejo;
    Nodo nodoviejo;
    String nombre;
    double calificacion;

    /**
     * Creates new form Modificar
     */
    public Modificar() {
        initComponents();
        listasNombreNodo();
        llenarLista();
    }
     public void pasarLista(ListaAlumno lista)
    {
        this.lista=lista;
    }
     public void listasNombreNodo()
     {
         int c=-1;
        Nodo indice;
        for(indice=lista.primero;indice!=null;indice=indice.enlace)
            if(alumno.nombre.equals(indice.alumno.nombre))
            {
                c=c+1;
                listaNombre[c]=alumno.nombre;
            }
        
     }
     public void llenarLista()
     {
         rddlLista.setListData(listaNombre);
     }
     public Nodo getNodo(String viejo)
     {
        Nodo indice;
        for(indice=lista.primero;indice!=null;indice=indice.enlace)
            if(viejo.equals(indice.alumno.nombre))
                return indice.getEnlace();
        return null;
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombre = new javax.swing.JTextField();
        txtCalificacion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnOk = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        rddlLista = new javax.swing.JList<>();

        getContentPane().setLayout(null);
        getContentPane().add(txtNombre);
        txtNombre.setBounds(100, 30, 170, 40);
        getContentPane().add(txtCalificacion);
        txtCalificacion.setBounds(100, 90, 170, 40);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 30, 80, 40);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Calificacion");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 90, 80, 40);

        btnOk.setText("OK");
        btnOk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOkMouseClicked(evt);
            }
        });
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });
        getContentPane().add(btnOk);
        btnOk.setBounds(50, 150, 94, 25);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 190, 223, 78);

        rddlLista.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(rddlLista);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(278, 30, 120, 190);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnOkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOkMouseClicked
        // TODO add your handling code here:
        viejo=rddlLista.getSelectedValue();
        nodoviejo=getNodo(viejo);
        nombre=txtNombre.getText();
        calificacion=Double.parseDouble(txtCalificacion.getText());
        Alumno cambio=new Alumno(nombre, calificacion);
        lista.modificar(nodoviejo, cambio);
        VentanaPrincipal v= new VentanaPrincipal(lista);
    }//GEN-LAST:event_btnOkMouseClicked

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
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modificar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JList<String> rddlLista;
    private javax.swing.JTextField txtCalificacion;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
