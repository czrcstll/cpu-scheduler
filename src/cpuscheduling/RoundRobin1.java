
package cpuscheduling;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RoundRobin1 extends javax.swing.JFrame {
    
  
    int holder = 1; //row index iterator
    String row[] = new String[3]; //process,at,bt
    private DefaultTableModel model; //table
   
    private ArrayList<Integer> burstTime = new ArrayList<>();
    private ArrayList<Integer> arrivalTime = new ArrayList<>();
    private ArrayList<Integer> processNo = new ArrayList<>();
    
    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();
   
    double aveTAT = 0, aveWT = 0;
    int gantt = 0;
    

     // Creates new form FCFS1

    public RoundRobin1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        gantPane = new javax.swing.JScrollPane();
        gantPanel = new javax.swing.JPanel();
        tablePane = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        add = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        back = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        qt = new javax.swing.JTextField();
        bt = new javax.swing.JTextField();
        avewt = new javax.swing.JLabel();
        avetat = new javax.swing.JLabel();
        compute = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gantPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        gantPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));
        gantPane.setViewportView(gantPanel);

        jPanel1.add(gantPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, 570, 70));

        tablePane.setBackground(new java.awt.Color(236, 240, 243));
        tablePane.setBorder(null);
        tablePane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        tablePane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablePane.setOpaque(false);

        jTable1.setBackground(new java.awt.Color(236, 240, 243));
        jTable1.setForeground(new java.awt.Color(253, 116, 44));
        Object[] columns = { "         PROCESS", "      BURST TIME", "    ARRIVAL TIME", "   COMPLETION ", "  TURN AROUND", "    WAITING TIME"};
        model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        jTable1.setModel(model
        );
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setEnabled(false);
        jTable1.setGridColor(new java.awt.Color(236, 240, 243));
        tablePane.setViewportView(jTable1);

        jPanel1.add(tablePane, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 710, 220));

        add.setFont(new java.awt.Font("Arial", 1, 43)); // NOI18N
        add.setForeground(new java.awt.Color(255, 158, 86));
        add.setText("+");
        add.setBorderPainted(false);
        add.setContentAreaFilled(false);
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addMouseExited(evt);
            }
        });
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 60, 60));

        exit.setFont(new java.awt.Font("Arial", 1, 29)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 158, 86));
        exit.setText("X");
        exit.setBorderPainted(false);
        exit.setContentAreaFilled(false);
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
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
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 60, 70));

        back.setFont(new java.awt.Font("Arial", 1, 40)); // NOI18N
        back.setForeground(new java.awt.Color(255, 158, 86));
        back.setText("<");
        back.setBorderPainted(false);
        back.setContentAreaFilled(false);
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backMouseExited(evt);
            }
        });
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 60, 40));

        delete.setFont(new java.awt.Font("Arial", 1, 60)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 158, 86));
        delete.setText("-");
        delete.setBorderPainted(false);
        delete.setContentAreaFilled(false);
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteMouseExited(evt);
            }
        });
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 60, 60));

        qt.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        qt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtActionPerformed(evt);
            }
        });
        jPanel1.add(qt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 50, 20));

        bt.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jPanel1.add(bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 60, 20));

        avewt.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        avewt.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(avewt, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 40, 30));

        avetat.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        avetat.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(avetat, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, 40, 30));

        compute.setFont(new java.awt.Font("Arial", 1, 43)); // NOI18N
        compute.setForeground(new java.awt.Color(255, 158, 86));
        compute.setText("=");
        compute.setBorderPainted(false);
        compute.setContentAreaFilled(false);
        compute.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                computeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                computeMouseExited(evt);
            }
        });
        compute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computeActionPerformed(evt);
            }
        });
        jPanel1.add(compute, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 60, 40));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cpuscheduling/roundrobin.png"))); // NOI18N
        bg.setText("jLabel1");
        jPanel1.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 902, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void qtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtActionPerformed

    
    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        
        qt.setEnabled(false); // disable editablility of quantum time

        
        int arr = 0; 
        
        //row is column in Jtable 
        row[0] = Integer.toString(holder); //holder for process
        row[1] = bt.getText(); //getText bc of ArrayList
        row[2] = Integer.toString(arr); //set all arrival time to 0

        model.addRow(row); //inside JTable sineset manually yung rows
        processNo.add(Integer.parseInt(row[0])); // adds value to process row/column
        burstTime.add(Integer.parseInt(row[1])); //adds value to burst row/column
        arrivalTime.add(Integer.parseInt(row[2])); //adds value to arrival row/column

        //every click adds table
        holder++;
  
    }//GEN-LAST:event_addActionPerformed
