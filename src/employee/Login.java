package employee;
import java.sql.*;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    
     
    public Login() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Employee_Login = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        usertext = new javax.swing.JTextField();
        passtext = new javax.swing.JPasswordField();
        Login_Button = new javax.swing.JButton();
        Reset_Button = new javax.swing.JButton();
        Exit_Button = new javax.swing.JButton();
        Employee_Radiobutton = new javax.swing.JRadioButton();
        Admin_Radiobutton = new javax.swing.JRadioButton();
        staff = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setPreferredSize(new java.awt.Dimension(450, 300));
        setResizable(false);
        getContentPane().setLayout(null);

        Employee_Login.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Employee_Login.setForeground(new java.awt.Color(255, 255, 255));
        Employee_Login.setText("Employee Login");
        getContentPane().add(Employee_Login);
        Employee_Login.setBounds(160, 20, 153, 40);

        Username.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Username.setForeground(new java.awt.Color(255, 255, 255));
        Username.setText("Id");
        getContentPane().add(Username);
        Username.setBounds(71, 94, 93, 25);

        password.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setText("Password");
        getContentPane().add(password);
        password.setBounds(71, 137, 101, 26);
        getContentPane().add(usertext);
        usertext.setBounds(186, 96, 160, 20);
        getContentPane().add(passtext);
        passtext.setBounds(186, 140, 160, 20);

        Login_Button.setBackground(new java.awt.Color(0, 255, 255));
        Login_Button.setText("Login");
        Login_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Login_Button);
        Login_Button.setBounds(71, 218, 75, 23);

        Reset_Button.setBackground(new java.awt.Color(51, 255, 255));
        Reset_Button.setText("Reset");
        Reset_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reset_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Reset_Button);
        Reset_Button.setBounds(177, 218, 75, 23);

        Exit_Button.setBackground(new java.awt.Color(51, 255, 255));
        Exit_Button.setText("Exit");
        Exit_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Exit_Button);
        Exit_Button.setBounds(280, 220, 75, 23);

        Employee_Radiobutton.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(Employee_Radiobutton);
        Employee_Radiobutton.setForeground(new java.awt.Color(255, 255, 255));
        Employee_Radiobutton.setText("Employee");
        Employee_Radiobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Employee_RadiobuttonActionPerformed(evt);
            }
        });
        getContentPane().add(Employee_Radiobutton);
        Employee_Radiobutton.setBounds(270, 180, 90, 23);

        Admin_Radiobutton.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(Admin_Radiobutton);
        Admin_Radiobutton.setForeground(new java.awt.Color(255, 255, 255));
        Admin_Radiobutton.setText("Admin");
        Admin_Radiobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Admin_RadiobuttonActionPerformed(evt);
            }
        });
        getContentPane().add(Admin_Radiobutton);
        Admin_Radiobutton.setBounds(190, 180, 70, 23);

        staff.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        staff.setForeground(new java.awt.Color(255, 255, 255));
        staff.setText("Staff");
        getContentPane().add(staff);
        staff.setBounds(71, 174, 45, 26);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/Project Background/admin bg1.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 490, 320);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Login_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_ButtonActionPerformed

        int id = Integer.parseInt(this.usertext.getText());
        String password = this.passtext.getText();
        String staff = "Employee";
        if(this.Admin_Radiobutton.isSelected()){
            staff = "Admin";
            try{
                password = new Encrypt_Text().encrypt(password);
//                System.out.print("Encrypted Password : "+password);
                Db c = new Db();
                String q = "select * from admin where Admin_id = '"+id+"'and Admin_password ='"+password+"'";
                ResultSet res = c.stm.executeQuery(q);
                if(res.next()){
                    Admin_Interface.a_id = id;
                    Admin_Interface a = new Admin_Interface();
                    a.setTitle("Admin Page");
                    a.setVisible(true);
                    this.setVisible(false);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Invalid Login Detail","Login Status", JOptionPane.ERROR_MESSAGE);
                    this.usertext.setText("");
                    this.passtext.setText("");
                }
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Try Again","ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        else if(this.Employee_Radiobutton.isSelected()){
            staff = "Employee";
            try{
                password = new Encrypt_Text().encrypt(password);
                Db c = new Db();
                String q = "select * from employee_Login where Emp_id = '"+id+"'and Emp_password ='"+password+"'";
                ResultSet res = c.stm.executeQuery(q);
                if(res.next()){
                    Employee_Interface.e_id = id ;
                    Employee_Interface e = new Employee_Interface();
                    e.setTitle("Employee Page");
                    e.setVisible(true);
                    this.setVisible(false);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Invalid Login Detail","Login Status", JOptionPane.ERROR_MESSAGE);
                    this.usertext.setText("");
                    this.passtext.setText("");
                }
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Try Again","ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } 
    }//GEN-LAST:event_Login_ButtonActionPerformed

    private void Reset_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reset_ButtonActionPerformed
        this.usertext.setText("");
        this.passtext.setText("");
    }//GEN-LAST:event_Reset_ButtonActionPerformed

    private void Exit_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit_ButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Exit_ButtonActionPerformed

    private void Employee_RadiobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Employee_RadiobuttonActionPerformed
    }//GEN-LAST:event_Employee_RadiobuttonActionPerformed

    private void Admin_RadiobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Admin_RadiobuttonActionPerformed
    }//GEN-LAST:event_Admin_RadiobuttonActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Admin_Radiobutton;
    private javax.swing.JLabel Employee_Login;
    private javax.swing.JRadioButton Employee_Radiobutton;
    private javax.swing.JButton Exit_Button;
    private javax.swing.JButton Login_Button;
    private javax.swing.JButton Reset_Button;
    private javax.swing.JLabel Username;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField passtext;
    private javax.swing.JLabel password;
    private javax.swing.JLabel staff;
    private javax.swing.JTextField usertext;
    // End of variables declaration//GEN-END:variables
}
