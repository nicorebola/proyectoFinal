/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.FinalizarPedido;
import Vistas.FrmGenerica;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import javax.swing.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class FrmFinalizarPedido extends FrmGenerica {
    
    private GestorVistaFinalizarPedido gestorVista;
    private int YES_NO_OPTION;


    public FrmFinalizarPedido(GestorVistaFinalizarPedido gestorVista) {
        try{
           initComponents();
          
           }
           catch(Exception e){

        }
        this.setGestorVista(gestorVista);
        this.onViewOpened();
        this.cargarTabla();
        //gestorVista.gestor.getjTblPedido();
    }

    public void cargarTabla() {
       

        tblPedido.setModel(gestorVista.gestor.obtenerTablaPedidos());
    }
    public GestorVistaFinalizarPedido getGestorVista() {
        return gestorVista;
    }

    public void setGestorVista(GestorVistaFinalizarPedido gestorVista) {
        this.gestorVista = gestorVista;
    }

    public FrmFinalizarPedido() {
        initComponents();
    }

    public JTable getTblPedido() {
        return tblPedido;
    }

    public void setTblPedido(JTable tblPedido) {
        this.tblPedido = tblPedido;
    }
    
//   public void viewOpenedBotones() {
//        this.getGestorVista().initializeTabla(tblPedido);
//   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(2, 0), new java.awt.Dimension(2, 0), new java.awt.Dimension(2, 32767));
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPedido = new javax.swing.JTable();
        btnFinalizar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setMaximizable(true);
        setTitle("Finalizar Preparacion de Pedido");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        setFocusable(false);
        setFont(new java.awt.Font("Adobe Fan Heiti Std B", 0, 12)); // NOI18N
        setName("Finalizar Preparacion de Pedido"); // NOI18N
        setRequestFocusEnabled(false);
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVerifyInputWhenFocusTarget(false);
        setVisible(true);

        jDesktopPane1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setText("Finalizar Preparacion de Pedido");

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 204, 204));
        jLabel14.setText("_________________________________________________________");

        tblPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Pedidos"
            }
        ));
        tblPedido.setName("tablaPedidos"); // NOI18N
        jScrollPane1.setViewportView(tblPedido);

        btnFinalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cheque.png"))); // NOI18N
        btnFinalizar.setText("Finalizar Preparacion de Pedido");
        btnFinalizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFinalizar.setName("btnFinalizar"); // NOI18N
        btnFinalizar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/comprobado.png"))); // NOI18N
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar2.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setName("btnCancelar"); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(filler1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnFinalizar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnCancelar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 867, Short.MAX_VALUE)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(45, 45, 45)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelar))))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.getGestorVista().cerrarVentana();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        //this.getGestorVista().finalizarPedido();
    }//GEN-LAST:event_btnFinalizarActionPerformed

//    void listar(){
//        this.getGestorVista().listar();
//    }
    
    //VERR ---------------------LINEA 711 FRMVentanaAdmin--------------------------
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {
        DefaultTableModel model = (DefaultTableModel) tblPedido.getModel();
        int selectedRowIndex = tblPedido.getSelectedRow();
        seleccionTxt.setText("Nombre: " + model.getValueAt(selectedRowIndex, 0).toString() + " "
                + "Descripción: " + model.getValueAt(selectedRowIndex, 1).toString() + " "
                + "ID: " + model.getValueAt(selectedRowIndex, 2).toString());
    }
   //-----------------------------------------------------
   
//@Override
//    public void onViewOpened() {
//     //tblPedido.setModel(gestorVista.gestor.obtenerTablaPedidos());
//            this.viewOpenedBotones();
//           
//       
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPedido;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JLabel seleccionTxt;
}
