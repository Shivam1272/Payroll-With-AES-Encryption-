package employee;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Set_Salary extends javax.swing.JFrame {
    Admin_Interface a = new Admin_Interface();
    public Set_Salary() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        trantxt = new javax.swing.JTextField();
        HRA = new javax.swing.JTextField();
        BS = new javax.swing.JTextField();
        DA = new javax.swing.JTextField();
        PF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        e_id = new javax.swing.JTextField();
        Add = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(435, 302));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Employee_id");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(128, 103, 125, 25);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Basic Salary");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(128, 229, 125, 25);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("HRA");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(128, 134, 125, 25);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DA");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(128, 165, 125, 25);
        getContentPane().add(trantxt);
        trantxt.setBounds(271, 77, 125, 20);
        getContentPane().add(HRA);
        HRA.setBounds(271, 136, 125, 20);
        getContentPane().add(BS);
        BS.setBounds(271, 231, 125, 20);
        getContentPane().add(DA);
        DA.setBounds(271, 167, 125, 20);
        getContentPane().add(PF);
        PF.setBounds(271, 198, 125, 20);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Transaction ID");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(128, 72, 125, 25);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("pf");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(128, 196, 125, 25);
        getContentPane().add(e_id);
        e_id.setBounds(271, 105, 125, 20);

        Add.setBackground(new java.awt.Color(51, 255, 255));
        Add.setText("Add ");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        getContentPane().add(Add);
        Add.setBounds(130, 260, 73, 23);

        jButton2.setBackground(new java.awt.Color(51, 255, 255));
        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(323, 260, 73, 23);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/Project Background/admin bg1.jpg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 450, 300);

        setSize(new java.awt.Dimension(449, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        String T_id = this.trantxt.getText();
        int emp_id = Integer.parseInt(this.e_id.getText());
        float hra = Float.parseFloat(this.HRA.getText());
        float da = Float.parseFloat(this.DA.getText());
        float pf = Float.parseFloat(this.PF.getText());
        float bs = Float.parseFloat(this.BS.getText());
        try{
            Db db = new Db();
            String q = "select Emp_id from employee where Emp_id ='"+emp_id+"'";
            ResultSet res = db.stm.executeQuery(q);
            if(res.next()){
                try{
                    String e = "insert into Salary values ('"+T_id+"','"+hra+"','"+da+"','"+pf+"','"+bs+"','"+emp_id+"')";
                    db.stm.executeUpdate(e);
                    JOptionPane.showMessageDialog(null,"SuccessFully Added");
                    setVisible(false);
                    a.setVisible(true);
                }
                catch(Exception ex){
                    ex.printStackTrace();
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"Invalid Employee Id","Verfiy Employee Id", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_AddActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        a.setTitle("Admin Page");
        a.setVisible(true);
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
            java.util.logging.Logger.getLogger(Set_Salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Set_Salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Set_Salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Set_Salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Set_Salary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JTextField BS;
    private javax.swing.JTextField DA;
    private javax.swing.JTextField HRA;
    private javax.swing.JTextField PF;
    private javax.swing.JTextField e_id;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField trantxt;
    // End of variables declaration//GEN-END:variables
}
