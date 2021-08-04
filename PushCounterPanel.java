package lab10_1302;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class PushCounterPanel extends JPanel{
	private int count;
	private JButton push, reset;
	private JLabel label;
	
	public PushCounterPanel() {
		count = 0;
		
		push = new JButton("Push Me!");
		reset = new JButton("Reset");
		label = new JLabel();
		push.addActionListener(new ButtonListener());
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count = 0;
				label.setText("Pushes: "+count);
			}

		});
		
		this.add(push);
		this.add(label);
		this.add(reset);
		
		this.setBackground(Color.cyan);
		this.setPreferredSize(new Dimension (300, 40));
	}
	
	private class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			count++;
			label.setText("Pushes: "+count);
		}
	}
}
