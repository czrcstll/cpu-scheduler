
package cpuscheduling;

import java.awt.Color;
import javax.swing.JOptionPane;

public class MainFrame extends javax.swing.JFrame {

    // Creates new form MainFrame
  
    public MainFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        sidePane = new javax.swing.JPanel();
        shortJobFirstNP = new javax.swing.JButton();
        firstComeFirstServe = new javax.swing.JButton();
        SJFP = new javax.swing.JButton();
        priority = new javax.swing.JButton();
        roundRobin = new javax.swing.JButton();
        dash = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidePane.setOpaque(false);
        sidePane.setLayout(null);

        shortJobFirstNP.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        shortJobFirstNP.setForeground(new java.awt.Color(255, 153, 0));
        shortJobFirstNP.setText("SJFNP");
        shortJobFirstNP.setBorderPainted(false);
        shortJobFirstNP.setContentAreaFilled(false);
        shortJobFirstNP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        shortJobFirstNP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shortJobFirstNPMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                shortJobFirstNPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                shortJobFirstNPMouseExited(evt);
            }
        });
        shortJobFirstNP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shortJobFirstNPActionPerformed(evt);
            }
        });
        sidePane.add(shortJobFirstNP);
        shortJobFirstNP.setBounds(0, 50, 130, 37);

        firstComeFirstServe.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        firstComeFirstServe.setForeground(new java.awt.Color(255, 153, 0));
        firstComeFirstServe.setText("FCFS");
        firstComeFirstServe.setBorderPainted(false);
        firstComeFirstServe.setContentAreaFilled(false);
        firstComeFirstServe.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        firstComeFirstServe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                firstComeFirstServeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                firstComeFirstServeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                firstComeFirstServeMouseExited(evt);
            }
        });
        firstComeFirstServe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstComeFirstServeActionPerformed(evt);
            }
        });
        sidePane.add(firstComeFirstServe);
        firstComeFirstServe.setBounds(0, 10, 130, 37);

        SJFP.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        SJFP.setForeground(new java.awt.Color(255, 153, 0));
        SJFP.setText("SJFP");
        SJFP.setBorderPainted(false);
        SJFP.setContentAreaFilled(false);
        SJFP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        SJFP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SJFPMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SJFPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SJFPMouseExited(evt);
            }
        });
        sidePane.add(SJFP);
        SJFP.setBounds(0, 90, 120, 37);

        priority.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        priority.setForeground(new java.awt.Color(255, 153, 0));
        priority.setText("P");
        priority.setBorderPainted(false);
        priority.setContentAreaFilled(false);
        priority.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        priority.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                priorityMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                priorityMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                priorityMouseExited(evt);
            }
        });
        sidePane.add(priority);
        priority.setBounds(0, 130, 110, 37);

        roundRobin.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        roundRobin.setForeground(new java.awt.Color(255, 153, 0));
        roundRobin.setText("RR");
        roundRobin.setBorderPainted(false);
        roundRobin.setContentAreaFilled(false);
        roundRobin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        roundRobin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roundRobinMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundRobinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundRobinMouseExited(evt);
            }
        });
        sidePane.add(roundRobin);
        roundRobin.setBounds(0, 170, 110, 37);

        jPanel1.add(sidePane, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 140, 280));

        dash.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dash.setBorderPainted(false);
        dash.setContentAreaFilled(false);
        dash.setFocusCycleRoot(true);
        dash.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashMouseClicked(evt);
            }
        });
        dash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashActionPerformed(evt);
            }
        });
        jPanel1.add(dash, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 60, 60));

        exit.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 153, 0));
        exit.setText("X");
        exit.setBorderPainted(false);
        exit.setContentAreaFilled(false);
        exit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
        });
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, -1, -1));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cpuscheduling/mainframe.png"))); // NOI18N
        jPanel1.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 902, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dashActionPerformed

    private void shortJobFirstNPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shortJobFirstNPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shortJobFirstNPActionPerformed

    private void firstComeFirstServeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstComeFirstServeActionPerformed

    }//GEN-LAST:event_firstComeFirstServeActionPerformed

    private void dashMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_dashMouseClicked

    private void firstComeFirstServeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_firstComeFirstServeMouseEntered
               firstComeFirstServe.setForeground(Color.red);
    }//GEN-LAST:event_firstComeFirstServeMouseEntered

    private void firstComeFirstServeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_firstComeFirstServeMouseClicked
                    FCFS1 fcfs = new FCFS1();
                    fcfs.setVisible(true);
                    fcfs.setResizable(false);
                    fcfs.setLocationRelativeTo(null);
                    dispose();
    }//GEN-LAST:event_firstComeFirstServeMouseClicked

    private void shortJobFirstNPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shortJobFirstNPMouseClicked
                    SJF1 sjf = new SJF1();
                    sjf.setVisible(true);
                    sjf.setResizable(false);
                    sjf.setLocationRelativeTo(null);
                    dispose();
    }//GEN-LAST:event_shortJobFirstNPMouseClicked

    private void SJFPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SJFPMouseClicked
                    SRTF1 srt = new SRTF1 ();
                    srt.setVisible(true);
                    srt.setLocationRelativeTo(null);
                    srt.setResizable(false);
                    dispose();
    }//GEN-LAST:event_SJFPMouseClicked

    private void priorityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_priorityMouseClicked
                    Priority1 prior = new Priority1();
                    prior.setVisible(true);
                    prior.setLocationRelativeTo(null);
                    prior.setResizable(false);
                    dispose();
    }//GEN-LAST:event_priorityMouseClicked

    private void roundRobinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundRobinMouseClicked
                    RoundRobin1 robin = new RoundRobin1();
                    robin.setVisible(true);
                    robin.setLocationRelativeTo(null);
                    robin.setResizable(false);
                    dispose();
    }//GEN-LAST:event_roundRobinMouseClicked

    private void firstComeFirstServeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_firstComeFirstServeMouseExited
                     firstComeFirstServe.setForeground(Color.decode("#FF9900"));
    }//GEN-LAST:event_firstComeFirstServeMouseExited

    private void shortJobFirstNPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shortJobFirstNPMouseEntered
                    shortJobFirstNP.setForeground(Color.red);
    }//GEN-LAST:event_shortJobFirstNPMouseEntered

    private void SJFPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SJFPMouseEntered
                 SJFP.setForeground(Color.red);
    }//GEN-LAST:event_SJFPMouseEntered

    private void priorityMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_priorityMouseEntered
                priority.setForeground(Color.red);
    }//GEN-LAST:event_priorityMouseEntered

    private void roundRobinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundRobinMouseExited
                 roundRobin.setForeground(Color.decode("#FF9900"));
    }//GEN-LAST:event_roundRobinMouseExited

    private void roundRobinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundRobinMouseEntered
                roundRobin.setForeground(Color.red);
    }//GEN-LAST:event_roundRobinMouseEntered

    private void shortJobFirstNPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shortJobFirstNPMouseExited
                shortJobFirstNP.setForeground(Color.decode("#FF9900"));
    }//GEN-LAST:event_shortJobFirstNPMouseExited

    private void SJFPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SJFPMouseExited
                SJFP.setForeground(Color.decode("#FF9900"));
    }//GEN-LAST:event_SJFPMouseExited

    private void priorityMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_priorityMouseExited
                priority.setForeground(Color.decode("#FF9900"));
    }//GEN-LAST:event_priorityMouseExited

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_exitMouseClicked

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
                exit.setForeground(Color.red);
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
                exit.setForeground(Color.decode("#FF9900"));
    }//GEN-LAST:event_exitMouseExited

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
         int button = JOptionPane.showConfirmDialog(this, "Are you sure you want to exit?", "Confirm exit", JOptionPane.YES_NO_OPTION);
        
        if(button != JOptionPane.YES_OPTION)
            {
                 return;
            }
 
            dispose();
            System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SJFP;
    private javax.swing.JLabel bg;
    private javax.swing.JButton dash;
    private javax.swing.JButton exit;
    private javax.swing.JButton firstComeFirstServe;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton priority;
    private javax.swing.JButton roundRobin;
    private javax.swing.JButton shortJobFirstNP;
    private javax.swing.JPanel sidePane;
    // End of variables declaration//GEN-END:variables
}
