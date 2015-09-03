package chapter3_8;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;

import net.miginfocom.swing.MigLayout;

import javax.swing.JRadioButton;
import javax.swing.JButton;

import java.awt.FlowLayout;

import javax.swing.AbstractButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.GridBagLayout;

import javax.swing.JSplitPane;
import javax.swing.SwingConstants;
import javax.swing.JRadioButtonMenuItem;

import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.Choice;

import javax.swing.ButtonGroup;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Enumeration;
import javax.swing.JToggleButton;

public class NewAppFrame extends JFrame {
	private final ButtonGroup candidates = new ButtonGroup();
	VotingMachine voter = new VotingMachine();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewAppFrame frame = new NewAppFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public NewAppFrame() {
		setTitle("Vote Now");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 418, 161);
		getContentPane().setLayout(null);
		
		JRadioButton Democrat = new JRadioButton("Democrat");
		Democrat.setHorizontalAlignment(SwingConstants.LEFT);
		Democrat.setFont(new Font("Verdana", Font.PLAIN, 20));
		candidates.add(Democrat);
		Democrat.setBounds(6, 10, 141, 23);
		getContentPane().add(Democrat);
		
		JRadioButton Republican = new JRadioButton("Republican");
		Republican.setHorizontalAlignment(SwingConstants.LEFT);
		Republican.setFont(new Font("Verdana", Font.PLAIN, 20));
		candidates.add(Republican);
		Republican.setBounds(6, 88, 141, 23);
		getContentPane().add(Republican);
		
		JButton btnVote = new JButton("Vote");	
		
		btnVote.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				for(Enumeration<AbstractButton> buttons = candidates.getElements(); buttons.hasMoreElements();){
						AbstractButton button = buttons.nextElement();
						
						if (button.isSelected()){
							System.out.println(button.getText());
							if (button.getText() == "Democrat") {
								
								voter.addDemocrat();
//								System.exit(0);
								
							}
							else if(button.getText() == "Republican"){
								
								voter.addRepublican();
//								System.exit(0);
								
							}
							
						}
				
				}
			}
		});
		btnVote.setBounds(166, 41, 123, 35);
		getContentPane().add(btnVote);
		
		JButton btnGetVotes = new JButton("Get Votes");
		btnGetVotes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(getContentPane(), "Democrat Votes: " + voter.getDemocrat() + "\nRepublican Votes: " + voter.getRepublican());
			}
		});
		btnGetVotes.setBounds(299, 31, 89, 23);
		getContentPane().add(btnGetVotes);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				voter.reset();
			}
		});
		btnReset.setBounds(299, 65, 89, 23);
		getContentPane().add(btnReset);
	}
}
