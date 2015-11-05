package password;
import javax.swing.JPanel;

import java.awt.GridBagLayout;

import javax.swing.JButton;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.SwingConstants;
import javax.swing.JLabel;

import chapter3_8.NewAppFrame;

import java.awt.Font;


public class passTest extends JPanel {

	/**
	 * Create the panel.
	 */

	JLabel label;
	JLabel label2;
	JLabel label3;
	JLabel label4;
	JLabel label5;
	
	char[] chars1 = {'a','b','c','d','e'};
	char[] chars2 = {'a','b','c','d','e'};
	char[] chars3 = {'a','b','c','d','e'};
	char[] chars4 = {'a','b','c','d','e'};
	char[] chars5 = {'a','b','c','d','e'};

	
	public void main(String[] args){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					passTest frame = new passTest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public passTest() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JButton up = new JButton("\u2191");
		up.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getLabel(1).setText(Character.toString(chars1[1]));
			}
		});
		GridBagConstraints gbc_up = new GridBagConstraints();
		gbc_up.insets = new Insets(0, 0, 5, 5);
		gbc_up.gridx = 1;
		gbc_up.gridy = 2;
		add(up, gbc_up);
		
		JButton up2 = new JButton("\u2191");
		GridBagConstraints gbc_up2 = new GridBagConstraints();
		gbc_up2.insets = new Insets(0, 0, 5, 5);
		gbc_up2.gridx = 2;
		gbc_up2.gridy = 2;
		add(up2, gbc_up2);
		
		JButton up3 = new JButton("\u2191");
		GridBagConstraints gbc_up3 = new GridBagConstraints();
		gbc_up3.insets = new Insets(0, 0, 5, 5);
		gbc_up3.gridx = 3;
		gbc_up3.gridy = 2;
		add(up3, gbc_up3);
		
		JButton up4 = new JButton("\u2191");
		GridBagConstraints gbc_up4 = new GridBagConstraints();
		gbc_up4.insets = new Insets(0, 0, 5, 5);
		gbc_up4.gridx = 4;
		gbc_up4.gridy = 2;
		add(up4, gbc_up4);
		
		JButton up5 = new JButton("\u2191");
		GridBagConstraints gbc_up5 = new GridBagConstraints();
		gbc_up5.insets = new Insets(0, 0, 5, 5);
		gbc_up5.gridx = 5;
		gbc_up5.gridy = 2;
		add(up5, gbc_up5);
		
		label = new JLabel("A");
		label.setFont(new Font("Arial", Font.PLAIN, 14));
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 1;
		gbc_label.gridy = 3;
		add(label, gbc_label);
		
		label2 = new JLabel("A");
		label2.setFont(new Font("Arial", Font.PLAIN, 14));
		GridBagConstraints gbc_label2 = new GridBagConstraints();
		gbc_label2.insets = new Insets(0, 0, 5, 5);
		gbc_label2.gridx = 2;
		gbc_label2.gridy = 3;
		add(label2, gbc_label2);
		
		label3 = new JLabel("A");
		label3.setFont(new Font("Arial", Font.PLAIN, 14));
		GridBagConstraints gbc_label3 = new GridBagConstraints();
		gbc_label3.insets = new Insets(0, 0, 5, 5);
		gbc_label3.gridx = 3;
		gbc_label3.gridy = 3;
		add(label3, gbc_label3);
		
		label4 = new JLabel("A");
		label4.setFont(new Font("Arial", Font.PLAIN, 14));
		GridBagConstraints gbc_label4 = new GridBagConstraints();
		gbc_label4.insets = new Insets(0, 0, 5, 5);
		gbc_label4.gridx = 4;
		gbc_label4.gridy = 3;
		add(label4, gbc_label4);
		
		label5 = new JLabel("A");
		label5.setFont(new Font("Arial", Font.PLAIN, 14));
		GridBagConstraints gbc_label5 = new GridBagConstraints();
		gbc_label5.insets = new Insets(0, 0, 5, 5);
		gbc_label5.gridx = 5;
		gbc_label5.gridy = 3;
		add(label5, gbc_label5);
		
		JButton submit = new JButton("SUBMIT");
		GridBagConstraints gbc_submit = new GridBagConstraints();
		gbc_submit.insets = new Insets(0, 0, 5, 0);
		gbc_submit.gridx = 7;
		gbc_submit.gridy = 3;
		add(submit, gbc_submit);
		
		JButton down = new JButton("\u2193");
		down.setVerticalAlignment(SwingConstants.BOTTOM);
		GridBagConstraints gbc_down = new GridBagConstraints();
		gbc_down.insets = new Insets(0, 0, 5, 5);
		gbc_down.gridx = 1;
		gbc_down.gridy = 4;
		add(down, gbc_down);
		
		JButton down2 = new JButton("\u2193");
		down2.setVerticalAlignment(SwingConstants.BOTTOM);
		GridBagConstraints gbc_down2 = new GridBagConstraints();
		gbc_down2.insets = new Insets(0, 0, 5, 5);
		gbc_down2.gridx = 2;
		gbc_down2.gridy = 4;
		add(down2, gbc_down2);
		
		JButton down3 = new JButton("\u2193");
		down3.setVerticalAlignment(SwingConstants.BOTTOM);
		GridBagConstraints gbc_down3 = new GridBagConstraints();
		gbc_down3.insets = new Insets(0, 0, 5, 5);
		gbc_down3.gridx = 3;
		gbc_down3.gridy = 4;
		add(down3, gbc_down3);
		
		JButton down4 = new JButton("\u2193");
		down4.setVerticalAlignment(SwingConstants.BOTTOM);
		GridBagConstraints gbc_down4 = new GridBagConstraints();
		gbc_down4.insets = new Insets(0, 0, 5, 5);
		gbc_down4.gridx = 4;
		gbc_down4.gridy = 4;
		add(down4, gbc_down4);
		
		JButton down5 = new JButton("\u2193");
		down5.setVerticalAlignment(SwingConstants.BOTTOM);
		down5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_down5 = new GridBagConstraints();
		gbc_down5.insets = new Insets(0, 0, 5, 5);
		gbc_down5.gridx = 5;
		gbc_down5.gridy = 4;
		add(down5, gbc_down5);

	}
	public JLabel getLabel(int num){

		switch(num){
		case 1:
			return label;
		case 2:
			return label2;
		case 3:
			return label3;
		case 4:
			return label4;
		case 5:
			return label5;
		}
		return label; //shouldn't happen
	}
}
