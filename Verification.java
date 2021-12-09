import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  
  
class Verification extends JFrame implements ActionListener  
{  
    JButton b1;  
    JPanel newPanel;  
    JLabel otpLabel;  
    JTextField  textField;
      
    Verification()  
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
        String user = textField.getText();   
        JOptionPane.showMessageDialog(this, "Sucessful login"); 
        dispose();  
        content pages = new content();    
    }
  
    public static void main(String arg[])  
    {  
    Verification form = new Verification();    
    form.setVisible(true);  //make form visible to the user  
      
    }  
}  