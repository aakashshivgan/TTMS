package Splash;
import javax.swing.*;
import java.awt.*;

public class splash {
    public static void main(String[] args){
        splashFrame frame = new splashFrame();
        frame.setVisible(true);
        int x = 1;
        for(int i = 1; i<= 700;i+=6, i+=7){
        frame.setLocation(750-(x+i)/2, 450 - (i/2));
        frame.setSize(x+i,i);
        try{
            Thread.sleep(10);
            
        }catch(Exception e){}
    }
        
        frame.setVisible(true);
      }
    }
class splashFrame extends JFrame implements Runnable{
    Thread t1;
    splashFrame(){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/download2.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1200,600,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        add(l1);
        
        
        //setBounds(300,200,900,600);//Location,Size
        //setUndecorated(true);
        t1 = new Thread(this);
        t1.start();
        
    }
    public void run(){
        try{
           Thread.sleep(7000);
            this.setVisible(false);
            new Login().setVisible(true);
            
        }catch(Exception e){}
        
    }
}
