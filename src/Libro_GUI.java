
import modelo.Libro;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


/**
 *
 * @author Tiririn
 */
public class Libro_GUI extends javax.swing.JFrame {
private java.util.List<Libro> libros = new java.util.ArrayList<>();

    /**
     * Creates new form Libro_GUI
     */
    public Libro_GUI() {
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

        jblCreacion = new javax.swing.JLabel();
        jblIngresar = new javax.swing.JLabel();
        jblIngresarAutor = new javax.swing.JLabel();
        txtIngresarAutor = new javax.swing.JTextField();
        jblEstado = new javax.swing.JLabel();
        txtIngressarLlibro = new javax.swing.JTextField();
        CboxEstado = new javax.swing.JComboBox<>();
        btnCrearr = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jblCreacion.setText("CREACION DEL LIBRO");

        jblIngresar.setText("Ingresar Libro");

        jblIngresarAutor.setText("Ingresar Autor");

        txtIngresarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIngresarAutorActionPerformed(evt);
            }
        });

        jblEstado.setText("Estado");

        txtIngressarLlibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIngressarLlibroActionPerformed(evt);
            }
        });

        CboxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CboxEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CboxEstadoActionPerformed(evt);
            }
        });

        btnCrearr.setText("Crear");
        btnCrearr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearrActionPerformed(evt);
            }
        });

        btnMostrar.setText("Mostrar  Libro");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jblIngresarAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIngressarLlibro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIngresarAutor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(CboxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56))
            .addGroup(layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jblCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(btnCrearr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jblCreacion)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblIngresar)
                    .addComponent(txtIngressarLlibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblIngresarAutor)
                    .addComponent(txtIngresarAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblEstado)
                    .addComponent(CboxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearr)
                    .addComponent(btnMostrar))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIngresarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIngresarAutorActionPerformed
        // TODO add your handling code here:    
         String autor = txtIngresarAutor.getText().trim();
    if (autor.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "El campo Autor no puede estar vacío.");
    } else {
        System.out.println("Autor ingresado: " + autor);
    }
    }//GEN-LAST:event_txtIngresarAutorActionPerformed

    private void txtIngressarLlibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIngressarLlibroActionPerformed
            // TODO add your handling code here:
             String libro = txtIngressarLlibro.getText().trim();
    if (libro.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "El campo Libro no puede estar vacío.");
    } else {
        System.out.println("Libro ingresado: " + libro);
    }
         
    }//GEN-LAST:event_txtIngressarLlibroActionPerformed

    private void CboxEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CboxEstadoActionPerformed
        CboxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponible", "No Disponible"}));
    }//GEN-LAST:event_CboxEstadoActionPerformed

    private void btnCrearrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearrActionPerformed
      String titulo = txtIngressarLlibro.getText();
    String autor = txtIngresarAutor.getText();
    boolean estado = CboxEstado.getSelectedItem().toString().equals("Disponible");

    Libro libro = new Libro(1, titulo, autor);
    if (estado) {
        libro.marcarDisponible();
    } else {
        libro.marcarNoDisponible();
    }
    libros.add(libro);

    }//GEN-LAST:event_btnCrearrActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        // TODO add your handling code here:
         StringBuilder booksInfo = new StringBuilder();
    for (Libro libro : libros) {
        booksInfo.append("ID: ").append(libro.getId())
                  .append(", Título: ").append(libro.getTitulo())
                  .append(", Autor: ").append(libro.getAutor())
                  .append(", Estado: ").append(libro.disponibilidad()? "Disponible" : "No Disponible")
                  .append("\n");
    }

    javax.swing.JOptionPane.showMessageDialog(this, booksInfo.toString());
      
    }//GEN-LAST:event_btnMostrarActionPerformed

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
            java.util.logging.Logger.getLogger(Libro_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Libro_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Libro_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Libro_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Libro_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CboxEstado;
    private javax.swing.JButton btnCrearr;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JLabel jblCreacion;
    private javax.swing.JLabel jblEstado;
    private javax.swing.JLabel jblIngresar;
    private javax.swing.JLabel jblIngresarAutor;
    private javax.swing.JTextField txtIngresarAutor;
    private javax.swing.JTextField txtIngressarLlibro;
    // End of variables declaration//GEN-END:variables
}
