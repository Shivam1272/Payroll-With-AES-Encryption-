package employee;

import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class Employee_Interface extends javax.swing.JFrame {
    static int e_id ;
    
    public Employee_Interface() {
        initComponents();
        try{
            Db D = new Db();
            String e = "SELECT e.Emp_name, e.Emp_id, e.dept_id, d.dept_name from employee as e join department as d on d.dept_id = e.dept_id  where e.Emp_id = '"+Employee_Interface.e_id+"'";
            ResultSet res1 = D.stm.executeQuery(e);
            while(res1.next()){
                Name.setText(res1.getString("Emp_name"));
                dep_id.setText(res1.getString("dept_id"));
                emp_id.setText(res1.getString("Emp_id"));
                dep_name.setText(res1.getString("dept_name"));
                emp_id.setEditable(false);
                Name.setEditable(false);
                dep_name.setEditable(false);
                dep_id.setEditable(false);
            } 
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        emp_id = new javax.swing.JTextField();
        dep_id = new javax.swing.JTextField();
        dep_name = new javax.swing.JTextField();
        password = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("My Profile");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(32, 39, 312, 32);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Id");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(32, 120, 62, 25);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(32, 89, 62, 25);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Work in ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(32, 182, 62, 25);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Deparment Id");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(32, 151, 87, 25);
        getContentPane().add(Name);
        Name.setBounds(123, 91, 120, 20);

        emp_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emp_idActionPerformed(evt);
            }
        });
        getContentPane().add(emp_id);
        emp_id.setBounds(123, 122, 120, 20);

        dep_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dep_idActionPerformed(evt);
            }
        });
        getContentPane().add(dep_id);
        dep_id.setBounds(123, 153, 120, 20);
        getContentPane().add(dep_name);
        dep_name.setBounds(123, 184, 120, 20);

        password.setBackground(new java.awt.Color(51, 255, 255));
        password.setText("Change Password");
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        getContentPane().add(password);
        password.setBounds(32, 235, 130, 23);

        jButton2.setBackground(new java.awt.Color(51, 255, 255));
        jButton2.setText("Check Pay Slip");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(169, 235, 130, 23);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/Project Background/admin bg1.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 400, 300);

        setSize(new java.awt.Dimension(414, 337));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dep_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dep_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dep_idActionPerformed

    private void emp_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emp_idActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
        String password =JOptionPane.showInputDialog(null, "Enter New Password ", "Set New Password", 1);
        if(password.isEmpty()==true){
            JOptionPane.showMessageDialog(null,"Password can't be empty","ERROR", JOptionPane.ERROR_MESSAGE);
        }else{
            try{
                password = new Encrypt_Text().encrypt(password);
                System.out.println("******"+password);
                Db d = new Db();
                String q = "update employee_login set Emp_password = '"+password+"' where Emp_id = '"+Employee_Interface.e_id+"'";
                d.stm.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"SuccessFully Updated");
            }catch(Exception ex){
                ex.printStackTrace();
            }
        } 
    }//GEN-LAST:event_passwordActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String date =JOptionPane.showInputDialog(null, "Enter Date  ", "Pay Slip", 1);
        if(date.isEmpty()==true){
            JOptionPane.showMessageDialog(null,"Date can't be empty","ERROR", JOptionPane.ERROR_MESSAGE);    
        }
        else{
            Slip.date = date;
            this.setVisible(false);
            Slip s = new Slip();
            s.setTitle("Salary Detail");
            s.setVisible(true);
        }   
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Employee_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee_Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Name;
    private javax.swing.JTextField dep_id;
    private javax.swing.JTextField dep_name;
    private javax.swing.JTextField emp_id;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton password;
    // End of variables declaration//GEN-END:variables
}