//RoundRobin
    private void computeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computeActionPerformed
        //Compute button
        
        String qtext = qt.getText();
        int quantumTime = Integer.parseInt(qtext);
        
          double aveTAT = 0;
          double aveWT= 0;
          int time = 0; //temp storage for ct
          //int arr = 0;
          //array for ct, tat,wt
          int completionTime[]= new int[burstTime.size()];
          int turnaroundTime[]= new int[burstTime.size()];
          int waitingTime[]= new int[burstTime.size()];
        
        int burst[] = new int[burstTime.size()];
        for(int i = 0; i < burstTime.size(); i++){
            burst[i] = burstTime.get(i);
        }
        
        while(true){
            boolean done = true;
            for(int i = 0; i < burstTime.size(); i++){
                if(burst[i] > 0){
                    done  = false;
                    if(burst[i] > quantumTime){
                        burst[i] -= quantumTime;
                        time += quantumTime;
                        System.out.println("Time: " + processNo.get(i) + " " + time);
                        list1.add(processNo.get(i));
                        list2.add(time);
                        
                    }else{
                        completionTime[i] = time += burst[i];
                        turnaroundTime[i] = completionTime[i];
                        waitingTime[i] = time - burstTime.get(i);
                        burst[i] = 0;
                       System.out.println("Time: " + processNo.get(i) + " " + time);
                        list1.add(processNo.get(i));
                        list2.add(time);
                    }
                }
//                list2.add(gantt);
            }
            if (done == true)
                break;
        }

          
          
        for(int i = 0; i < burstTime.size(); i++){
              
              //Sum of all tat and wt
              aveTAT += turnaroundTime[i];
              aveWT += waitingTime[i];
                 
        }
          
          //Positions of Columns, model- table component
          for(int i = 0; i < burstTime.size(); i++){
            model.setValueAt(completionTime[i], i, 3); //column 3
            model.setValueAt(turnaroundTime[i], i, 4); //column 4
            model.setValueAt(waitingTime[i], i, 5); //column 5
          }
        
          //Averaging tat, wt
            aveTAT = aveTAT / burstTime.size();
            aveWT = aveWT / burstTime.size();
          
          //Displaying Average of tat and wt
            String precision = String.format("%.02f",aveTAT );
            String precision1 = String.format("%.02f", aveWT);
            avetat.setText(precision);
            avewt.setText(precision1);
            
            gantPanel.removeAll();
        gantPanel.revalidate();
        gantPanel.repaint();

        // KAILANGAN SAKTO YUNG PANEL SIZE PARA MAPUNTA SA BABA YUNG NUMBER
        int panelSize = 0;
        javax.swing.border.Border blackBorder = BorderFactory.createLineBorder(Color.BLACK, 1);

        JLabel filler = new JLabel("");

        // PARA LANG MAGING GREEN YUNG FILL PEDE IDELETE
        JLabel[] processes = new JLabel[list2.size()];                                                             // i added +1 sa index
        JLabel[] num = new JLabel[list2.size()];                                                             // i added added +1 sa index
        
        // PARA LANG MAGING GREEN YUNG FILL PEDE IDELETE
        
        // PROCESS
        for (int i = 0; i < list2.size(); i++) {
            processes[i] = new JLabel("P" + (list1.get(i)), JLabel.CENTER);
            processes[i].setOpaque(true);
            processes[i].setBorder(blackBorder);
            processes[i].setBackground(Color.WHITE);
            if (i == 0) {
                processes[i].setPreferredSize(new Dimension(list2.get(i) * 20, 30));
                panelSize += (list2.get(i)) * 20;
            }
            else {
                processes[i].setPreferredSize(new Dimension((list2.get(i)-list2.get(i-1))* 20, 30));
                panelSize += (list2.get(i)-list2.get(i-1))* 20;
            }
            gantPanel.add(processes[i]);
        }
        // IF < 770 IBIG SABIHIN DI PA SAKOP BUONG PANEL KAILANGAN MAG ADD NG FILL PARA BUMABA YUNG NUM
        // 770 KASI SIZE NG PANEL KO
        if (panelSize < 560) {
            filler.setPreferredSize(new Dimension((560 - panelSize), 30));
            System.out.println(560 - panelSize);
            gantPanel.setPreferredSize(new Dimension(560, 200));
            gantPanel.add(filler);
        }
        else
            gantPanel.setPreferredSize(new Dimension(panelSize, 200));
        // NUMBER SA BABA
        for (int i = 0; i < list2.size(); i++) {                                                             // i changed < to  <=
            num[i] = new JLabel("" + list2.get(i), JLabel.RIGHT);
            num[i].setFont(new Font("", Font.BOLD, 16));
            if (i == 0)
                num[i].setPreferredSize(new Dimension(list2.get(i) * 20, 30));
            else 
                num[i].setPreferredSize(new Dimension((list2.get(i)-list2.get(i-1))* 20, 30));
            gantPanel.add(num[i]);
        }
        

    }//GEN-LAST:event_computeActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
            qt.setEnabled(true); //make quantum time editable again
            
            int r = model.getRowCount(); 
           
            //clear rows in table
            for(int i = 0; i < r; i++){
                model.removeRow(0);
                burstTime.clear();
                arrivalTime.clear();
                processNo.clear();
            }
            //set process number to 1 again
            holder = 1;
    }//GEN-LAST:event_deleteActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
            MainFrame menu = new MainFrame();
            menu.setLocationRelativeTo(null);
            menu.setVisible(true);
            dispose();
    }//GEN-LAST:event_backActionPerformed

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
        add.setForeground(Color.red);
    }//GEN-LAST:event_addMouseEntered

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
        delete.setForeground(Color.red);
    }//GEN-LAST:event_deleteMouseEntered

    private void computeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_computeMouseEntered
        compute.setForeground(Color.red);
    }//GEN-LAST:event_computeMouseEntered

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
        back.setForeground(Color.red);
    }//GEN-LAST:event_backMouseEntered

    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited
        add.setForeground(Color.decode("#fd742c"));
    }//GEN-LAST:event_addMouseExited

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
        delete.setForeground(Color.decode("#fd742c"));
    }//GEN-LAST:event_deleteMouseExited

    private void computeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_computeMouseExited
        compute.setForeground(Color.decode("#fd742c"));
    }//GEN-LAST:event_computeMouseExited

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
        back.setForeground(Color.decode("#fd742c"));
    }//GEN-LAST:event_backMouseExited

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        exit.setForeground(Color.red);
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        exit.setForeground(Color.decode("#fd742c"));
    }//GEN-LAST:event_exitMouseExited

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        //exit message box
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
            java.util.logging.Logger.getLogger(RoundRobin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RoundRobin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RoundRobin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RoundRobin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RoundRobin1().setVisible(true);
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JLabel avetat;
    private javax.swing.JLabel avewt;
    private javax.swing.JButton back;
    private javax.swing.JLabel bg;
    private javax.swing.JTextField bt;
    private javax.swing.JButton compute;
    private javax.swing.JButton delete;
    private javax.swing.JButton exit;
    private javax.swing.JScrollPane gantPane;
    private javax.swing.JPanel gantPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField qt;
    private javax.swing.JScrollPane tablePane;
    // End of variables declaration//GEN-END:variables
}
