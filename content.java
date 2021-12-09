import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class content 
{
JFrame fr;
JButton bu1,bu2,bu3,bu4,bu5,bu6,bu7,bu8; 

content()
{
fr=new JFrame();
fr.setLayout(null);
fr.setSize(600,600);
fr.setTitle("Registration Page");
Container c=fr.getContentPane();

bu1=new JButton("SEM 1 Syallbus");
bu1.setBounds(170,30,200,30);
fr.add(bu1);

bu2=new JButton("SEM 2 Syallbus");
bu2.setBounds(170,90,200,30);
fr.add(bu2);

bu3=new JButton("SEM 3 Syallbus");
bu3.setBounds(170,150,200,30);
fr.add(bu3);

bu4=new JButton("SEM 4 Syallbus");
bu4.setBounds(170,210,200,30);
fr.add(bu4);

bu5=new JButton("SEM 5 Syallbus");
bu5.setBounds(170,270,200,30);
fr.add(bu5);

bu6=new JButton("SEM 6 Syallbus");
bu6.setBounds(170,330,200,30);
fr.add(bu6);


bu7=new JButton("SEM 7 Syallbus");
bu7.setBounds(170,390,200,30);
fr.add(bu7);


bu8=new JButton("SEM 8 Syallbus");
bu8.setBounds(170,450,200,30);
fr.add(bu8);


fr.setVisible(true);
}
public static void main(String s[])
{
new content();
}
}