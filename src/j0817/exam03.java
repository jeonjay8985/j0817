package j0817;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class exam03 extends JFrame{
	exam03(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("번호 증가 프로그램");
		
		Container c= getContentPane();
	    c.setLayout(null);                    
	    
		JPanel pn=new JPanel();
		pn.setBounds(80,40,120,40);
		
		JLabel lb=new JLabel("0");
		lb.setFont(new Font("맑은고딕",Font.BOLD,30));
		
		JButton btn1=new JButton("증가");
		btn1.setBounds(80,100,120,40);          
		
		pn.add(lb);
		add(btn1);
		add(pn);
        
        btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				lb.setText(String.valueOf(Integer.valueOf(lb.getText())+1));
				
			}
		
        	
        });
        
 
		
	    setSize(300,300);
		setVisible(true);
		  	
		
		
	}

	public static void main(String[] args) {
		// 실습01
		
		new exam03();

	}

}
