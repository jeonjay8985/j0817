package j0817;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class MyFrame_2 extends JFrame implements ActionListener {
 private JButton button1,button2;
 private JLabel label;
 int counter=0;
 
 
 public MyFrame_2() {
  setSize(400,150);
  setTitle("이벤트 예제");
  setLayout(new FlowLayout());
  button1=new JButton("증가");
  button2=new JButton("감소");
  label = new JLabel("현재의 카운터값: "+ counter);
  button1.addActionListener(this);
  button2.addActionListener(this);
  add(label);
  add(button1);
  add(button2);
  setVisible(true);
 }
  public void actionPerformed(ActionEvent e ) {
   JButton b=(JButton)e.getSource();
   switch(b.getText()) {
   case "증가" : counter++; break;
   case "감소" : counter--; break;
   default : break;
   }
  label.setText("현재의 카운터값 : "+ counter);
  }
 
  
  
  public static void main(String[] args) {
  // TODO Auto-generated method stub
  MyFrame_2 t = new MyFrame_2();
 }

} 
