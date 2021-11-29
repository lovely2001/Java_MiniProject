import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  
  
class Registration extends JFrame implements ActionListener  
{  
    JButton b1;  
    JPanel newPanel;  
    JLabel l2, l3, l4, l5, l6, l7, l8;  
    JTextField tf1, tf2, tf5, tf6, tf7;  
    JPasswordField p1, p2;   
      
    Registration()  
    {     
        l2  = new JLabel();  
        l2.setText("Username");      
        tf1 = new JTextField(15);    
       
        l3  = new JLabel();  
        l3.setText("Email-ID:");      
        tf2 = new JTextField(15);    

        l4  = new JLabel();  
        l4.setText("Create Passowrd:");      
        p1 = new JPasswordField();  

        l5  = new JLabel();  
        l5.setText("Confirm Password:");      
        p2 = new JPasswordField(); 

        if(p1 != p2){ 
            System.out.println("Wrong password");
        }
        
        l6 = new JLabel();  
        l6.setText("Country:");      
        tf5 = new JPasswordField();  

        l7  = new JLabel();  
        l7.setText("State:");      
        tf6  = new JPasswordField();  

        l8 = new JLabel();  
        l8.setText("Phone NO.:");      
        tf7 = new JPasswordField(); 
   
    
        b1 = new JButton("Generate OTP"); 
           
        newPanel = new JPanel(new GridLayout(9, 1));  
        newPanel.add(l2);   
        newPanel.add(tf1);   
        newPanel.add(l3);   
        newPanel.add(tf2);       
        newPanel.add(l4); 
        newPanel.add(p1);    
        newPanel.add(l5); 
        newPanel.add(p2);  
        newPanel.add(l6); 
        newPanel.add(tf5); 
        newPanel.add(l7); 
        newPanel.add(tf6); 
        newPanel.add(l8); 
        newPanel.add(tf7);   
        newPanel.add(b1); 
                
        add(newPanel, BorderLayout.CENTER);  
           
        b1.addActionListener(this);    

        setTitle("Registration FORM");         
    } 
    
       
    public void actionPerformed(ActionEvent ae)   
    {  
       
        dispose();    
        otp page = new otp(1);  
        page.setVisible(true);  
    }

    public static void main(String arg[])  
    {  
    Registration form = new Registration();  
    form.setSize(300,500);  //set size of the frame  
    form.setVisible(true);  //make form visible to the user  
      
    }  
}  
    