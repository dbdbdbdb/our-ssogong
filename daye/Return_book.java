package ssogong_daye;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.TextArea;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class Return_book extends JFrame{
	GridBagLayout gbl;
	GridBagConstraints gbc;
	//setDefaultCloseOperation(Frame.EXIT_ON_CLOSE);
	JMenuBar jmb = new JMenuBar();
	JMenu menu1 = new JMenu("RENT");
	JMenu menu2 = new JMenu("RETURN");
	JMenu menu3 = new JMenu("SEARCH");
	JMenu menu4 = new JMenu("NEW");
	JMenu menu5 = new JMenu("UPDATE");
	JMenu menu6 = new JMenu("DELETE");
	
	public Return_book(){
		//TextArea body = new TextArea(5,100);
		/*jmb.add(menu1);	jmb.add(menu2);	jmb.add(menu3);	
		jmb.add(menu4);	jmb.add(menu5);	jmb.add(menu6);
		setJMenuBar(jmb);*/
		gbl = new GridBagLayout();
		gbc = new GridBagConstraints();
		setLayout(gbl);
		
		gbc.fill = GridBagConstraints.BOTH;
		
		add(new JLabel("BOOK MANAGER", JLabel.CENTER),0,0,5,1,1,0);
		add(new JButton("login/logout"),5,0,1,1,0,0);
		
		add(new JButton("RENT"),0,1,1,1,1,0);
		add(new JButton("RETURN"),1,1,1,1,1,0);
		add(new JButton("SEARCH"),2,1,1,1,1,0);
		add(new JButton("NEW"),3,1,1,1,1,0);
		add(new JButton("UPDATE"),4,1,1,1,1,0);
		add(new JButton("DELETE"),5,1,1,1,1,0);
		/*add(new Label("RENT", Label.CENTER),0,1,1,2);
		add(new Label("RETURN", Label.CENTER),1,1,1,2);
		add(new Label("SEARCH", Label.CENTER),2,1,1,2);
		add(new Label("NEW", Label.CENTER),3,1,1,2);
		add(new Label("UPDATE", Label.CENTER),4,1,1,2);
		add(new Label("DELETE", Label.CENTER),5,1,1,2);	*/	
		
		add(new JLabel("Return_book", JLabel.CENTER),0,2,6,1,1,1);
	
		pack();
	}
		private void add(Component c, int x, int y, int w, int h, int wx, int wy){
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridwidth = w;
		gbc.gridheight = h;
		gbc.weightx = wx;
		gbc.weighty = wy;
		gbl.setConstraints(c, gbc);
		
		add(c);
	}
	
	public static void main(String args[]){
		Return_book f = new Return_book();
		f.setTitle("Gridd");
		f.setVisible(true);
		f.setSize(1000, 850);
		
	}

}
