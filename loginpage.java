import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  
  
class loginpage extends JFrame implements ActionListener  
{  
    JButton b1;  
    JPanel newPanel;  
    JLabel userLabel, passLabel;  
    JTextField  textField1, textField2;  
      
    loginpage()  
    {     
          
        userLabel = new JLabel();  
        userLabel.setText("Username");      
        textField1 = new JTextField(15);    
   
        passLabel = new JLabel();  
        passLabel.setText("Password");       
        textField2 = new JPasswordField(15);

        b1 = new JButton("GENERATE OTP"); 
           
        newPanel = new JPanel(new GridLayout(3, 1));  
        newPanel.add(userLabel);   
        newPanel.add(textField1);   
        newPanel.add(passLabel);   
        newPanel.add(textField2);    
        newPanel.add(b1);      

        add(newPanel, BorderLayout.CENTER);  
           
        b1.addActionListener(this);    

        setTitle("LOGIN FORM");         
    } 
    
       
    public void actionPerformed(ActionEvent ae)   
    {  
        String userValue = textField1.getText();        
        String passValue = textField2.getText();   
        dispose();    
        otp page = new otp(1);  
        page.setVisible(true);  
    }

    public static void main(String arg[])  
    {  
    loginpage form = new loginpage();  
    form.setSize(300,100);  //set size of the frame  
    form.setVisible(true);  //make form visible to the user  
      
    }  
}  
    