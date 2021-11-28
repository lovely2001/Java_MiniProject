import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;  
      
class otp extends JFrame  implements ActionListener  
    {
        JButton b3; 
        otp(Integer length)

        {
            char[] otp1 = generateOTP(length);
            setSize(350,100);
            setTitle("OTP FOR VERIFICATION");
            JLabel l = new JLabel("Your OTP : ");
            add(l);
            JTextField tf = new JTextField(otp1.toString());
            add(tf);
            b3 = new JButton("Ok"); 
            add(b3);
            b3.addActionListener(this);  
            setLayout(new FlowLayout());
            setVisible(true);
        }
    
        private static char[] generateOTP(int length)
        {
            String numbers = "123456789";
            Random random = new Random();
            char[] otp1 = new char[length];
    
            for(int i = 0;i < length;i++)
            {
                otp1[i] = numbers.charAt(random.nextInt(numbers.length()));
            }
    
            return otp1;
        }

        public void actionPerformed(ActionEvent ae)   
       {       
        Verification page = new Verification();  
       // page.setvisible(true);  
        }
        public static void main(String args[])
        {
        new otp(1);
        }
}