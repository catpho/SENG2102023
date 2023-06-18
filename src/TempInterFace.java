import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class TempInterFace extends JFrame implements ActionListener{
	JButton firstfeature = new JButton("1");
	
	JButton secondfeature = new JButton("2");
	
	JButton thirdfeature = new JButton("3");
	
	JButton fourthfeature = new JButton("4");
	
	JButton fifthfeature = new JButton("5");
	
	JButton sixthfeature = new JButton("6");
	
	JButton sevenfeature = new JButton("7");
	
	JButton eightfeature = new JButton("8");
	
	JButton ninefeature = new JButton("9");
	
		TempInterFace (){

		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(new GridLayout(3,3,0,0));
		
		
		
		
		
		//grid layout for 10th feature
		frame.add(firstfeature);
		frame.add(secondfeature);
		frame.add(thirdfeature);
		frame.add(fourthfeature);
		frame.add(fifthfeature);
		frame.add(sixthfeature);
		frame.add(sevenfeature);
		frame.add(eightfeature);
		frame.add(ninefeature);
	
		frame.setVisible(true);
		firstfeature.addActionListener(this);

	}
	public static void main (String[] args) {
		TempInterFace run = new TempInterFace();
	}
	
	public void actionPerformed (ActionEvent e) {
		if (e.getSource()== firstfeature) {
			System.out.println("Pew Pew");
		}
	}
}
