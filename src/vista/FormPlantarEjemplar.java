/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import entidades.Ejemplares;
import entidades.Localizaciones;
import entidades.Plantas;
import utils.DateLabelFormatter;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

/**
 *
 * @author luis
 */
public class FormPlantarEjemplar extends javax.swing.JFrame implements ActionListener {

    static FormGESEjemplares padre;
    static Ejemplares ejemplar;
    private JDatePickerImpl datePicker;

    /**
     * Creates new form FormNuevaLocalizacion
     */
    public FormPlantarEjemplar(FormGESEjemplares fpadre, Ejemplares ej) {
        initComponents();
        this.padre = fpadre;
        this.ejemplar = ej;

        this.jTextFieldId.setText(String.valueOf(this.ejemplar.getId()));
        this.jTextFieldEdad.setText(String.valueOf(this.ejemplar.getEdad()));
        this.jTextFieldFechaCompra.setText(String.valueOf(this.ejemplar.getFechaCompra()));

        try {
            javax.persistence.EntityManager entityManager0 = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("bdinvernadero?zeroDateTimeBehavior=convertToNullPU").createEntityManager();

            Long idPlanta = (Long) this.ejemplar.getIdPlanta();
            TypedQuery<Plantas> findPlantaById = entityManager0.createNamedQuery("Plantas.findById", Plantas.class);
            findPlantaById.setParameter("id", idPlanta);
            List<Plantas> result = findPlantaById.getResultList();
            if (result.size() > 0) {
                Plantas p = (Plantas) result.get(0);
                this.jTextFieldPlanta.setText(p.getNombre().toString());
            }
        } catch (Exception ex) {

        }

        UtilDateModel model = new UtilDateModel();
        // model.setDate(LocalDate.now().getYear(), LocalDate.now().getMonthValue(), LocalDate.now().getDayOfMonth());
        model.setSelected(true);

        Properties p = new Properties();
        p.put("text.today", "Hoy");
        p.put("text.month", "Mes");
        p.put("text.year", "Año");
        JDatePanelImpl datePanel = new JDatePanelImpl(model, p);

        datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
        jButtonFechaPlantacion.add(datePicker);

        jButtonFechaPlantacion.addActionListener(this);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("bdinvernadero?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        plantasQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT p FROM Plantas p");
        plantasList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : plantasQuery.getResultList();
        plantasQuery1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT p FROM Plantas p");
        plantasList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : plantasQuery1.getResultList();
        localizacionesQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT l FROM Localizaciones l");
        localizacionesList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : localizacionesQuery.getResultList();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonResetearCampos = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();
        jButtonAplicar = new javax.swing.JButton();
        jPanelLogitud = new javax.swing.JPanel();
        jLabelId = new javax.swing.JLabel();
        jTextFieldFechaCompra = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldPlanta = new javax.swing.JTextField();
        jTextFieldEdad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jPanelLogitud1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButtonFechaPlantacion = new javax.swing.JButton();
        jComboBoxLocalizaciones = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Plantar Ejemplar");

        jButtonResetearCampos.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButtonResetearCampos.setText("Borrar campos");
        jButtonResetearCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetearCamposActionPerformed(evt);
            }
        });

        jButtonVolver.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        jButtonAplicar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButtonAplicar.setText("Aplicar");
        jButtonAplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAplicarActionPerformed(evt);
            }
        });

        jPanelLogitud.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 255, 0)));
        jPanelLogitud.setToolTipText("La longitud es un ángulo imaginario determinado por el Meridiano de Greenwich o Meridiano 0, que divide el mundo en dos regiones, la occidental (Oeste) y la oriental (Este).   \n");

        jLabelId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelId.setText("Id");
        jLabelId.setToolTipText("");

        jTextFieldFechaCompra.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextFieldFechaCompra.setToolTipText("");
        jTextFieldFechaCompra.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Planta");
        jLabel3.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Fecha de compra");
        jLabel4.setToolTipText("");

        jTextFieldPlanta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextFieldPlanta.setToolTipText("");
        jTextFieldPlanta.setEnabled(false);

        jTextFieldEdad.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextFieldEdad.setToolTipText("");
        jTextFieldEdad.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Edad");
        jLabel5.setToolTipText("");

        jTextFieldId.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextFieldId.setToolTipText("");
        jTextFieldId.setEnabled(false);

        javax.swing.GroupLayout jPanelLogitudLayout = new javax.swing.GroupLayout(jPanelLogitud);
        jPanelLogitud.setLayout(jPanelLogitudLayout);
        jPanelLogitudLayout.setHorizontalGroup(
            jPanelLogitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLogitudLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLogitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLogitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelLogitudLayout.createSequentialGroup()
                            .addComponent(jLabelId)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5))
                        .addGroup(jPanelLogitudLayout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(83, 83, 83)))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelLogitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLogitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextFieldFechaCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                        .addComponent(jTextFieldPlanta))
                    .addComponent(jTextFieldEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
        jPanelLogitudLayout.setVerticalGroup(
            jPanelLogitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLogitudLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelLogitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelId)
                    .addComponent(jTextFieldEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelLogitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldFechaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanelLogitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldPlanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(123, 123, 123))
        );

        jPanelLogitud1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 255, 0)));
        jPanelLogitud1.setToolTipText("La longitud es un ángulo imaginario determinado por el Meridiano de Greenwich o Meridiano 0, que divide el mundo en dos regiones, la occidental (Oeste) y la oriental (Este).   \n");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Localización");
        jLabel6.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Fecha de plantación");
        jLabel7.setToolTipText("");

        jButtonFechaPlantacion.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButtonFechaPlantacion.setText("Fecha");

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${resultList}");
        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, localizacionesQuery, eLProperty, jComboBoxLocalizaciones);
        bindingGroup.addBinding(jComboBoxBinding);

        javax.swing.GroupLayout jPanelLogitud1Layout = new javax.swing.GroupLayout(jPanelLogitud1);
        jPanelLogitud1.setLayout(jPanelLogitud1Layout);
        jPanelLogitud1Layout.setHorizontalGroup(
            jPanelLogitud1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLogitud1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLogitud1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLogitud1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(36, 36, 36)
                        .addComponent(jComboBoxLocalizaciones, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelLogitud1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addComponent(jButtonFechaPlantacion, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        jPanelLogitud1Layout.setVerticalGroup(
            jPanelLogitud1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLogitud1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelLogitud1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jButtonFechaPlantacion))
                .addGap(7, 7, 7)
                .addGroup(jPanelLogitud1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBoxLocalizaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(122, 122, 122))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelLogitud1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelLogitud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonAplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jButtonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonResetearCampos))))
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelLogitud, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jPanelLogitud1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonResetearCampos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAplicar)
                    .addComponent(jButtonVolver))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        //this.padre.getJTable().repaint();
        this.dispose();
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButtonAplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAplicarActionPerformed

        boolean ok = true;
        String msj = "";
        if (this.datePicker.getJFormattedTextField().getText().isEmpty()) {
            ok = false;
            msj += "\nLa fecha de plantación es obligatoria.";
        }
        if (this.jComboBoxLocalizaciones.getSelectedIndex() == -1) {
            ok = false;
            msj += "\nLa localización es obligatoria.";
        }

        if (!ok) {
            JOptionPane.showMessageDialog(this, "Debe solucionar los siguientes problemas:\n" + msj, "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        } else {

            javax.persistence.EntityManager entityManager0 = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("bdinvernadero?zeroDateTimeBehavior=convertToNullPU").createEntityManager();

            Long idPlanta = (Long) this.ejemplar.getIdPlanta();
            TypedQuery<Plantas> findPlantaById = entityManager0.createNamedQuery("Plantas.findById", Plantas.class);
            findPlantaById.setParameter("id", idPlanta);
            List<Plantas> result = findPlantaById.getResultList();
            Plantas p;
            if (result.size() > 0) {
                p = (Plantas) result.get(0);
                msj = "\nID:" + this.jTextFieldId.getText() + "(" + p.getNombre() + ")";
            }
            msj += "\nFecha de plantación:" + this.jTextFieldFechaCompra.getText() + "\nLocalización: " + ((Localizaciones) this.jComboBoxLocalizaciones.getSelectedItem()).toString();
            Object[] opciones = {"Sí", "No"};
            int i = JOptionPane.showOptionDialog(this, "¿Son los datos de la plantación del Ejemplar correctos?\n" + msj, "Plantar Ejemplar", JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
            if (i == JOptionPane.NO_OPTION) {
                return;
            }

            try {
                this.ejemplar.setId(Long.valueOf(this.jTextFieldId.getText()));
                this.ejemplar.setEdad(Integer.valueOf(this.jTextFieldEdad.getText()));
                this.ejemplar.setIdLocalizacion(BigInteger.valueOf(((Localizaciones) this.jComboBoxLocalizaciones.getSelectedItem()).getId()));
                String fechaCompraStr = this.datePicker.getJFormattedTextField().getText();
                DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                
                Date fechaPlantacion = java.sql.Date.valueOf(LocalDate.parse(fechaCompraStr, dateFormatter));
                
                this.ejemplar.setFechaPlantacion(fechaPlantacion);

                entityManager0.getTransaction().begin();
                entityManager0.merge(this.ejemplar);

                entityManager0.getTransaction().commit();
                JOptionPane.showMessageDialog(this, "Se ha añadido correctamente los datos de la plantación del jemplar.");

                Point location = this.padre.getLocation();
                this.padre.dispose();
                this.padre = new FormGESEjemplares();
                this.padre.setLocation(location);
                this.padre.setVisible(true);
                this.dispose();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "ERROR al añadir los datos de la plantación del jemplar.", "ERROR", JOptionPane.ERROR_MESSAGE);
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_jButtonAplicarActionPerformed

    private void jButtonResetearCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetearCamposActionPerformed

        this.jTextFieldFechaCompra.setText("");

    }//GEN-LAST:event_jButtonResetearCamposActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:

    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(FormPlantarEjemplar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPlantarEjemplar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPlantarEjemplar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPlantarEjemplar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPlantarEjemplar(padre, ejemplar).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jButtonAplicar;
    private javax.swing.JButton jButtonFechaPlantacion;
    private javax.swing.JButton jButtonResetearCampos;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JComboBox<String> jComboBoxLocalizaciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelLogitud;
    private javax.swing.JPanel jPanelLogitud1;
    private javax.swing.JTextField jTextFieldEdad;
    private javax.swing.JTextField jTextFieldFechaCompra;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldPlanta;
    private java.util.List<entidades.Localizaciones> localizacionesList;
    private javax.persistence.Query localizacionesQuery;
    private java.util.List<entidades.Plantas> plantasList;
    private java.util.List<entidades.Plantas> plantasList1;
    private javax.persistence.Query plantasQuery;
    private javax.persistence.Query plantasQuery1;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
