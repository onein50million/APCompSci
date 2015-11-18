package password;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.Font;

public class PasswordFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	String[] letters1 = {"X","B","C","D"};
	String[] letters2 = {"A","B","C","D"};
	String[] letters3 = {"A","B","C","D"};
	String[] letters4 = {"A","B","C","D"};
	String[] letters5 = {"A","B","C","D"};
	
	int letters1Pos = 0;
	int letters2Pos = 0;
	int letters3Pos = 0;
	int letters4Pos = 0;
	int letters5Pos = 0;
	
	public static void main(String[] args) {


		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PasswordFrame frame = new PasswordFrame();
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
	public PasswordFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton up1 = new JButton("↑");
		up1.setBounds(10, 11, 39, 34);
		contentPane.add(up1);
		
		JButton up2 = new JButton("↑");
		up2.setBounds(59, 11, 39, 34);
		contentPane.add(up2);
		
		JButton up3 = new JButton("↑");
		up3.setBounds(108, 11, 39, 34);
		contentPane.add(up3);
		
		JButton up4 = new JButton("↑");
		up4.setBounds(157, 11, 39, 34);
		contentPane.add(up4);
		
		JButton up5 = new JButton("↑");
		up5.setBounds(206, 11, 39, 34);
		contentPane.add(up5);
		
		JButton down5 = new JButton("↓");
		down5.setBounds(206, 123, 39, 34);
		contentPane.add(down5);
		
		JButton down4 = new JButton("↓");
		down4.setBounds(157, 123, 39, 34);
		contentPane.add(down4);
		
		JButton down3 = new JButton("↓");
		down3.setBounds(108, 123, 39, 34);
		contentPane.add(down3);
		
		JButton down2 = new JButton("↓");
		down2.setBounds(59, 123, 39, 34);
		contentPane.add(down2);
		
		JButton down1 = new JButton("↓");
		down1.setBounds(10, 123, 39, 34);
		contentPane.add(down1);
		
		JLabel label1 = new JLabel(letters1[letters1Pos]);
		label1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setBounds(10, 72, 39, 25);
		contentPane.add(label1);
		
		JLabel label2 = new JLabel("A");
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		label2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label2.setBounds(59, 72, 39, 25);
		contentPane.add(label2);
		
		JLabel label3 = new JLabel("A");
		label3.setHorizontalAlignment(SwingConstants.CENTER);
		label3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label3.setBounds(108, 72, 39, 25);
		contentPane.add(label3);
		
		JLabel label4 = new JLabel("A");
		label4.setHorizontalAlignment(SwingConstants.CENTER);
		label4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label4.setBounds(157, 72, 39, 25);
		contentPane.add(label4);
		
		JLabel label5 = new JLabel("A");
		label5.setHorizontalAlignment(SwingConstants.CENTER);
		label5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label5.setBounds(206, 72, 39, 25);
		contentPane.add(label5);
	
		//listeners
		up1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				letters1Pos = Math.floorMod(letters1Pos + 1, letters1.length);
				label1.setText(letters1[letters1Pos]);
			}
		});
		down1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				letters1Pos = Math.floorMod(letters1Pos - 1, letters1.length);
				System.out.println(letters1Pos);
				label1.setText(letters1[letters1Pos]);
			}
		});
	}
}
