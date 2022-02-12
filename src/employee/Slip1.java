
package employee;
import java.io.File;
import java.sql.ResultSet;
import javax.swing.JFileChooser;
import java.io.FileWriter;
import javax.swing.JOptionPane;

public class Slip1 extends javax.swing.JFrame {
    static int id;
    static float s;
    Admin_Interface a = new Admin_Interface();

    public Slip1() {
        initComponents();
        try{
            Db D = new Db();
            String e = "SELECT * from employee where Emp_id = '"+Slip1.id+"'";
            ResultSet res1 = D.stm.executeQuery(e);
            while(res1.next()){
            Name.setText(res1.getString("Emp_name"));
            mobile_no.setText(res1.getString("Emp_phone_no"));
            e_id.setText(res1.getString("Emp_id"));
            e_id.setEditable(false);
            } 
            String q = "SELECT * FROM Salary where Emp_id = '"+Slip1.id+"'";
            ResultSet res = D.stm.executeQuery(q);
            while(res.next()){
                trans_id.setText(res.getString("Transaction_id"));
                HRA.setText(res.getString("HRA"));
                DA.setText(res.getString("DA"));
                PF.setText(res.getString("PF"));
                BS.setText(res.getString("Basic_Salary"));
                Slip1.s = Float.parseFloat(BS.getText());
            }
       }
       catch(Exception ex){
           ex.printStackTrace();
       }
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        PF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        trans_id = new javax.swing.JTextField();
        e_id = new javax.swing.JTextField();
        amount = new javax.swing.JRadioButton();
        percent = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        mobile_no = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        HRA = new javax.swing.JTextField();
        BS = new javax.swing.JTextField();
        generateslip = new javax.swing.JButton();
        DA = new javax.swing.JTextField();
        Close = new javax.swing.JButton();
        percent_txt = new javax.swing.JTextField();
        amt_txt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        calculate = new javax.swing.JButton();
        bonus = new javax.swing.JRadioButton();
        deduction = new javax.swing.JRadioButton();
        date_txt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        updaterecord = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setPreferredSize(new java.awt.Dimension(720, 363));
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(PF);
        PF.setBounds(460, 140, 125, 20);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Transaction ID");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 180, 125, 25);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Name of Employee");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(50, 100, 125, 25);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Contact No.");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(50, 140, 125, 25);
        getContentPane().add(Name);
        Name.setBounds(180, 100, 125, 20);
        getContentPane().add(trans_id);
        trans_id.setBounds(180, 180, 125, 20);
        getContentPane().add(e_id);
        e_id.setBounds(180, 60, 125, 20);

