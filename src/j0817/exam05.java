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

class aa{
	int a;
}

public class exam05 extends JFrame{
	exam05(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("번호 증가 프로그램");
		
		aa a=new aa();
		a.a=0;
		JLabel jl=new JLabel("0");
		jl.setFont(new Font("맑은 고딕",Font.BOLD,30));
		
		JButton btn=new JButton("증가");
		btn.setFont(new Font("맑은 고딕",Font.PLAIN,20));
		
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				a.a=a.a+1;
				String S=String.valueOf(a.a);
				jl.setText(S);
				
				
			}
			
		});
		
		Container c=getContentPane();
		c.setLayout(new GridLayout(2,1));
		
		JPanel jp1=new JPanel();
		JPanel jp2=new JPanel();
		jp1.add(jl);
		jp2.add(btn);
		
		
		add(jp1);
		add(jp2);
		
		
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new exam05();

	}

}