
package employee;

import java.io.FileWriter;
import java.sql.ResultSet;


public class Slip extends javax.swing.JFrame {
    static  String date;
    public Slip() {
        initComponents();
        date_txt.setText(Slip.date);
        try{
            Db D = new Db();
            String e = "SELECT * from employee where Emp_id = '"+Employee_Interface.e_id+"'";
            ResultSet res1 = D.stm.executeQuery(e);
            while(res1.next()){
                Name.setText(res1.getString("Emp_name"));
                mobile_no.setText(res1.getString("Emp_phone_no"));
                e_id.setText(res1.getString("Emp_id"));
                e_id.setEditable(false);
                Name.setEditable(false);
                mobile_no.setEditable(false);
            } 
            String q = "SELECT s.Transaction_id, s.HRA, s.DA, s.PF, s.Basic_Salary, sr.Bonus, sr.Deduction, sr.Gross_salary FROM Salary as s join salary_record as sr on s.Emp_id = sr.Emp_id where s.Emp_id = '"+Employee_Interface.e_id+"' and sr.date = '"+Slip.date+"'";
            ResultSet res = D.stm.executeQuery(q);
            while(res.next()){
                trans_id.setText(res.getString("Transaction_id"));
                HRA.setText(res.getString("HRA"));
                DA.setText(res.getString("DA"));
                PF.setText(res.getString("PF"));
                BS.setText(res.getString("Basic_Salary"));
                b_txt.setText(res.getString("Bonus"));
                d_txt.setText(res.getString("Deduction"));
                gs_txt.setText(res.getString("Gross_salary"));
                trans_id.setEditable(false);
                HRA.setEditable(false);
                DA.setEditable(false);
                PF.setEditable(false);
                BS.setEditable(false);
                b_txt.setEditable(false);
                d_txt.setEditable(false);
                gs_txt.setEditable(false);
            }
       }
       catch(Exception ex){
           ex.printStackTrace();
       }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        trans_id = new javax.swing.JTextField();
        e_id = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        mobile_no = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        HRA = new javax.swing.JTextField();
        BS = new javax.swing.JTextField();
        DA = new javax.swing.JTextField();
        date_txt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        close = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        gs_txt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        d_txt = new javax.swing.JTextField();
        b_txt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(PF);
        PF.setBounds(460, 120, 125, 20);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Transaction ID");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 150, 125, 25);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Name of Employee");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(50, 90, 125, 25);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Contact No.");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(50, 120, 125, 25);
        getContentPane().add(Name);
        Name.setBounds(180, 90, 125, 20);
        getContentPane().add(trans_id);
        trans_id.setBounds(180, 150, 125, 20);
        getContentPane().add(e_id);
        e_id.setBounds(180, 60, 125, 20);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("pf");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(360, 120, 60, 25);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Employee_id");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 60, 125, 25);
        getContentPane().add(mobile_no);
        mobile_no.setBounds(180, 120, 125, 20);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Basic Salary");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(360, 150, 125, 25);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("HRA");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(360, 60, 80, 25);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DA");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(360, 90, 80, 25);
        getContentPane().add(HRA);
        HRA.setBounds(460, 60, 125, 20);
        getContentPane().add(BS);
        BS.setBounds(460, 150, 125, 20);
        getContentPane().add(DA);
        DA.setBounds(460, 90, 125, 20);
        getContentPane().add(date_txt);
        date_txt.setBounds(180, 180, 130, 20);

        jButton1.setBackground(new java.awt.Color(51, 255, 255));
        jButton1.setText("Print Slip");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(350, 270, 110, 23);

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Date");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(50, 180, 90, 20);

        close.setBackground(new java.awt.Color(51, 255, 255));
        close.setText("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        getContentPane().add(close);
        close.setBounds(490, 270, 100, 23);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Gross Salary");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(50, 210, 100, 20);
        getContentPane().add(gs_txt);
        gs_txt.setBounds(180, 210, 130, 20);

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Bonus");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(360, 180, 110, 20);

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Deduction");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(360, 210, 90, 20);
        getContentPane().add(d_txt);
        d_txt.setBounds(460, 210, 130, 20);
        getContentPane().add(b_txt);
        b_txt.setBounds(460, 180, 130, 20);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/Project Background/admin bg1.jpg"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 640, 320);

        setSize(new java.awt.Dimension(649, 358));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        // TODO add your handling code here:
        Employee_Interface e = new Employee_Interface();
        e.setVisible(true);
        e.setTitle("Employee Page");
        this.dispose();
    }//GEN-LAST:event_closeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String filename = "C:\\Users\\sspat\\OneDrive\\Desktop\\Employee Payroll\\ "+Employee_Interface.e_id+"_"+Slip.date+"_Salary slip.txt";
        try{
            FileWriter f = new FileWriter(filename);
            String s = "Name: " + Name.getText() + "\nContact no. : "+mobile_no.getText()+"\nEmployee id :"+e_id.getText()+"\nTransaction id : "+trans_id.getText()+"\nHRA: " + HRA.getText()+" %"+"\nDA: " + DA.getText()+" %"+"\npf: " + PF.getText()+" %"+"\nBasic Salary: " +"₹"+BS.getText()+"\nBonus: "+"₹"+b_txt.getText()+"\nDeduction : "+"₹"+d_txt.getText()+"\nGross Salary :"+"₹"+gs_txt.getText() ;
            f.write(s);
            f.close();  
        } catch(Exception e){
            e.printStackTrace();
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Slip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Slip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Slip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Slip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Slip().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BS;
    private javax.swing.JTextField DA;
    private javax.swing.JTextField HRA;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField PF;
    private javax.swing.JTextField b_txt;
    private javax.swing.JButton close;
    private javax.swing.JTextField d_txt;
    private javax.swing.JTextField date_txt;
    private javax.swing.JTextField e_id;
    private javax.swing.JTextField gs_txt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField mobile_no;
    private javax.swing.JTextField trans_id;
    // End of variables declaration//GEN-END:variables
}
