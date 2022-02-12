package employee;
import javax.swing.JOptionPane;

public class Emp_Detail extends javax.swing.JFrame {
    Admin_Interface a = new Admin_Interface();
    public Emp_Detail() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        mobile_no = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        email_id = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        emp_id = new javax.swing.JTextField();
        Submit = new javax.swing.JButton();
        Close = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        dep_id = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        dob = new javax.swing.JTextField();
        gender = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name of Employee");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(182, 38, 100, 24);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contact Number");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(182, 68, 100, 25);

        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });
        getContentPane().add(Name);
        Name.setBounds(312, 40, 150, 20);

        mobile_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobile_noActionPerformed(evt);
            }
        });
        getContentPane().add(mobile_no);
        mobile_no.setBounds(310, 70, 150, 20);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Address");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(182, 99, 100, 24);
        getContentPane().add(address);
        address.setBounds(312, 101, 150, 20);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email_id");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(182, 129, 100, 22);

        email_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_idActionPerformed(evt);
            }
        });
        getContentPane().add(email_id);
        email_id.setBounds(312, 130, 150, 20);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Gender");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(182, 157, 100, 22);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Employee_id");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(182, 185, 100, 24);

        emp_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emp_idActionPerformed(evt);
            }
        });
        getContentPane().add(emp_id);
        emp_id.setBounds(312, 185, 150, 20);

        Submit.setBackground(new java.awt.Color(51, 255, 255));
        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });
        getContentPane().add(Submit);
        Submit.setBounds(182, 291, 100, 23);

        Close.setBackground(new java.awt.Color(51, 255, 255));
        Close.setText("Close");
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });
        getContentPane().add(Close);
        Close.setBounds(362, 291, 100, 23);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Department_id");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(182, 218, 100, 14);
        getContentPane().add(dep_id);
        dep_id.setBounds(312, 215, 150, 20);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Date of Birth");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(182, 241, 100, 25);

        dob.setText("YYYY-MM-DD");
        dob.setToolTipText("");
        getContentPane().add(dob);
        dob.setBounds(312, 243, 150, 20);

        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });
        getContentPane().add(gender);
        gender.setBounds(312, 158, 150, 20);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/Project Background/admin bg1.jpg"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 510, 340);

        setSize(new java.awt.Dimension(524, 380));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

    private void mobile_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobile_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobile_noActionPerformed

    private void emp_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emp_idActionPerformed

    private void email_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_idActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        String name = this.Name.getText();
        String contact = this.mobile_no.getText();
        String Address = this.address.getText();
        String Email_id = this.email_id.getText();
        String Gender = this.gender.getText();
        int e_id = Integer.parseInt(this.emp_id.getText());
        int Dep_id = Integer.parseInt(this.dep_id.getText());
        String DOB = (this.dob.getText());
        String g = DOB;
        try{
            Db db = new Db();
            String q = "insert into employee values("+e_id+","+Dep_id+",'"+name+"',"+contact+",'"+Email_id+"','"+DOB+"','"+Address+"','"+Gender+"')";
            db.stm.executeUpdate(q);
            JOptionPane.showMessageDialog(null,"SuccessFully Added");
            setVisible(false);
            a.setVisible(true);
        }
        catch(Exception ex){
            System.out.print(ex);

        }
        try{
            DOB = new Encrypt_Text().encrypt(DOB);
            Db db = new Db();
            String e = "insert into employee_login values("+e_id+",'"+name+"','"+DOB+"')";
            db.stm.executeUpdate(e);
            JOptionPane.showMessageDialog(null,"Employee Account Created Succesfully :"+"User ID : "+e_id+" Password : "+g );
            setVisible(false);
            a.setVisible(true);
        }
        catch(Exception ex){
            System.out.print(ex);
        }
    }//GEN-LAST:event_SubmitActionPerformed

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        this.dispose();
        a.setTitle("Admin Page");
        a.setVisible(true);
    }//GEN-LAST:event_CloseActionPerformed


    public static void main(String args[]) {
        
        Emp_Detail e = new Emp_Detail();
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Emp_Detail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Close;
    private javax.swing.JTextField Name;
    private javax.swing.JButton Submit;
    private javax.swing.JTextField address;
    private javax.swing.JTextField dep_id;
    private javax.swing.JTextField dob;
    private javax.swing.JTextField email_id;
    private javax.swing.JTextField emp_id;
    private javax.swing.JTextField gender;
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
