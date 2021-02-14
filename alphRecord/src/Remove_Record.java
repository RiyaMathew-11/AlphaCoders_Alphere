
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.*;
import javax.swing.JOptionPane;



/**
 *
 * @author AlphaCoders
 */
public class Remove_Record extends javax.swing.JFrame {

    /**
     * Creates new form Remove_Record
     */
    public Remove_Record() {
        initComponents();
        btn_Terminate.setVisible(false);
        btn_Clear.setVisible(false);
        locLab.setVisible(true);
        lC.setVisible(false);
        lD.setVisible(false);
        lN.setVisible(true);
        lS.setVisible(false);
        lC.setVisible(false);
        tname.setVisible(true);
        tLocation.setVisible(true);
        tDate.setVisible(false);
        tTime.setVisible(false);
        tContact.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_Check = new javax.swing.JButton();
        btn_Return = new javax.swing.JButton();
        btn_Terminate = new javax.swing.JButton();
        btn_Clear = new javax.swing.JButton();
        tTime = new javax.swing.JTextField();
        lS = new javax.swing.JLabel();
        lD = new javax.swing.JLabel();
        tDate = new javax.swing.JTextField();
        tLocation = new javax.swing.JTextField();
        locLab = new javax.swing.JLabel();
        lN = new javax.swing.JLabel();
        tname = new javax.swing.JTextField();
        lC = new javax.swing.JLabel();
        tContact = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Record Deletion Form");

        jPanel1.setLayout(null);

        btn_Check.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_Check.setForeground(new java.awt.Color(255, 0, 0));
        btn_Check.setText("CHECK ");
        btn_Check.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btn_Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CheckActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Check);
        btn_Check.setBounds(670, 30, 190, 50);

