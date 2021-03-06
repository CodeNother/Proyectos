/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_huffman.Vista;

import java.awt.Dimension;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import proyecto_huffman.Controlador.ControlerTexto;

/**
 *
 * @author Jhonatan Alexander P
 */
public class Index extends javax.swing.JFrame {

    ControlerTexto CnTex = new ControlerTexto();
    String[][] mat;
    String [][] aux;
    String [][] prueba;
    int cont;

    /**
     * Creates new form Index
     */
    public Index() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Huffman = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblHuffman = new javax.swing.JTable();
        TxtEntropia = new javax.swing.JTextField();
        Btnentropia = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        JmenuBar = new javax.swing.JMenuBar();
        JemnuArchivo = new javax.swing.JMenu();
        Jmi_Cargar = new javax.swing.JMenuItem();
        Jmi_Texto = new javax.swing.JMenuItem();
        JmiSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Proyecto Huffman\n");

        Panel_Huffman.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Tabla de probabilidades y Codificacion huffman");

        TblHuffman.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true)));
        TblHuffman.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Letra", "Probabilidad", "Codificacion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TblHuffman);

        TxtEntropia.setEditable(false);
        TxtEntropia.setText(" ");

        Btnentropia.setText("Generar Entropia");
        Btnentropia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnentropiaActionPerformed(evt);
            }
        });

        jLabel2.setText("Campo de texto donde se muestra la entropia");

        javax.swing.GroupLayout Panel_HuffmanLayout = new javax.swing.GroupLayout(Panel_Huffman);
        Panel_Huffman.setLayout(Panel_HuffmanLayout);
        Panel_HuffmanLayout.setHorizontalGroup(
            Panel_HuffmanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_HuffmanLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel1)
                .addContainerGap(113, Short.MAX_VALUE))
            .addGroup(Panel_HuffmanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel_HuffmanLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(Panel_HuffmanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Panel_HuffmanLayout.createSequentialGroup()
                            .addComponent(TxtEntropia)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Btnentropia))
                        .addGroup(Panel_HuffmanLayout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(0, 205, Short.MAX_VALUE)))
                    .addContainerGap())
                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE))
        );
        Panel_HuffmanLayout.setVerticalGroup(
            Panel_HuffmanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_HuffmanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(419, Short.MAX_VALUE))
            .addGroup(Panel_HuffmanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel_HuffmanLayout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(Panel_HuffmanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TxtEntropia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Btnentropia))
                    .addContainerGap()))
        );

        JemnuArchivo.setText("Seleccione Opcion");

        Jmi_Cargar.setText("Cargar Un Archivo");
        Jmi_Cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jmi_CargarActionPerformed(evt);
            }
        });
        JemnuArchivo.add(Jmi_Cargar);

        Jmi_Texto.setText("Escribir Texto");
        Jmi_Texto.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                Jmi_TextoMouseWheelMoved(evt);
            }
        });
        Jmi_Texto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jmi_TextoActionPerformed(evt);
            }
        });
        JemnuArchivo.add(Jmi_Texto);

        JmiSalir.setText("Salir");
        JemnuArchivo.add(JmiSalir);

        JmenuBar.add(JemnuArchivo);

        setJMenuBar(JmenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel_Huffman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Panel_Huffman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Jmi_CargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jmi_CargarActionPerformed
        
        JFileChooser selecionarArchivos = new JFileChooser();
        int opcion = selecionarArchivos.showOpenDialog(this);
        if (opcion == JFileChooser.APPROVE_OPTION) {
            String ruta = selecionarArchivos.getSelectedFile().toString();
            String Texto = CnTex.ObtenerTexto(ruta);
           
            mat = CnTex.Cantidad_caracteres(Texto);
            
            cont = CnTex.DevolverFilas();            
            mat=CnTex.Organizar_Matriz(mat, cont); 
            prueba=mat;
            mat=CnTex.Huffman(mat, cont); 
            CnTex.Guardar_Caracteres(cont, prueba);
            aux=CnTex.AsignarCodigo();
            Mostrar_Matriz(aux, cont);
            
        }        // TODO add your handling code here:
    }//GEN-LAST:event_Jmi_CargarActionPerformed

    private void BtnentropiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnentropiaActionPerformed
        CnTex.Entropia=0;
        aux=CnTex.AsignarCodigo();
        TxtEntropia.setText(Double.toString(CnTex.GenerarEntropia(aux, cont-1)) + " Bits/Simb");
    }//GEN-LAST:event_BtnentropiaActionPerformed

    private void Jmi_TextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jmi_TextoActionPerformed
 
       
          dispose();// TODO add your handling code here:
    }//GEN-LAST:event_Jmi_TextoActionPerformed

    private void Jmi_TextoMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_Jmi_TextoMouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_Jmi_TextoMouseWheelMoved

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
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });
    }

    public void Mostrar_Matriz(String Mat[][], int n) {
        DefaultTableModel model = (DefaultTableModel) TblHuffman.getModel();
        model.setRowCount(n);
        //model.setColumnCount(3);

        for (int x = 0; x < n; x++) {
            for (int y = 0; y < 3; y++) {
                TblHuffman.setValueAt(Mat[x][y], x, y);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btnentropia;
    private javax.swing.JMenu JemnuArchivo;
    private javax.swing.JMenuBar JmenuBar;
    private javax.swing.JMenuItem JmiSalir;
    private javax.swing.JMenuItem Jmi_Cargar;
    private javax.swing.JMenuItem Jmi_Texto;
    private javax.swing.JPanel Panel_Huffman;
    private javax.swing.JTable TblHuffman;
    private javax.swing.JTextField TxtEntropia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
