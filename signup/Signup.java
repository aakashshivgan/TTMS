package signup;
import javax.swing.*;
import java.awt.*;

// import javax.swing.border.*;
 import java.awt.event.*;
// import java.sql.*;

public class Signup extends JFrame implements ActionListener{
    JButton b1,b2;
    JTextField t1, t2, t3, t4;
    Choice c1;
    Signup(){
        setBounds(600,250,700,350);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JPanel p1 = new JPanel();
        p1.setBackground( new Color(133,193,233));
        p1.setBounds(0,0,400,400);
        p1.setLayout(null);
        add(p1);
        
        JLabel l1 = new JLabel("username");
        l1.setFont(new Font("Tahoma",Font.BOLD,14));
        l1.setBounds(50,20,130,25);
        p1.add(l1);
        
        t1 = new JTextField();
        t1.setBounds(180,20,180,25);
        t1.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t1);
        
        JLabel l2 = new JLabel("name");
        l2.setFont(new Font("Tahoma",Font.BOLD,14));
        l2.setBounds(50,60,130,25);
        p1.add(l2);
        
        t2 = new JTextField();
        t2.setBounds(180,60,180,25);
        t2.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t2);
        
        JLabel l3 = new JLabel("password");
        l3.setFont(new Font("Tahoma",Font.BOLD,14));
        l3.setBounds(50,100,130,25);
        p1.add(l3);
        
        t3 = new JTextField();
        t3.setBounds(180,100,180,25);
        t3.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t3);
        
        JLabel l4= new JLabel("Security Question");
        l4.setFont(new Font("Tahoma",Font.BOLD,14));
        l4.setBounds(50,140,130,25);
        p1.add(l4);
        
        c1 = new Choice();
        c1.add ("your fav color");
        c1.add ("what is fav movie");
        c1.add ("your fav food");
        c1.setBounds(180,140,225,35);
        p1.add(c1);
        
        JLabel l5 = new JLabel("Answer");
        l5.setFont(new Font("Tahoma",Font.BOLD,14));
        l5.setBounds(50,180,130,25);
        p1.add(l5);
        
        t4 = new JTextField();
        t4.setBounds(180,180,180,25);
        t4.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t4);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/signup1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(380,380,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l6 = new JLabel (i3);
        l6.setBounds(415,50,250,250);
        add(l6);
        
        b1 = new JButton("Create");
        b1.setBounds(80,250,100,25);
        b1.setFont(new Font("Tahoma",Font.BOLD,14));
        b1.setForeground(new Color(133,193,233));
        b1.addActionListener(this);
        b1.setBackground(Color.WHITE);
        
        p1.add(b1);
        
        b2 = new JButton("Back");
        b2.setFont(new Font("Tahoma",Font.BOLD,14));
        b2.setForeground(new Color(133,193,233));
        b2.setBackground(Color.WHITE);
        b2.addActionListener(this);
        b2.setBounds(250,250,100,25);
        p1.add(b2);
        
        
    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()== b1){
         String username= t1.getText();
         String name = t2.getText();
         String password = t3.getText();
         String security = c1.getSelectedItem();
         String answer = t4.getText();
         
         String query = "insert into account values('"+username+"','"+name+"','"+password+"','"+security+"','"+answer+"')";
       try{
           conn c = new conn();
           c.s.executeUpdate(query);
           JOptionPane.showMessageDialog(null, "Account Created Successfully" );
      
           this.setVisible(false);
           new Login().setVisible(true);
       
       }catch(Exception e){
         
        }
        }else if (ae.getSource() == b2){
         new Login().setVisible(true);
         this.setVisible(false);
         
        }
    }
  public static void main (String[]args){
     new Signup().setVisible(true);
  }
          
}

