/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


package ihm;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.awt.EventQueue;



/**
 *
 * @author youce
 */
public class Signup extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Signup() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Firstname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        loginbutton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Teacherradio = new javax.swing.JRadioButton();
        Studentradio = new javax.swing.JRadioButton();
        loginbutton1 = new javax.swing.JButton();
        Email = new javax.swing.JTextField();
        Lastname = new javax.swing.JTextField();
        Confirmepassword = new javax.swing.JPasswordField();
        Password = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 112, 150));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\youce\\Desktop\\ihm2\\IHM\\icons\\USTO.png")); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("USTO");

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PLATFORME");

        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Copyright ©2023 Negad Youcef and Araba Younes. All rights reserved");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 450, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(16, 16, 16))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 410, 780);

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel6.setText(" Category");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(450, 310, 80, 19);

        Firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstnameActionPerformed(evt);
            }
        });
        jPanel1.add(Firstname);
        Firstname.setBounds(450, 180, 360, 40);

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel7.setText("Password");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(450, 460, 80, 19);

        loginbutton.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        loginbutton.setForeground(new java.awt.Color(0, 102, 102));
        loginbutton.setText("Login");
        loginbutton.setBorder(new javax.swing.border.MatteBorder(null));
        loginbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(loginbutton);
        loginbutton.setBounds(710, 710, 100, 30);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("I've an acount !");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(450, 730, 110, 16);

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel9.setText("Confirme password");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(450, 540, 150, 19);

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel10.setText("First Name");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(450, 140, 80, 19);

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel11.setText("Last Name");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(450, 230, 80, 19);

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel12.setText("Email");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(450, 380, 40, 19);

        buttonGroup1.add(Teacherradio);
        Teacherradio.setText("Teacher");
        Teacherradio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeacherradioActionPerformed(evt);
            }
        });
        jPanel1.add(Teacherradio);
        Teacherradio.setBounds(600, 340, 98, 21);

        buttonGroup1.add(Studentradio);
        Studentradio.setText("Student");
        Studentradio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentradioActionPerformed(evt);
            }
        });
        jPanel1.add(Studentradio);
        Studentradio.setBounds(450, 340, 90, 21);

        loginbutton1.setBackground(new java.awt.Color(0, 102, 102));
        loginbutton1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        loginbutton1.setForeground(new java.awt.Color(255, 255, 255));
        loginbutton1.setText("Sign up");
        loginbutton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        loginbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbutton1ActionPerformed(evt);
            }
        });
        jPanel1.add(loginbutton1);
        loginbutton1.setBounds(570, 640, 100, 30);

        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });
        jPanel1.add(Email);
        Email.setBounds(450, 410, 360, 40);

        Lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastnameActionPerformed(evt);
            }
        });
        jPanel1.add(Lastname);
        Lastname.setBounds(450, 260, 360, 40);
        jPanel1.add(Confirmepassword);
        Confirmepassword.setBounds(450, 570, 360, 40);
        jPanel1.add(Password);
        Password.setBounds(450, 490, 360, 40);

        jLabel14.setBackground(new java.awt.Color(0, 102, 102));
        jLabel14.setFont(new java.awt.Font("Georgia Pro", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 102));
        jLabel14.setText("SIGN UP");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(550, 50, 170, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FirstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstnameActionPerformed

    private void loginbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbuttonActionPerformed
        // TODO add your handling code here:
       this.dispose();
        Login  LoginFrame = new Login();
         LoginFrame.setVisible(true);
         LoginFrame.pack();
         LoginFrame.setLocationRelativeTo(null);
    }//GEN-LAST:event_loginbuttonActionPerformed

    private void TeacherradioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeacherradioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TeacherradioActionPerformed

    private void StudentradioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentradioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StudentradioActionPerformed

    private void loginbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbutton1ActionPerformed
        // TODO add your handling code here:
        // Collect data from the form
    String firstName = Firstname.getText();
    String lastName = Lastname.getText();
    String email = Firstname.getText();
    char[] passwordChars = Password.getPassword();
    String password = new String(passwordChars);
    char[] confirmPasswordChars = Confirmepassword.getPassword();
    String confirmPassword = new String(confirmPasswordChars);
    
      // Debug prints to check validation condition
     System.out.println("Validation Check: " + (firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()));
     
    // Determine the selected category (teacher or student)
        String category = Teacherradio.isSelected() ? "Teacher" : "Student";
   
         if (firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
        // Display an error message for empty fields
        JOptionPane.showMessageDialog(this, "Please fill in all the required fields", "Incomplete Information", JOptionPane.ERROR_MESSAGE);
        return; // Exit the method without proceeding further
    }
  if (password.length() < 5) {
    // Display an error message for a password that is too short
    JOptionPane.showMessageDialog(this, "Password must have at least 8 characters", "Password Error", JOptionPane.ERROR_MESSAGE);
    return; // Exit the method without proceeding further
}
   

    // Perform validation, e.g., check if passwords match

    if (!password.equals(confirmPassword)) {
        // Display an error message or handle password mismatch
        JOptionPane.showMessageDialog(this, "Passwords do not match", "Password Error", JOptionPane.ERROR_MESSAGE);
        return; // Exit the method without proceeding further
    }

    // Do something with the collected data, e.g., store it in a database
    // You can replace this with your actual registration logic
    // For now, let's print the collected data
    System.out.println("First Name: " + firstName);
    System.out.println("Last Name: " + lastName);
    System.out.println("Category: " + category);
    System.out.println("Email: " + email);
    System.out.println("Password: " + password);

    // Optionally, clear the form fields after successful registration
    clearFormFields();

    // Display a success message or perform other actions as needed
    JOptionPane.showMessageDialog(this, "Registration successful", "Success", JOptionPane.INFORMATION_MESSAGE);
       if ("Student".equals(category)) {
       this.dispose();
        SI  SIFrame = new SI();
         SIFrame.setVisible(true);
         SIFrame.pack();
        SIFrame.setLocationRelativeTo(null);
    } else if ("Teacher".equals(category)) {
      this.dispose();
        TI  TIFrame = new TI();
         TIFrame.setVisible(true);
         TIFrame.pack();
        TIFrame.setLocationRelativeTo(null);
    }
}

// Method to clear the form fields
private void clearFormFields() {
    Firstname.setText("");
    Lastname.setText("");
    Email.setText("");
    Password.setText("");
    Confirmepassword.setText("");
    // Clear the selected radio button (if needed)
    buttonGroup1.clearSelection();
        
    }//GEN-LAST:event_loginbutton1ActionPerformed

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailActionPerformed

    private void LastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastnameActionPerformed

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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Confirmepassword;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField Firstname;
    private javax.swing.JTextField Lastname;
    private javax.swing.JPasswordField Password;
    private javax.swing.JRadioButton Studentradio;
    private javax.swing.JRadioButton Teacherradio;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginbutton;
    private javax.swing.JButton loginbutton1;
    // End of variables declaration//GEN-END:variables
}
