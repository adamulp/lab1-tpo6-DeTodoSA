/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas;

import entidades.Producto;
import entidades.Rubro;
import java.util.TreeSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hollmann
 */
public class ConsultaPorPrecio extends javax.swing.JInternalFrame {
    private TreeSet<Producto> productos;
     private DefaultTableModel modelo = new DefaultTableModel();
    /**
     * Creates new form consultaPorPrecio
     */
    public ConsultaPorPrecio(TreeSet<Producto> productos) {
        this.productos=productos;
        initComponents();
        armarCabecera();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtListado = new javax.swing.JTable();
        jtPrecioMin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtPrecioMax = new javax.swing.JTextField();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Listado de productos por precio");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Entre $:");

        jtListado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Descripcion", "Precio", "Stock"
            }
        ));
        jScrollPane1.setViewportView(jtListado);

        jtPrecioMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPrecioMinActionPerformed(evt);
            }
        });
        jtPrecioMin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtPrecioMinKeyReleased(evt);
            }
        });

        jLabel3.setText("Y");

        jtPrecioMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPrecioMaxActionPerformed(evt);
            }
        });
        jtPrecioMax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtPrecioMaxKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtPrecioMin, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtPrecioMax, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtPrecioMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtPrecioMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//    private void armarCabecera(){
//    
//    }
    private void jtPrecioMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPrecioMinActionPerformed
   
    }//GEN-LAST:event_jtPrecioMinActionPerformed

    public Producto buscarPorPrecio(){
        String txPrecioMin = jtPrecioMin.getText();
        String txPrecioMax = jtPrecioMax.getText();

        if (txPrecioMin.isEmpty() || txPrecioMax.isEmpty()) {
            return null;
        }
        
        // CONVIERTE LOS VALORES RECIBIDOS A NUMEROS
        double precioMin;
        double precioMax;
        try {
            precioMin = Double.parseDouble(txPrecioMin);
            precioMax = Double.parseDouble(txPrecioMax);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese valores numéricos válidos para el precio mínimo y máximo.", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }

        // LIMPIA LA TABLA ANTES DE AGREGAR NUEVOS RESULTADOS
        borrarLista();

        // BUCLE QUE BUSCA LOS PRODUCTOS DENTRO DEL RANGO
        for (Producto prod : productos) {
            if (prod.getPrecio() >= precioMin && prod.getPrecio() <= precioMax) {
                cargarRenglos(prod);
            }
        }
        return null;
    }
    
    
      public void cargarRenglos(Producto producto) {
        Vector fila = new Vector();
        fila.add(producto.getCodigo());
        fila.add(producto.getDescripcion());
        fila.add(producto.getPrecio());
        fila.add(producto.getStock());
        modelo.addRow(fila);
    }
    
    private void jtPrecioMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPrecioMaxActionPerformed
        
    }//GEN-LAST:event_jtPrecioMaxActionPerformed

    private void jtPrecioMinKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPrecioMinKeyReleased
        borrarLista();
        buscarPorPrecio();
      
    }//GEN-LAST:event_jtPrecioMinKeyReleased

    private void jtPrecioMaxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPrecioMaxKeyReleased
       borrarLista();
       buscarPorPrecio();
    }//GEN-LAST:event_jtPrecioMaxKeyReleased

      private void armarCabecera() {
        modelo.addColumn("Codigo");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Precio");
        modelo.addColumn("Stock");
        jtListado.setModel(modelo);
    }
      
        public void borrarLista() {
        int filas = modelo.getRowCount() - 1;
        for (int i = filas; i >= 0; i--) {
            modelo.removeRow(i);
        }

    }
      


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtListado;
    private javax.swing.JTextField jtPrecioMax;
    private javax.swing.JTextField jtPrecioMin;
    // End of variables declaration//GEN-END:variables
}
