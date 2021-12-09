import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class Firstpage implements ActionListener
{
JFrame fr;
JButton b1,b2;

Firstpage()
{
fr=new JFrame();
fr.setLayout(null);
fr.setSize(600,600);
fr.setTitle("--JAVA MINI PROJECT--");
Container c=fr.getContentPane();

b1=new JButton("Login");
b1.setBounds(150,250,100,30);
fr.add(b1);
b2=new JButton("Signup");
b2.setBounds(300,250,100,30);
fr.add(b2);
b1.addActionListener(this);
b2.addActionListener(this);
fr.setVisible(true);
}
public static void main(String s[])
{
new Firstpage();
}
public void actionPerformed(ActionEvent e)
{
    if (e.getSource()==b1){ 
        login pages = new login();  
    }
    
    else if (e.getSource()==b2){
        register pages = new register();  
    }
}
}