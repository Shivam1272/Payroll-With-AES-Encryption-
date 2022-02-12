package employee;

import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Admin_Interface extends javax.swing.JFrame {
    static int a_id ;
    public Admin_Interface() {
        initComponents();
        String s  = String.valueOf(Admin_Interface.a_id);
        id_txt.setText(s);
        id_txt.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Emp_detail = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Logout_Button = new javax.swing.JButton();
        salary = new javax.swing.JButton();
        AddAdmin = new javax.swing.JButton();
        Generate_Slip = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        id_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Employee = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(605, 423));
        setResizable(false);
        getContentPane().setLayout(null);

        Emp_detail.setBackground(new java.awt.Color(255, 255, 153));
        Emp_detail.setText("Add Employee Details");
        Emp_detail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Emp_detailActionPerformed(evt);
            }
        });
        getContentPane().add(Emp_detail);
        Emp_detail.setBounds(240, 380, 350, 33);

        Update.setBackground(new java.awt.Color(255, 255, 153));
        Update.setText("Update Details");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        getContentPane().add(Update);
        Update.setBounds(240, 480, 167, 33);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Admin");
        jLabel1.setPreferredSize(new java.awt.Dimension(450, 300));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 30, 352, 41);

        Logout_Button.setBackground(new java.awt.Color(255, 255, 153));
        Logout_Button.setText("Logout");
        Logout_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Logout_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Logout_Button);
        Logout_Button.setBounds(500, 50, 84, 23);

        salary.setBackground(new java.awt.Color(255, 255, 153));
        salary.setText("Salary");
        salary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salaryActionPerformed(evt);
            }
        });
        getContentPane().add(salary);
        salary.setBounds(420, 430, 167, 33);

        AddAdmin.setBackground(new java.awt.Color(255, 255, 153));
        AddAdmin.setText("Add New Admin ");
        AddAdmin.setToolTipText("");
        AddAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddAdminActionPerformed(evt);
            }
        });
        getContentPane().add(AddAdmin);
        AddAdmin.setBounds(240, 430, 167, 33);

        Generate_Slip.setBackground(new java.awt.Color(255, 255, 153));
        Generate_Slip.setText("Payment");
        Generate_Slip.setToolTipText("");
        Generate_Slip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Generate_SlipActionPerformed(evt);
            }
        });
        getContentPane().add(Generate_Slip);
        Generate_Slip.setBounds(420, 480, 167, 30);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" Logged in as:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 490, 90, 20);
        getContentPane().add(id_txt);
        id_txt.setBounds(100, 490, 30, 20);

        jLabel2.setBackground(new java.awt.Color(51, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\sspat\\Downloads\\bg.png")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 610, 560);

        jMenu1.setText("Records");

        Employee.setText("Employee Records");
        Employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeActionPerformed(evt);
            }
        });
        jMenu1.add(Employee);

        jMenuItem2.setText("Salary ");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Salary Records");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(619, 594));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Emp_detailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Emp_detailActionPerformed
        Emp_Detail ed = new Emp_Detail();
        ed.setTitle("Register New Employee Detail");
        ed.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Emp_detailActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
    int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Employee id", "Emp_id", 1));
    try{
        Db D = new Db();
        String e = "SELECT * from employee where Emp_id = '"+id+"'";
        ResultSet res1 = D.stm.executeQuery(e);
        if(res1.next()){
            Update_Emp_details.id = id;
            Update_Emp_details U = new Update_Emp_details();
            U.setTitle("Update Employee Details");
            U.setVisible(true);
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(null,"Invalid Employee Id","Verfiy Employee Id", JOptionPane.ERROR_MESSAGE);
        }
    }
    catch(Exception ex){
       ex.printStackTrace();
    }
    }//GEN-LAST:event_UpdateActionPerformed

    private void Logout_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout_ButtonActionPerformed
        Login l = new Login();
        l.setTitle("Login Page");
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Logout_ButtonActionPerformed

    private void AddAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddAdminActionPerformed
        Admin_Detail ad = new Admin_Detail();
        ad.setTitle("Register New Admin");
        ad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AddAdminActionPerformed

    private void salaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salaryActionPerformed
        // TODO add your handling code here:
        Set_Salary s = new Set_Salary();
        s.setTitle("Salary ");
        this.dispose();
        s.setVisible(true);
    }//GEN-LAST:event_salaryActionPerformed

    private void Generate_SlipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Generate_SlipActionPerformed
        int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Employee id", "Emp_id", 1));
        try{
            Db D = new Db();
            String e = "SELECT * from employee where Emp_id = '"+id+"'";
            ResultSet res1 = D.stm.executeQuery(e);
            if(res1.next()){
                Slip1.id = id;
                Slip1 S = new Slip1();
                S.setTitle("Generate Employee Payroll Slip");
                S.setVisible(true);
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(null,"Invalid Employee Id","Verfiy Employee Id", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception ex){
           ex.printStackTrace();
        }
    }//GEN-LAST:event_Generate_SlipActionPerformed

    private void EmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeActionPerformed
        // TODO add your handling code here:
        EmployeeRecords er = new EmployeeRecords();
        er.setVisible(true);
        er.setTitle("Employee Record ");
        this.dispose();
    }//GEN-LAST:event_EmployeeActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        Salary s = new Salary();
        s.setVisible(true);
        s.setTitle("Salary Record ");
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        Payment p = new Payment();
        p.setVisible(true);
        p.setTitle("Record of Paid Salary");
        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddAdmin;
    private javax.swing.JButton Emp_detail;
    private javax.swing.JMenuItem Employee;
    private javax.swing.JButton Generate_Slip;
    private javax.swing.JButton Logout_Button;
    private javax.swing.JButton Update;
    private javax.swing.JTextField id_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JButton salary;
    // End of variables declaration//GEN-END:variables
}
