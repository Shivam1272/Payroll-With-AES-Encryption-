
package employee;

import javax.swing.JOptionPane;


public class Admin_Detail extends javax.swing.JFrame {

    Admin_Interface a = new Admin_Interface();
    public Admin_Detail() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Admin_Id");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(42, 106, 95, 29);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Admin Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(42, 146, 95, 29);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(42, 186, 95, 29);
        getContentPane().add(id);
        id.setBounds(169, 105, 125, 30);
        getContentPane().add(name);
        name.setBounds(169, 146, 125, 29);
        getContentPane().add(password);
        password.setBounds(169, 186, 125, 29);

        add.setBackground(new java.awt.Color(51, 255, 255));
        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add);
        add.setBounds(42, 233, 95, 23);

        jButton2.setBackground(new java.awt.Color(51, 255, 255));
        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(200, 230, 95, 23);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 0, 320, 99);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/Project Background/admin bg1.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 360, 300);

        setSize(new java.awt.Dimension(374, 337));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
//        System.exit(0);
        this.dispose();
        a.setTitle("Admin Page");
        a.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        String Name = this.name.getText();
        int Id = Integer.parseInt(this.id.getText());
        String pass = this.password.getText();
        try{
            pass = new Encrypt_Text().encrypt(pass);
            Db db = new Db();
            String q = "insert into admin values("+Id+",'"+Name+"','"+pass+"')";
            db.stm.executeUpdate(q);
            JOptionPane.showMessageDialog(null,"SuccessFully Added");
            setVisible(false);
            a.setVisible(true);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }        

    }//GEN-LAST:event_addActionPerformed

  
    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Detail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField name;
    private javax.swing.JTextField password;
    // End of variables declaration//GEN-END:variables
}