        btn_Return.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_Return.setForeground(new java.awt.Color(255, 102, 102));
        btn_Return.setText("RETURN");
        btn_Return.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btn_Return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ReturnActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Return);
        btn_Return.setBounds(1110, 700, 150, 50);

        btn_Terminate.setBackground(new java.awt.Color(255, 255, 255));
        btn_Terminate.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        btn_Terminate.setForeground(new java.awt.Color(255, 51, 0));
        btn_Terminate.setText("REMOVE");
        btn_Terminate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TerminateActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Terminate);
        btn_Terminate.setBounds(550, 680, 250, 50);

        btn_Clear.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_Clear.setForeground(new java.awt.Color(0, 153, 51));
        btn_Clear.setText("CLEAR");
        btn_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ClearActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Clear);
        btn_Clear.setBounds(1110, 610, 150, 50);

        tTime.setEditable(false);
        tTime.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tTime.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(tTime);
        tTime.setBounds(260, 400, 360, 50);

        lS.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lS.setForeground(new java.awt.Color(153, 0, 153));
        lS.setText("Time");
        jPanel1.add(lS);
        lS.setBounds(10, 410, 180, 30);

        lD.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lD.setForeground(new java.awt.Color(153, 0, 153));
        lD.setText("Date");
        jPanel1.add(lD);
        lD.setBounds(10, 270, 210, 30);

        tDate.setEditable(false);
        tDate.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tDate.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(tDate);
        tDate.setBounds(270, 260, 360, 50);

        tLocation.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tLocation.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(tLocation);
        tLocation.setBounds(270, 140, 360, 50);

        locLab.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        locLab.setForeground(new java.awt.Color(153, 0, 153));
        locLab.setText("Location");
        jPanel1.add(locLab);
        locLab.setBounds(10, 140, 180, 50);

        lN.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lN.setForeground(new java.awt.Color(153, 0, 153));
        lN.setText("NAME");
        jPanel1.add(lN);
        lN.setBounds(20, 40, 100, 30);

        tname.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tname.setForeground(new java.awt.Color(255, 51, 102));
        jPanel1.add(tname);
        tname.setBounds(270, 30, 360, 50);

        lC.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lC.setForeground(new java.awt.Color(153, 0, 153));
        lC.setText("Contact");
        jPanel1.add(lC);
        lC.setBounds(10, 540, 200, 30);

        tContact.setEditable(false);
        tContact.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tContact.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(tContact);
        tContact.setBounds(260, 530, 360, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stark/industries/Background.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1310, 820);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1303, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 817, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 Statement stmt = null;
     ResultSet rs = null;
     
     
     
     public static Connection getConnection(){
         Connection con=null;
         try{
             Class.forName("com.mysql.jdbc.Driver");
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stark_industries","root","stid");
         }
         catch (Exception ex){
             JOptionPane.showMessageDialog(null, "Stark Server Connection Failure");
         }
         
         return con;
     }
    private void btn_CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CheckActionPerformed
        // TODO add your handling code here:
        btn_Terminate.setVisible(true);
        btn_Clear.setVisible(true);
        lC.setVisible(true);
        lD.setVisible(true);
        lN.setVisible(true);
        lS.setVisible(true);
        lC.setVisible(true);
        tname.setVisible(true);
        tLocation.setVisible(true);
        tDate.setVisible(true);
        tTime.setVisible(true);
        tContact.setVisible(true);

         String name=tname.getText();
        String loc = tLocation.getText();
       Statement pstmt;
        pstmt = null;
       Connection conn=null;
       ResultSet rs = null;
       try{
           Class.forName("com.mysql.jdbc.Driver");
           conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/shop","root","stid");
           stmt=conn.createStatement();
           rs=stmt.executeQuery("select * from Customers where Name="+"'"+name+"'"+"&& Location="+"'"+loc+"'"+";");
           
           while(rs.next()){
               tname.setText(rs.getString(1));
               tDate.setText(rs.getString(3));
               tTime.setText(rs.getString(4));
               tContact.setText(rs.getString(5));
               tLocation.setText(rs.getString(2));
               

              
           }
       }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        finally{
            try{
                conn.close();
                pstmt.close();
                rs.close();
            }
            catch(Exception ex){

            }

        }

    }//GEN-LAST:event_btn_CheckActionPerformed

    private void btn_ReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReturnActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Exiting Terminate Window...");
        Welcome_Screen gy = new Welcome_Screen();
        gy.setVisible(true);
        close();

    }//GEN-LAST:event_btn_ReturnActionPerformed

    private void btn_TerminateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TerminateActionPerformed
        // TODO add your handling code here:
        int p = JOptionPane.showConfirmDialog(null,"'Are You Sure To Delete The Record  "+tname.getText()+"","Delete Record",JOptionPane.YES_NO_OPTION);
        if(p==0){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = null;
           conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/shop","root","stid");
           stmt=conn.createStatement();
           String name = tname.getText();
           String loc = tLocation.getText();
           stmt.executeUpdate("delete from Customers where Name="+"'"+name+"'"+"&& Location="+"'"+loc+"'"+";");
            JOptionPane.showMessageDialog(null, "Record Deleted");
            stmt.close();
            conn.close();
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error in Deletion");
        }
        
       
       
        
        }   
    }//GEN-LAST:event_btn_TerminateActionPerformed

    private void btn_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ClearActionPerformed
        // TODO add your handling code here:
        
        tname.setText("");
        tLocation.setText("");
        tDate.setText("");
        tTime.setText("");
        tContact.setText("");
    }//GEN-LAST:event_btn_ClearActionPerformed

    public void close(){
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
         Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    
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
            java.util.logging.Logger.getLogger(Stark_Industries_TERMINATE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stark_Industries_TERMINATE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stark_Industries_TERMINATE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stark_Industries_TERMINATE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Remove_Record().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Check;
    private javax.swing.JButton btn_Clear;
    private javax.swing.JButton btn_Return;
    private javax.swing.JButton btn_Terminate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lC;
    private javax.swing.JLabel lD;
    private javax.swing.JLabel lN;
    private javax.swing.JLabel lS;
    private javax.swing.JLabel locLab;
    public static javax.swing.JTextField tContact;
    public static javax.swing.JTextField tDate;
    private javax.swing.JTextField tLocation;
    public static javax.swing.JTextField tTime;
    public static transient volatile javax.swing.JTextField tname;
    // End of variables declaration//GEN-END:variables
}