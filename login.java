import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class login implements ActionListener
{
JFrame fr;
JLabel lb1,lb2;
JButton b1;
JTextField  textField1, textField2;  

login()
{
fr=new JFrame();
fr.setLayout(null);
fr.setSize(600,600);
fr.setTitle("Login Page");
Container c=fr.getContentPane();

lb1=new JLabel("Username");
lb1.setBounds(150,150,400,30);
fr.add(lb1);

textField1 = new JTextField(15);   
textField1.setBounds(300,150,150,30);
fr.add(textField1);

lb2=new JLabel("Password");
lb2.setBounds(150,300,100,30);
fr.add(lb2);
textField2=new JTextField(15);
textField2.setBounds(300,300,150,30);
fr.add(textField2);


b1=new JButton("Generate OTP");
b1.setBounds(180,450,200,30);
fr.add(b1);
;
b1.addActionListener(this);
fr.setVisible(true);
}
public static void main(String s[])
{
new login();
}
public void actionPerformed(ActionEvent e)
{    
    otp page = new otp(1);  
}
}