package employee;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Update_Emp_details extends javax.swing.JFrame {
    Admin_Interface a = new Admin_Interface();
    static int id;
    
    public Update_Emp_details() {
        initComponents();
        try{
            Db D = new Db();
            String e = "SELECT * from employee where Emp_id = '"+Update_Emp_details.id+"'";
            ResultSet res1 = D.stm.executeQuery(e);
            while(res1.next()){
                Name.setText(res1.getString("Emp_name"));
                mobile_no.setText(res1.getString("Emp_phone_no"));
                address.setText(res1.getString("Emp_address"));
                gender.setText(res1.getString("gender"));
                email_id.setText(res1.getString("Emp_emailid"));
                dob.setText(res1.getString("Emp_dob"));
                dep_id.setText(res1.getString("dept_id"));
                emp_id.setText(res1.getString("Emp_id"));  
                emp_id.setEditable(false);
            } 
       }
       catch(Exception ex){
           ex.printStackTrace();
       }
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Submit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        Name = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        mobile_no = new javax.swing.JTextField();
        dep_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        dob = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        email_id = new javax.swing.JTextField();
        gender = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        emp_id = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(498, 353));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name of Employee");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 50, 120, 24);

        Submit.setBackground(new java.awt.Color(51, 255, 255));
        Submit.setText("Update Record");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });
        getContentPane().add(Submit);
        Submit.setBounds(140, 310, 120, 23);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contact Number");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(120, 80, 105, 25);

        jButton2.setBackground(new java.awt.Color(51, 255, 255));
        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(330, 310, 90, 23);

        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });
        getContentPane().add(Name);
        Name.setBounds(260, 50, 150, 20);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Department_id");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(120, 230, 105, 20);

        mobile_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobile_noActionPerformed(evt);
            }
        });
        getContentPane().add(mobile_no);
        mobile_no.setBounds(260, 80, 150, 20);
        getContentPane().add(dep_id);
        dep_id.setBounds(260, 230, 150, 20);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Address");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(120, 110, 105, 24);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Date of Birth");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(120, 260, 105, 25);
        getContentPane().add(address);
        address.setBounds(260, 110, 150, 20);
        getContentPane().add(dob);
        dob.setBounds(260, 260, 150, 20);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email_id");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(120, 140, 105, 22);

        email_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_idActionPerformed(evt);
            }
        });
        getContentPane().add(email_id);
        email_id.setBounds(260, 140, 150, 20);

        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });
        getContentPane().add(gender);
        gender.setBounds(260, 170, 150, 20);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Gender");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(120, 170, 105, 22);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Employee_id");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(120, 200, 105, 24);

        emp_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emp_idActionPerformed(evt);
            }
        });
        getContentPane().add(emp_id);
        emp_id.setBounds(260, 200, 150, 20);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/Project Background/admin bg1.jpg"))); // NOI18N
        jLabel9.setText("\n");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 550, 370);

        setSize(new java.awt.Dimension(565, 410));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        try{
            Db db = new Db();
            String q = "select Emp_id from employee where Emp_id ='"+Update_Emp_details.id+"'";
            int e_id = Integer.parseInt(this.emp_id.getText());
            
            ResultSet res = db.stm.executeQuery(q);
            if(res.next()){
                String name = this.Name.getText();
                String contact = this.mobile_no.getText();
                String Address = this.address.getText();
                String Email_id = this.email_id.getText();
                String Gender = this.gender.getText();
                int Dep_id = Integer.parseInt(this.dep_id.getText());
                String DOB = (this.dob.getText());
                try{
                    String e = "update employee set Emp_id = "+e_id+",dept_id ="+Dep_id+",Emp_name = '"+name+"',Emp_phone_no = "+contact+",Emp_emailid = '"+Email_id+"',Emp_dob = '"+DOB+"',Emp_address = '"+Address+"',gender = '"+Gender+"'where Emp_id = "+id+";";
                    db.stm.executeUpdate(e);
                    JOptionPane.showMessageDialog(null,"SuccessFully Updated");
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
    }//GEN-LAST:event_SubmitActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       this.dispose();
       a.setTitle("Admin Page");
       a.setVisible(true);
 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

    private void mobile_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobile_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobile_noActionPerformed

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    private void email_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_idActionPerformed

    private void emp_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emp_idActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update_Emp_details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Name;
    private javax.swing.JButton Submit;
    private javax.swing.JTextField address;
    private javax.swing.JTextField dep_id;
    private javax.swing.JTextField dob;
    private javax.swing.JTextField email_id;
    private javax.swing.JTextField emp_id;
    private javax.swing.JTextField gender;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField mobile_no;
    // End of variables declaration//GEN-END:variables
}
