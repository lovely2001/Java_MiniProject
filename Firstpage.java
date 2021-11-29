import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  
  
class Firstpage extends JFrame implements ActionListener  
{  
    JButton b1,b2;  
    JPanel newPanel;  
    JLabel newLabel;  
      
    Firstpage()  
    {     
          
        newLabel = new JLabel();  
        newLabel.setText("Welcome !!");        
        
        b1 = new JButton("Sign up"); 
        b2 = new JButton("Login"); 
           
        newPanel = new JPanel(new GridLayout(3, 1));  
        newPanel.add(newLabel);    
        newPanel.add(b1); 
        newPanel.add(b2); 
        newPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 0));           
        add(newPanel, BorderLayout.CENTER);  
           
        b1.addActionListener(this);             
        b2.addActionListener(this);   

        setTitle("Trial App");         
    } 
    
       
    public void actionPerformed(ActionEvent ae)   
    {  
        if (ae.getSource()==b2){
            dispose();  
            loginpage pages = new loginpage();  
            pages.setSize(300,100);
            pages.setVisible(true); 
        }
        
        else if (ae.getSource()==b1){
            dispose();  
            Registration pages = new Registration();  
            pages.setSize(300,500);
            pages.setVisible(true); 
        }
      
    }


    public static void main(String arg[])  
    {  
    Firstpage form = new Firstpage();  
    form.setSize(300,90);  //set size of the frame  
    form.setVisible(true);  //make form visible to the user  
      
    }  
}  
    
