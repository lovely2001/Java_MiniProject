import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class register implements ActionListener
{
JFrame fr;
JLabel lb1,lb2,lb3,lb4,lb5,lb6,lb7;
JButton b1;
JTextField textField1, textField2, textField3, textField4, textField5, textField6, textField7;  

register()
{
fr=new JFrame();
fr.setLayout(null);
fr.setSize(600,600);
fr.setTitle("Registration Page");
Container c=fr.getContentPane();

lb1=new JLabel("User Name");
lb1.setBounds(150,50,300,30);
fr.add(lb1);
textField1=new JTextField(15);
textField1.setBounds(290,50,150,30);
fr.add(textField1);

lb3=new JLabel("Create Password");
lb3.setBounds(150,120,100,30);
fr.add(lb3);
textField3=new JTextField(15);
textField3.setBounds(290,120,150,30);
fr.add(textField3);


lb4=new JLabel("Confirm Password");
lb4.setBounds(150,190,150,30);
fr.add(lb4);
textField4=new JTextField(15);
textField4.setBounds(290,190,150,30);
fr.add(textField4);

lb5=new JLabel("Country ");
lb5.setBounds(150,260,150,30);
fr.add(lb5);
textField5=new JTextField(15);
textField5.setBounds(290,260,150,30);
fr.add(textField5);


lb6=new JLabel("State");
lb6.setBounds(150,330,150,30);
fr.add(lb6);
textField6=new JTextField(15);
textField6.setBounds(290,330,150,30);
fr.add(textField6);


lb7=new JLabel("Phone Number");
lb7.setBounds(150,400,150,30);
fr.add(lb7);
textField7=new JTextField(15);
textField7.setBounds(290,400,150,30);
fr.add(textField7);


b1=new JButton("Generate OTP");
b1.setBounds(180,470,200,30);
fr.add(b1);
b1.addActionListener(this);
fr.setVisible(true);
}
public static void main(String s[])
{
new register();
}
public void actionPerformed(ActionEvent e)
{    
    otp page = new otp(1);  
    page.setVisible(true);  
    page.setLocationRelativeTo(null);
}
}