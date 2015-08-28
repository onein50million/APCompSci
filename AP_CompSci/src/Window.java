import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTabbedPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Window extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window frame = new Window();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void distance(String input) {
		input = input.toUpperCase();
		String inputSplit[] = input.split(" ");

		if (inputSplit.length != 2) {
			System.out.println("Please enter two words");
			System.exit(1);
		}

		char[] charArray0 = inputSplit[0].toCharArray();
		char[] charArray1 = inputSplit[1].toCharArray();

		for (int i = 0; i < charArray0.length; i++) {

			if (charArray1[i] >= charArray0[i]) {
				System.out.print(charArray1[i] - charArray0[i] + " ");
			} else {
				System.out.print(charArray1[i] + 26 - charArray0[i] + " ");
			}
			
		}
		System.out.print("\n");

	}

	/**
	 * Create the frame.
	 */
	public Window() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 231, 118);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblCool = new JLabel("Enter your two words.");
		lblCool.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCool.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblCool, BorderLayout.NORTH);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(textField, BorderLayout.CENTER);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				distance(textField.getText());
			}
		});
		contentPane.add(btnNewButton, BorderLayout.SOUTH);
	}

}
