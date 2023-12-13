package j0817;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class exam06 extends JFrame {
	exam06() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("번호 증가 프로그램");
		Container c=getContentPane();
		c.setLayout(null);
		
		JPanel pn1=new JPanel();
		pn1.setBounds(80,20,120,40);
		
		JLabel lb=new JLabel("0");
		lb.setFont(new Font("맑은고딕",Font.PLAIN,20));
		
		JButton bt=new JButton("증가");
		bt.setBounds(80,80,120,40);
		
		pn1.add(lb);
		add(bt);
		add(pn1);
		
		bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int count=Integer.parseInt(lb.getText());
				count += 1;
				lb.setText(String.valueOf(count));
					
				}
	
		});
				
		setSize(300,200);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new exam06();
		
	}

}