        amount.setBackground(new java.awt.Color(51, 255, 255));
        buttonGroup2.add(amount);
        amount.setForeground(new java.awt.Color(255, 255, 255));
        amount.setText("by Amount\"₹\"");
        amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountActionPerformed(evt);
            }
        });
        getContentPane().add(amount);
        amount.setBounds(270, 290, 100, 23);

        percent.setBackground(new java.awt.Color(51, 255, 255));
        buttonGroup2.add(percent);
        percent.setForeground(new java.awt.Color(255, 255, 255));
        percent.setText("by Percentage\"%\"");
        percent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                percentActionPerformed(evt);
            }
        });
        getContentPane().add(percent);
        percent.setBounds(120, 290, 130, 23);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("pf");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(360, 140, 60, 25);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Employee_id");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 60, 125, 25);
        getContentPane().add(mobile_no);
        mobile_no.setBounds(180, 140, 125, 20);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Basic Salary");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(360, 180, 125, 25);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("HRA");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(360, 60, 80, 25);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DA");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(360, 100, 80, 25);
        getContentPane().add(HRA);
        HRA.setBounds(460, 60, 125, 20);
        getContentPane().add(BS);
        BS.setBounds(460, 180, 125, 20);

        generateslip.setBackground(new java.awt.Color(51, 255, 255));
        generateslip.setText("Generate Slip");
        generateslip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateslipActionPerformed(evt);
            }
        });
        getContentPane().add(generateslip);
        generateslip.setBounds(430, 320, 125, 23);
        getContentPane().add(DA);
        DA.setBounds(460, 100, 125, 20);

        Close.setBackground(new java.awt.Color(51, 255, 255));
        Close.setText("Close");
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });
        getContentPane().add(Close);
        Close.setBounds(560, 320, 100, 23);
        getContentPane().add(percent_txt);
        percent_txt.setBounds(120, 320, 80, 20);
        getContentPane().add(amt_txt);
        amt_txt.setBounds(300, 320, 70, 20);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Update Salary by");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 290, 100, 20);

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Amount");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(220, 320, 70, 20);

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Percentage");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(20, 320, 90, 20);

        calculate.setBackground(new java.awt.Color(51, 255, 255));
        calculate.setText("Calculate");
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });
        getContentPane().add(calculate);
        calculate.setBounds(560, 290, 100, 23);

        bonus.setBackground(new java.awt.Color(51, 255, 255));
        buttonGroup1.add(bonus);
        bonus.setForeground(new java.awt.Color(255, 255, 255));
        bonus.setText("Bonus");
        getContentPane().add(bonus);
        bonus.setBounds(120, 260, 90, 23);

        deduction.setBackground(new java.awt.Color(51, 255, 255));
        buttonGroup1.add(deduction);
        deduction.setForeground(new java.awt.Color(255, 255, 255));
        deduction.setText("Deduction");
        getContentPane().add(deduction);
        deduction.setBounds(270, 260, 100, 23);
        getContentPane().add(date_txt);
        date_txt.setBounds(180, 210, 120, 20);

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Date");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(50, 210, 90, 20);

        updaterecord.setBackground(new java.awt.Color(51, 255, 255));
        updaterecord.setText("Update Record");
        updaterecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updaterecordActionPerformed(evt);
            }
        });
        getContentPane().add(updaterecord);
        updaterecord.setBounds(430, 290, 130, 23);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/Project Background/admin bg1.jpg"))); // NOI18N
        jLabel9.setText("Update Salary by");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 710, 370);

        setSize(new java.awt.Dimension(720, 410));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void generateslipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateslipActionPerformed
        // TODO add your handling code here:
        try{
            String val1 = e_id.getText();
            String val2 = date_txt.getText();

            JFileChooser dialog = new JFileChooser();
            dialog.setSelectedFile(new File(val1+" salary for month of "+val2+"-Salary Slip"+".txt"));
            int dialogResult = dialog.showSaveDialog(null);
            if(dialogResult == JFileChooser.APPROVE_OPTION){
                String filepath = dialog.getSelectedFile().getPath();
                FileWriter f = new FileWriter(filepath);
                String s = "Name: " + Name.getText() + "\nContact no. : "+mobile_no.getText()+"\nEmployee id :"+e_id.getText()+"\nTransaction id : "+trans_id.getText()+"\nHRA: " + HRA.getText()+" %"+"\nDA: " + DA.getText()+" %"+"\npf: " + PF.getText()+" %"+"\nBasic Salary: " +"₹"+BS.getText() ;
                f.write(s);
                f.close();
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_generateslipActionPerformed

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        // TODO add your handling code here:
        a.setVisible(true);
        a.setTitle("Admin Page");
        this.dispose();
        
    }//GEN-LAST:event_CloseActionPerformed

    private void amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountActionPerformed
        // TODO add your handling code here:
        percent.setSelected(false);
        amount.setSelected(true);
        amt_txt.setEnabled(true);
        amt_txt.setEditable(true);
        percent_txt.setEnabled(false);
        percent_txt.setEditable(false);
    }//GEN-LAST:event_amountActionPerformed

    private void percentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_percentActionPerformed
        // TODO add your handling code here:
        percent.setSelected(true);
        amount.setSelected(false);
        amt_txt.setEnabled(false);
        amt_txt.setEditable(false);
        percent_txt.setEnabled(true);
        percent_txt.setEditable(true);
        
    }//GEN-LAST:event_percentActionPerformed

    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed
        // TODO add your handling code here:
        if(bonus.isSelected()== true){
            if(percent.isSelected()==true){
                float percentage = Float.parseFloat(percent_txt.getText());
                float bs = Float.parseFloat(BS.getText());
                float salary = bs / 100 * percentage;
                bs = bs + salary ;
                BS.setText(bs + "");
            }
            else if(amount.isSelected()==true){
                float amount = Float.parseFloat(amt_txt.getText());
                float bs = Float.parseFloat(BS.getText());
                float salary = bs + amount;
                BS.setText(salary + "");
            }
        }
        else if(deduction.isSelected()==true){
            if(percent.isSelected()==true){
                float percentage = Float.parseFloat(percent_txt.getText());
                float bs = Float.parseFloat(BS.getText());
                float salary = bs / 100 * percentage;
                bs = bs - salary ;
                BS.setText(bs + "");
            }
            else if(amount.isSelected()==true){
                float amount = Float.parseFloat(amt_txt.getText());
                float bs = Float.parseFloat(BS.getText());
                float salary = bs - amount;
                BS.setText(salary + "");
            }
        }
    }//GEN-LAST:event_calculateActionPerformed

    private void updaterecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updaterecordActionPerformed

        String val = date_txt.getText();
        if(val.isEmpty() == true){
            JOptionPane.showMessageDialog(null,"Enter Month","ERROR", JOptionPane.ERROR_MESSAGE);
        }else{
            if(bonus.isSelected()== true){
                if(percent.isSelected()==true){
                    float percentage = Float.parseFloat(percent_txt.getText());
                    float salary = Slip1.s / 100 * percentage;
                    float a = Slip1.s + salary;
                    try{
                        String q = "insert into salary_record values('"+val+"','"+Slip1.s+"','"+Slip1.id+"','"+salary+"','"+0+"','"+a+"');";
                        Db d = new Db();
                        d.stm.executeUpdate(q);
                        JOptionPane.showMessageDialog(null,"Succesfully Recorded");
                    }catch(Exception ex){
                        ex.printStackTrace();
                    }
                }
                else if(amount.isSelected()==true){
                    float amount = Float.parseFloat(amt_txt.getText());
                    float salary = Slip1.s + amount;
                    try{
                        String q = "insert into salary_record values('"+val+"','"+Slip1.s+"','"+Slip1.id+"','"+amount+"','"+0+"','"+salary+"');";
                        Db d = new Db();
                        d.stm.executeUpdate(q);
                        JOptionPane.showMessageDialog(null,"Succesfully Recorded");
                    }catch(Exception ex){
                        ex.printStackTrace();
                    }
                }
            }
            else if(deduction.isSelected()==true){
                if(percent.isSelected()==true){
                    float percentage = Float.parseFloat(percent_txt.getText());
                    float salary = Slip1.s / 100 * percentage;
                    float a = Slip1.s - salary ;
                    try{
                        String q = "insert into salary_record values('"+val+"','"+Slip1.s+"','"+Slip1.id+"','"+0+"','"+salary+"','"+a+"');";
                        Db d = new Db();
                        d.stm.executeUpdate(q);
                        JOptionPane.showMessageDialog(null,"Succesfully Recorded");
                    }catch(Exception ex){
                        ex.printStackTrace();
                    }
                }
                else if(amount.isSelected()==true){
                    float amount = Float.parseFloat(amt_txt.getText());
                    float salary = Slip1.s - amount;
                    try{
                        String q = "insert into salary_record values('"+val+"','"+Slip1.s+"','"+Slip1.id+"','"+0+"','"+amount+"','"+salary+"');";
                        Db d = new Db();
                        d.stm.executeUpdate(q);
                        JOptionPane.showMessageDialog(null,"Succesfully Recorded");
                    }catch(Exception ex){
                        ex.printStackTrace();
                    }
                }
            }         
        }

    }//GEN-LAST:event_updaterecordActionPerformed

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
            java.util.logging.Logger.getLogger(Slip1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Slip1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Slip1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Slip1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Slip1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BS;
    private javax.swing.JButton Close;
    private javax.swing.JTextField DA;
    private javax.swing.JTextField HRA;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField PF;
    private javax.swing.JRadioButton amount;
    private javax.swing.JTextField amt_txt;
    private javax.swing.JRadioButton bonus;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton calculate;
    private javax.swing.JTextField date_txt;
    private javax.swing.JRadioButton deduction;
    private javax.swing.JTextField e_id;
    private javax.swing.JButton generateslip;
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
    private javax.swing.JRadioButton percent;
    private javax.swing.JTextField percent_txt;
    private javax.swing.JTextField trans_id;
    private javax.swing.JButton updaterecord;
    // End of variables declaration//GEN-END:variables
}
