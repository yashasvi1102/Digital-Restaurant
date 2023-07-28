
import Menu.dto.Menu;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import manager.dto.Manager;
import order.dto.Order;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;


public class ManagerLogin extends javax.swing.JFrame {

    
    public ManagerLogin() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane6 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField4 = new javax.swing.JTextField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jPasswordField3 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane6.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane6MouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order Id", "Table No", "Dish Name", "Quantity", "Additional Info", "Total Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);

        jTabbedPane6.addTab("View Order", jPanel2);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Feedback"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel8.add(jScrollPane2);

        jTabbedPane6.addTab("View Feedback", jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel7.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 260, -1));

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField3.setText("ID");
        jTextField3.setBorder(null);
        jTextField3.setOpaque(false);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel7.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 30, -1));
        jPanel7.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 260, -1));

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField4.setText("Old Password");
        jTextField4.setBorder(null);
        jTextField4.setOpaque(false);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel7.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 130, -1));

        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });
        jPanel7.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 260, 20));

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField5.setText("New Password");
        jTextField5.setBorder(null);
        jTextField5.setOpaque(false);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel7.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 150, -1));

        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField6.setText("Confirm Password");
        jTextField6.setBorder(null);
        jTextField6.setOpaque(false);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel7.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 200, -1));
        jPanel7.add(jPasswordField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 260, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, -1, -1));

        jPanel9.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 350, 430));

        jTabbedPane6.addTab("Password Setting", jPanel9);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane6.addTab("Upadate Menu", jPanel6);

        getContentPane().add(jTabbedPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 800, 490));

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));

        jTextField2.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setText("DIGITAL ORDER");
        jTextField2.setBorder(null);
        jTextField2.setOpaque(false);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTabbedPane6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane6MouseClicked
        DefaultTableModel dtm;
        {
            SessionFactory sf=new Configuration().configure().buildSessionFactory();
            Session session=sf.openSession();
            Transaction tx=session.beginTransaction();
            Criteria crit=session.createCriteria(Order.class);

            List<Order> data=crit.list();
            dtm=(DefaultTableModel)jTable1.getModel();
            for(Order ref:data)
            {
                Object obj[]={ref.getOrderId(),ref.getTableNo(),ref.getDishName(),ref.getAdditionalInfo(),ref.getTotalAmount()};
                dtm.addRow(obj);
            }
            tx.commit();
            session.close();
        }
    }//GEN-LAST:event_jTabbedPane6MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String aid=jTextField1.getText();
        char ch[]=jPasswordField2.getPassword();
        String oldPass=new String(ch);
        char ch1[]=jPasswordField3.getPassword();
        String newPass=new String(ch1);
        char ch2[]=jPasswordField1.getPassword();
        String cnewPass=new String(ch2);
        SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        Criteria crit=session.createCriteria(Manager.class);
        crit.add(Restrictions.and(Restrictions.eq("Id", aid),Restrictions.eq("password",oldPass)));
        List<Manager> result=crit.list();
        if(result.isEmpty())
        {
            JOptionPane.showMessageDialog(this,"invalid id/old password");
        }
        else
        {
            if(newPass.equals(cnewPass))
            {
                Manager ref=(Manager)session.get(Manager.class,aid);
                ref.setPassword(newPass);
                session.update(ref);
                tx.commit();
                JOptionPane.showMessageDialog(this,"password changed");
                new Welcome().setVisible(true);
                dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(this,"new password & confirm Password doesn't match");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed
     int count=0;
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
