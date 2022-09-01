package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.border.LineBorder;
//import java.awt.Point; lang dulot

public class Finals {

	private JFrame frame;
	private JTextField textField;
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JButton btnNewButton_1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Finals window = new Finals();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/** wla akong maisip na pang variable smol brain
	/**
	 * Create the application.
	 */
	public Finals() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(135, 206, 250));
		frame.setBounds(100, 100, 795, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);  // gigitna ung bobo
		frame.setUndecorated(true); //wag to gago hahahaha nakalimutan ko dulot n2
		
		textField = new JTextField();
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 20));
		textField.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(0, 0, 0)));
		textField.setOpaque(false);
		textField.setBounds(23, 156, 248, 35);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		btnNewButton = new JButton("Login");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 21));
		btnNewButton.setBorder(new LineBorder(new Color(255, 140, 0), 25, true));
		btnNewButton.setBackground(new Color(255, 140, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//mag lologin sa basurang to
				String un= textField.getText();
				String pw= String.valueOf(passwordField.getPassword());
				
				if(un.equals("vince")&&pw.equals("1234")) { //need para maka login
					JOptionPane.showMessageDialog(null, "Login Successful Welcome " + un);
					frame.dispose();
					F2 vibes= new F2();
					vibes.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Login Failed");
				}
			}
			
		});
		btnNewButton.setBounds(56, 318, 197, 45);
		frame.getContentPane().add(btnNewButton);
		
		lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
		lblNewLabel_1.setBounds(23, 131, 122, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
		lblNewLabel_2.setBounds(23, 225, 122, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(new Color(255, 165, 0));
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\VRE\\eclipse-workspace\\try\\imege\\rsz_[citypngcom]download_close_x_logo_black_icon_png_-_736x736.png"));
		btnNewButton_1.setBounds(684, 0, 174, 45);
		frame.getContentPane().add(btnNewButton_1);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\VRE\\eclipse-workspace\\try\\imege\\imageedit_3_8936466268.jpg"));
		//ImageIcon img = new ImageIcon("/imageedit_3_8936466268.jpg");
		lblNewLabel.setBounds(312, -21, 497, 523);
		frame.getContentPane().add(lblNewLabel);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 20));
		passwordField.setOpaque(false);
		passwordField.setBackground(new Color(255, 255, 255));
		passwordField.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(0, 0, 0)));
		passwordField.setBounds(23, 266, 248, 29);
		frame.getContentPane().add(passwordField);
		
		
	}
}
