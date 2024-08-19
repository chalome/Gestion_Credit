package Vues.Main;

import Utilities.Functions;
import Vues.form.Form0;
import Vues.form.Form1;
import Vues.form.Form2;
import Vues.form.Form3;
import Vues.form.Form4;
import Vues.form.Form5;
import Vues.form.Form6;
import Vues.swing.EventNavigationBar;
import Vues.swing.NavigationBackgroundColor;
import com.formdev.flatlaf.intellijthemes.FlatLightFlatIJTheme;
import java.awt.Color;
import javax.swing.ImageIcon;

public class MainForm extends javax.swing.JFrame {

    public MainForm() {
        initComponents();
        Functions.setDette();
        FlatLightFlatIJTheme.setup();
        getContentPane().setBackground(new Color(240, 240, 240));
        navigationBar1.addItem(new ImageIcon(getClass().getResource("/Vues/icon/item1.png")));
        navigationBar1.addItem(new ImageIcon(getClass().getResource("/Vues/icon/item2.png")));
        navigationBar1.addItem(new ImageIcon(getClass().getResource("/Vues/icon/item3.png")));
        navigationBar1.addItem(new ImageIcon(getClass().getResource("/Vues/icon/item4.png")));
        navigationBar1.addItem(new ImageIcon(getClass().getResource("/Vues/icon/item5.png")));
        navigationBar1.addItem(new ImageIcon(getClass().getResource("/Vues/icon/item3.png")));
        navigationBar1.addItem(new ImageIcon(getClass().getResource("/Vues/icon/item4.png")));
        navigationBar1.addEvent(new EventNavigationBar() {
            @Override
            public void beforeSelected(int index) {
                if (index == 1) {
                    panelTransaction1.display(new Form1(), navigationBar1.getAnimator());
                } else if (index == 2) {
                    panelTransaction1.display(new Form2(), navigationBar1.getAnimator());
                } else if (index == 3) {
                    panelTransaction1.display(new Form3(), navigationBar1.getAnimator());
                } else if (index == 4) {
                    panelTransaction1.display(new Form4(), navigationBar1.getAnimator());
                } else if (index == 6) {
                    panelTransaction1.display(new Form5(), navigationBar1.getAnimator());
                } else if (index == 5) {
                    panelTransaction1.display(new Form6(), navigationBar1.getAnimator());
                } else if (index == 0) {
                    panelTransaction1.display(new Form0(), navigationBar1.getAnimator());
                }
            }

            @Override
            public void afterSelected(int index) {

            }
        });
        NavigationBackgroundColor nb = new NavigationBackgroundColor();
        nb.apply(getContentPane());
        nb.addColor(0, new Color(240, 240, 240));
        nb.addColor(1, new Color(240, 240, 240));
        nb.addColor(2, new Color(240, 240, 240));
        nb.addColor(3, new Color(240, 240, 240));
        nb.addColor(4, new Color(240, 240, 240));
        nb.addColor(5, new Color(240, 240, 240));
        navigationBar1.setnavigationBackgroundColor(nb);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        navigationBar1 = new Vues.swing.NavigationBar();
        panelTransaction1 = new Vues.transitions.PanelTransitions();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout navigationBar1Layout = new javax.swing.GroupLayout(navigationBar1);
        navigationBar1.setLayout(navigationBar1Layout);
        navigationBar1Layout.setHorizontalGroup(
            navigationBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        navigationBar1Layout.setVerticalGroup(
            navigationBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navigationBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelTransaction1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelTransaction1, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(navigationBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        navigationBar1.initSelectedIndex(0);        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MainForm().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Vues.swing.NavigationBar navigationBar1;
    private Vues.transitions.PanelTransitions panelTransaction1;
    // End of variables declaration//GEN-END:variables
}
