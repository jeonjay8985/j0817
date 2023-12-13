package j0817;

import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class exam04 extends JFrame{
	int num=0;
	String snum;
exam04(){
	
	
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setTitle("번호 증가 프로그램");
	Container c=getContentPane();
	c.setLayout(new GridLayout(2,1));
	JLabel lb1=new JLabel("0");
	lb1.setFont((new Font("Serif",Font.BOLD,30)));
	JButton b1=new JButton("증가");
	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	
	b1.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			num=num+1;
			snum=Integer.toString(num);
			lb1.setText(snum);
			
		}
		
	});
	
	
	p1.add(lb1);
	p2.add(b1);
	
	c.add(p1);
	c.add(p2);
	
	setSize(300,300);
	setVisible(true);
}
	public static void main(String[] args) {
		new exam04();
	}

}
