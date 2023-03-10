
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author prabath
 */
public class home extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    public home() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        newmenu = new javax.swing.JMenu();
        managemenu = new javax.swing.JMenu();
        listmenu = new javax.swing.JMenu();
        paymentmenu = new javax.swing.JMenu();
        logoutmenu = new javax.swing.JMenu();
        exitmenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Ubuntu Mono", 1, 90)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("/media/prabath/New Volume/works/NetBeansProjects/gym_management_system/src/main/java/pictures/gym.jpeg")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 1000, 670));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 700));

        newmenu.setIcon(new javax.swing.ImageIcon("/media/prabath/New Volume/works/NetBeansProjects/gym_management_system/src/main/java/pictures/new member.png")); // NOI18N
        newmenu.setText("New Member");
        newmenu.setFont(new java.awt.Font("Ubuntu Mono", 1, 14)); // NOI18N
        newmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newmenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(newmenu);

        managemenu.setIcon(new javax.swing.ImageIcon("/media/prabath/New Volume/works/NetBeansProjects/gym_management_system/src/main/java/pictures/update & delete member.png")); // NOI18N
        managemenu.setText("Manage Members");
        managemenu.setFont(new java.awt.Font("Ubuntu Mono", 1, 14)); // NOI18N
        managemenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                managemenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(managemenu);

        listmenu.setIcon(new javax.swing.ImageIcon("/media/prabath/New Volume/works/NetBeansProjects/gym_management_system/src/main/java/pictures/list of members.png")); // NOI18N
        listmenu.setText("Members List");
        listmenu.setFont(new java.awt.Font("Ubuntu Mono", 1, 14)); // NOI18N
        listmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listmenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(listmenu);

        paymentmenu.setIcon(new javax.swing.ImageIcon("/media/prabath/New Volume/works/NetBeansProjects/gym_management_system/src/main/java/pictures/payment.png")); // NOI18N
        paymentmenu.setText("Payments");
        paymentmenu.setFont(new java.awt.Font("Ubuntu Mono", 1, 14)); // NOI18N
        paymentmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paymentmenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(paymentmenu);

        logoutmenu.setIcon(new javax.swing.ImageIcon("/media/prabath/New Volume/works/NetBeansProjects/gym_management_system/src/main/java/pictures/logout.png")); // NOI18N
        logoutmenu.setText("Logout");
        logoutmenu.setFont(new java.awt.Font("Ubuntu Mono", 1, 14)); // NOI18N
        logoutmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutmenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(logoutmenu);

        exitmenu.setIcon(new javax.swing.ImageIcon("/media/prabath/New Volume/works/NetBeansProjects/gym_management_system/src/main/java/pictures/exit.png")); // NOI18N
        exitmenu.setText("Exit");
        exitmenu.setFont(new java.awt.Font("Ubuntu Mono", 1, 14)); // NOI18N
        exitmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitmenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(exitmenu);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutmenuMouseClicked
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null,"Do you really want to logout?","select",JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            setVisible(false);
            new login().setVisible(true);
        }
    }//GEN-LAST:event_logoutmenuMouseClicked

    private void exitmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitmenuMouseClicked
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null,"Do you really want to exit?","select",JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_exitmenuMouseClicked

    private void newmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newmenuMouseClicked
        // TODO add your handling code here:
        new newMember().setVisible(true);
    }//GEN-LAST:event_newmenuMouseClicked

    private void managemenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managemenuMouseClicked
        // TODO add your handling code here:
        new updateDeleteMember().setVisible(true);
    }//GEN-LAST:event_managemenuMouseClicked

    private void listmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listmenuMouseClicked
        // TODO add your handling code here:
        new ListOfMembers().setVisible(true);
    }//GEN-LAST:event_listmenuMouseClicked

    private void paymentmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentmenuMouseClicked
        // TODO add your handling code here:
        new Payment().setVisible(true);
    }//GEN-LAST:event_paymentmenuMouseClicked

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu exitmenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu listmenu;
    private javax.swing.JMenu logoutmenu;
    private javax.swing.JMenu managemenu;
    private javax.swing.JMenu newmenu;
    private javax.swing.JMenu paymentmenu;
    // End of variables declaration//GEN-END:variables
}
