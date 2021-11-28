import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  
  
class Verify extends JFrame implements ActionListener  
{  
    JButton b1;  
    JPanel newPanel;  
    JLabel otpLabel;  
    JTextField  textField;
      
    Verify()  
    {     
        otpLabel = new JLabel();  
        otpLabel.setText("Enter OTP");      
        textField = new JTextField(15);    
        b1 = new JButton("SUBMIT"); 
        b1.addActionListener(this);    
        newPanel = new JPanel(new GridLayout(3, 1));  
        newPanel.add(otpLabel);   
        newPanel.add(textField);      
        newPanel.add(b1);      

        add(newPanel, BorderLayout.CENTER);  

        setTitle("Verification Page");         
    } 
    
    public void actionPerformed(ActionEvent ae)   
    {  
     JOptionPane.showMessageDialog(this, "Sucessful login");
    }

}        
class Verification
{  
  
    public static void main(String arg[])  
    {  
    Verify form = new Verify();  
    form.setSize(300,100);  //set size of the frame  
    form.setVisible(true);  //make form visible to the user  
      
    }  
}  