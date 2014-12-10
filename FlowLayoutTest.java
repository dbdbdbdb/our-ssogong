package ssogong_daye;
import javax.swing.*;
import java.awt.*;

class FlowLayout1 extends JFrame{
	public FlowLayout1(){
		Container ct = getContentPane();
		FlowLayout fl = new FlowLayout(FlowLayout.RIGHT, 10, 15);
		ct.setLayout(fl);
		for(int i = 1; i<=10; i++)
			ct.add(new JButton("¹öÆ°"+i));
		setTitle("flowlayoutTest");
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

public class FlowLayoutTest {
	public static void main(String[] args){
		new FlowLayout1();
	}
}
