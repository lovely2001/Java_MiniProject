import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  
import java.awt.event.ActionEvent;   
  
class content extends JFrame implements ActionListener  
{  
    JButton bu1,bu2,bu3,bu4,bu5,bu6,bu7,bu8;  
    JPanel newPanel;  
      
    content()  
    {    
        bu1 = new JButton("SEM1"); 
        bu2 = new JButton("SEM2"); 
        bu3 = new JButton("SEM3"); 
        bu4 = new JButton("SEM4"); 
        bu5 = new JButton("SEM5"); 
        bu6 = new JButton("SEM6"); 
        bu7 = new JButton("SEM7"); 
        bu8 = new JButton("SEM8"); 
             
        newPanel = new JPanel(new GridLayout(3, 1));   
        newPanel.add(bu1);  
        newPanel.add(bu2);  
        newPanel.add(bu3);  
        newPanel.add(bu4);  
        newPanel.add(bu5);  
        newPanel.add(bu5);  
        newPanel.add(bu7);  
        newPanel.add(bu8);    
        newPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 10));     
        add(newPanel, BorderLayout.CENTER);     
        bu1.addActionListener(this);    
        bu2.addActionListener(this);    
        bu3.addActionListener(this);    
        bu4.addActionListener(this);    
        bu5.addActionListener(this);    
        bu6.addActionListener(this);    
        bu7.addActionListener(this);    
        bu8.addActionListener(this);    
    

        setTitle("LOGIN FORM");         
    } 
    
       
    public void actionPerformed(ActionEvent ae)   
    {  
        if (ae.getSource()==bu1){
            JOptionPane.showMessageDialog(this, "Please Visit DBIT official site"); 
        }
        else if (ae.getSource()==bu2){
            JOptionPane.showMessageDialog(this, "Please Visit DBIT official site"); 
        }
        else if (ae.getSource()==bu3){
            JOptionPane.showMessageDialog(this, "Please Visit DBIT official site"); 
        }
        else if (ae.getSource()==bu4){
            JOptionPane.showMessageDialog(this, "Please Visit DBIT official site"); 
        }
        else if (ae.getSource()==bu5){
            JOptionPane.showMessageDialog(this, "Please Visit DBIT official site"); 
        }
        else if (ae.getSource()==bu6){
            JOptionPane.showMessageDialog(this, "Please Visit DBIT official site"); 
        }
        else if (ae.getSource()==bu7){
            JOptionPane.showMessageDialog(this, "Please Visit DBIT official site"); 
        }
        else if (ae.getSource()==bu8){
            JOptionPane.showMessageDialog(this, "Please Visit DBIT official site"); 
        }
    }
         
    public static void main(String arg[])  
    {  
    content form = new content();  
    form.setVisible(true); //make form visible to the user  
    form.setSize(150,300);
      
    }  
}  
    