package ssogong_daye;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextArea;

class MainDemo extends JFrame 
{
	private JPanel jp1, jp2, jp3;
	JMenuBar jmb = new JMenuBar();
	JMenu menu1 = new JMenu("RENT");
	JMenu menu2 = new JMenu("RETURN");
	JMenu menu3 = new JMenu("SEARCH");
	JMenu menu4 = new JMenu("NEW");
	JMenu menu5 = new JMenu("UPDATE");
	JMenu menu6 = new JMenu("DELETE");
	
	
	public MainDemo()
	{
		Container ct = getContentPane();
		BorderLayout bl = new BorderLayout(10, 5);
		ct.setLayout(bl);
		
		jp1 = new JPanel();
		jp1.setLayout(new GridLayout(1,2));
		jp1.add(new JLabel("제목"));
		jp1.add(new JButton("로그아웃"));
		
		jp2 = new JPanel();
		jmb.add(menu1);	jmb.add(menu2);	jmb.add(menu3);	
		jmb.add(menu4);	jmb.add(menu5);	jmb.add(menu6);
		setJMenuBar(jmb);
		jp2.add(jmb);/*
		jp2.setLayout(new GridLayout(1,6));
		jp2.add(new JLabel("RENT"));
		jp2.add(new JLabel("RETURN"));
		jp2.add(new JLabel("SEARCH"));
		jp2.add(new JLabel("NEW"));
		jp2.add(new JLabel("UPDATE"));
		jp2.add(new JLabel("DELETE"));*/
		
		jp3 = new JPanel();
		jp3.add(new JTextArea(10,100));
		
		ct.add(jp1, BorderLayout.NORTH);
		ct.add(jp2, BorderLayout.CENTER);
		ct.add(jp3, BorderLayout.SOUTH);
		
		setTitle("BOOK MANAGER");
		setSize(1000,850);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainDemo();
		/*Scanner input = new Scanner(System.in);

	    String username;
	    String password;

	    System.out.println("***Log in***");
	    System.out.println("User ID: ");
	    username = input.nextLine();

	    System.out.println("Password: ");
	    password = input.nextLine();

	    users check = new users(username, password);

	    if(check.auth()) 
	        System.out.println("로그인에 성공했습니다.");
	    else
	    	System.out.println("로그인에 실패하였습니다.");*/
	}

}

