package test;

//import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JTextPane;

public class F2 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					F2 frame = new F2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
		int ulit;
	/**
	 * Create the frame.
	 */
	public F2() {
		setBackground(new Color(135, 206, 250));
		setTitle("Ordering");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1317, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField = new JTextField();
		textField.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
		textField.setText("0");
		textField.setToolTipText("Quantity");
		textField.setBounds(121, 282, 78, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\VRE\\eclipse-workspace\\try\\imege\\rsz_2exps28800_ug143377d12_18_1b_rms.jpg"));
		lblNewLabel.setToolTipText("Burger");
		lblNewLabel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		//new ImageIcon("/rsz_2exps28800_ug143377d12_18_1b_rms.jpg");
		lblNewLabel.setBounds(10, 75, 304, 167);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\VRE\\eclipse-workspace\\try\\imege\\rsz_13390031274_0f663f87cb_o.jpg"));
		lblNewLabel_1.setBounds(355, 75, 304, 167);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
		textField_1.setText("0");
		textField_1.setToolTipText("Quantity");
		textField_1.setColumns(10);
		textField_1.setBounds(495, 282, 78, 26);
		contentPane.add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
		textField_3.setText("0");
		textField_3.setToolTipText("Quantity");
		textField_3.setColumns(10);
		textField_3.setBounds(870, 282, 78, 26);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\VRE\\eclipse-workspace\\try\\imege\\rsz_1606_chickenwings-640.jpg"));
		lblNewLabel_1_1.setBounds(719, 75, 286, 167);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("Price: \u20B1150");
		lblNewLabel_3.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
		lblNewLabel_3.setBounds(97, 245, 102, 26);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		lblNewLabel_4.setToolTipText("Buy One Take One");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\VRE\\eclipse-workspace\\try\\imege\\rsz_chicken-shawarma_09_1200x1200-735x735.jpg"));
		lblNewLabel_4.setBounds(10, 342, 304, 167);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3_1 = new JLabel("Price: ₱60");
		lblNewLabel_3_1.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
		lblNewLabel_3_1.setBounds(97, 512, 102, 26);
		contentPane.add(lblNewLabel_3_1);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
		textField_4.setText("0");
		textField_4.setToolTipText("Quantity");
		textField_4.setColumns(10);
		textField_4.setBounds(121, 549, 78, 26);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("");
		lblNewLabel_4_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		lblNewLabel_4_1.setIcon(new ImageIcon("C:\\Users\\VRE\\eclipse-workspace\\try\\imege\\rsz_maxresdefault.jpg"));
		lblNewLabel_4_1.setBounds(369, 342, 304, 167);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Price: \u20B175");
		lblNewLabel_3_1_1.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
		lblNewLabel_3_1_1.setBounds(456, 512, 102, 26);
		contentPane.add(lblNewLabel_3_1_1);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
		textField_5.setText("0");
		textField_5.setToolTipText("Quantity");
		textField_5.setColumns(10);
		textField_5.setBounds(495, 549, 78, 26);
		contentPane.add(textField_5);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setIcon(new ImageIcon("C:\\Users\\VRE\\eclipse-workspace\\try\\imege\\rsz_pngitem_1196722.png"));
		lblNewLabel_1_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		lblNewLabel_1_2.setBounds(719, 342, 286, 167);
		contentPane.add(lblNewLabel_1_2);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
		textField_6.setText("0");
		textField_6.setToolTipText("Quantity");
		textField_6.setColumns(10);
		textField_6.setBounds(870, 549, 78, 26);
		contentPane.add(textField_6);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 165, 0));
		panel.setBounds(0, 0, 1301, 64);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setBounds(1046, 75, 219, 196);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Total:");
		lblNewLabel_2.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
		lblNewLabel_2.setBounds(10, 11, 89, 14);
		panel_1.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
		textField_2.setText("0");
		textField_2.setBounds(32, 36, 169, 26);
		panel_1.add(textField_2);
		textField_2.setToolTipText("Total: ");
		textField_2.setColumns(10);
		textField_2.setEditable(false);
		
		final JLabel lblNewLabel_2_1 = new JLabel("Cash Amount:");
		lblNewLabel_2_1.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
		lblNewLabel_2_1.setVisible(false);
		lblNewLabel_2_1.setBounds(10, 73, 136, 14);
		panel_1.add(lblNewLabel_2_1);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
		textField_7.setToolTipText("Cash Received");
		textField_7.setBounds(32, 98, 169, 26);
		textField_7.setVisible(false);
		panel_1.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
		textField_8.setEditable(false);
		textField_8.setToolTipText("Change/Sukli");
		textField_8.setVisible(false);
		textField_8.setColumns(10);
		textField_8.setBounds(32, 152, 169, 26);
		panel_1.add(textField_8);
		
		final JLabel lblNewLabel_2_1_1 = new JLabel("Change:");
		lblNewLabel_2_1_1.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
		lblNewLabel_2_1_1.setVisible(false);
		lblNewLabel_2_1_1.setBounds(10, 121, 136, 34);
		panel_1.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("Price: \u20B150");
		lblNewLabel_3_1_1_1.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
		lblNewLabel_3_1_1_1.setBounds(456, 245, 102, 26);
		contentPane.add(lblNewLabel_3_1_1_1);
		
		JLabel lblNewLabel_3_1_1_2 = new JLabel("Price: \u20B1200");
		lblNewLabel_3_1_1_2.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
		lblNewLabel_3_1_1_2.setBounds(833, 245, 102, 26);
		contentPane.add(lblNewLabel_3_1_1_2);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("Qty:");
		lblNewLabel_3_1_2.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
		lblNewLabel_3_1_2.setBounds(82, 549, 102, 26);
		contentPane.add(lblNewLabel_3_1_2);
		
		JLabel lblNewLabel_3_1_1_2_1 = new JLabel("Price: ₱200");
		lblNewLabel_3_1_1_2_1.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
		lblNewLabel_3_1_1_2_1.setBounds(817, 512, 102, 26);
		contentPane.add(lblNewLabel_3_1_1_2_1);
		
		JLabel lblNewLabel_3_1_2_1 = new JLabel("Qty:");
		lblNewLabel_3_1_2_1.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
		lblNewLabel_3_1_2_1.setBounds(456, 549, 102, 26);
		contentPane.add(lblNewLabel_3_1_2_1);
		
		JLabel lblNewLabel_3_1_2_1_1 = new JLabel("Qty:");
		lblNewLabel_3_1_2_1_1.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
		lblNewLabel_3_1_2_1_1.setBounds(833, 549, 102, 26);
		contentPane.add(lblNewLabel_3_1_2_1_1);
		
		JLabel lblNewLabel_3_1_2_1_1_1 = new JLabel("Qty:");
		lblNewLabel_3_1_2_1_1_1.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
		lblNewLabel_3_1_2_1_1_1.setBounds(833, 282, 102, 26);
		contentPane.add(lblNewLabel_3_1_2_1_1_1);
		
		JLabel lblNewLabel_3_1_2_1_1_2 = new JLabel("Qty:");
		lblNewLabel_3_1_2_1_1_2.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
		lblNewLabel_3_1_2_1_1_2.setBounds(456, 282, 102, 26);
		contentPane.add(lblNewLabel_3_1_2_1_1_2);
		
		JLabel lblNewLabel_3_1_2_1_1_3 = new JLabel("Qty:");
		lblNewLabel_3_1_2_1_1_3.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
		lblNewLabel_3_1_2_1_1_3.setBounds(82, 282, 102, 26);
		contentPane.add(lblNewLabel_3_1_2_1_1_3);
		
		final JButton btnNewButton = new JButton("Order");
		btnNewButton.setBounds(169, 603, 147, 45);
		contentPane.add(btnNewButton);
		
		final JButton btnNewButton_1 = new JButton("Pay");
		btnNewButton_1.setBounds(386, 605, 147, 45);
		contentPane.add(btnNewButton_1);
		////////////////////////////////////////////////////////////////////new button shit
		final JButton btnNewButton_1_1 = new JButton("Receipt");
		btnNewButton_1_1.setBounds(602, 603, 147, 45);
		contentPane.add(btnNewButton_1_1);
		
		final JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
		textPane.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		textPane.setBounds(1027, 298, 264, 350);
		textPane.setVisible(false);
		textPane.setEditable(false);
		contentPane.add(textPane);

		final JButton btnOrderAgain = new JButton("Order Again?");
		btnOrderAgain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ulit = JOptionPane.showConfirmDialog(null, "Order Again?", "loop", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if(ulit == JOptionPane.YES_OPTION) {
					//set to 0 lahat ng textfield
					int i = 0;
					textField.setText(String.valueOf(i));
					textField_1.setText(String.valueOf(i));
					textField_2.setText(String.valueOf(i));
					textField_3.setText(String.valueOf(i));
					textField_4.setText(String.valueOf(i));
					textField_5.setText(String.valueOf(i));
					textField_6.setText(String.valueOf(i));
					textField_8.setText(String.valueOf(i));
					textField_7.setText(String.valueOf(i));
					textPane.setText(null);;
					//magtatago
					textField_8.setVisible(false);
					textField_7.setVisible(false);
					lblNewLabel_2_1_1.setVisible(false);
					lblNewLabel_2_1.setVisible(false);
					btnNewButton_1.setVisible(false);
					btnNewButton_1_1.setVisible(false);
					btnOrderAgain.setVisible(false);
					textPane.setVisible(false);
					//enable
					btnNewButton.setEnabled(true);
				}
				
			}
		});
		btnOrderAgain.setBounds(801, 603, 147, 45);
		btnOrderAgain.setVisible(false);
		contentPane.add(btnOrderAgain);
		
		
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//pang tsaran ng panel at button
				textPane.setVisible(true);
				btnOrderAgain.setVisible(true);
				
				//maglalagay ng shit sa textfield
				int i1 = Integer.parseInt(textField.getText());
				int i2 = Integer.parseInt(textField_1.getText());
				int i3 = Integer.parseInt(textField_3.getText());
				int i4 = Integer.parseInt(textField_4.getText());
				int i5 = Integer.parseInt(textField_5.getText());
				int i6 = Integer.parseInt(textField_6.getText());
				
				//ung mga textbox sa panel
				int tp = Integer.parseInt(textField_2.getText());
				int cm = Integer.parseInt(textField_7.getText());
				int cg = Integer.parseInt(textField_8.getText());
				
				textPane.setText("------------------Receipt-------------------"+"\nQTY\t" + "Item Description\t" + "Price\n"+ "--------------------------------------------------------------------\n" 
				+ i1 + "\tBurger\t" + "\t₱150\n" + i2 + "\tFries\t" + "\t₱50\n" + i3 + "\tWings\t" + "\t₱200\n"+ i4+ "\tShawarma\t" + "\t₱60\n"
						+ i5 + "\tShawarma Rice" + "\t₱75\n" + i6 + "\tCombo Meal" + "\t₱200\n" +
				"--------------------------------------------------------------------\n"
						+ "\t\tTotal\t" + tp + "\n\t\tCash\t" + cm + "\n\t\tChange\t" + cg +
						"\n-----Thank you for your Purchase-----");
				
			}
		});
		btnNewButton_1_1.setVisible(false);
		btnNewButton_1.setVisible(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int at = Integer.parseInt(textField_2.getText());
				int tt = Integer.parseInt(textField_7.getText());
				
				if (at > tt) {
					JOptionPane.showMessageDialog(null, "Invalid Amount");
					textField_7.setText(String.valueOf(0));
					btnNewButton_1_1.setVisible(false);
					
				}else {
					int cg = tt-at;
					textField_8.setText(String.valueOf(cg));
					btnNewButton_1_1.setVisible(true);
				}
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int qt, t1,t2,qt1,qt2,qt3,qt4,qt5,t3,t4,t5,t6,at;
			try {
				t1= Integer.parseInt(textField.getText());
				t2= Integer.parseInt(textField_1.getText());
				t3= Integer.parseInt(textField_3.getText());
				t4= Integer.parseInt(textField_4.getText());
				t5= Integer.parseInt(textField_5.getText());
				t6= Integer.parseInt(textField_6.getText());
				qt = t1*150;
				qt1 = t2 * 50;
				qt2 = t3 * 200;
				qt3 = t4 * 60;
				qt4 = t5 * 75;
				qt5 = t6 * 200;
				at = qt+qt1+qt2+qt3+qt4+qt5;
				textField_2.setText(Integer.toString(at));
				if (at == 0) {
					textField_8.setVisible(false);
					textField_7.setVisible(false);
					btnNewButton_1_1.setVisible(false);
					btnNewButton_1.setVisible(false);
					lblNewLabel_2_1.setVisible(false);
					lblNewLabel_2_1_1.setVisible(false);
				}else {
					textField_8.setVisible(true);
					textField_7.setVisible(true);
					btnNewButton_1_1.setVisible(false);
					btnNewButton_1.setVisible(true);
					lblNewLabel_2_1.setVisible(true);
					lblNewLabel_2_1_1.setVisible(true);
					
					btnNewButton.setEnabled(false);
					textField_8.setText(String.valueOf(0));
					textField_7.setText(String.valueOf(0));
				}
			}catch(Exception e1) {
				JOptionPane.showMessageDialog(null, "Number Only in the Textfields");//Papaplitan pa
				int i = 0;
				textField.setText(String.valueOf(i));
				textField_1.setText(String.valueOf(i));
				textField_3.setText(String.valueOf(i));
				textField_4.setText(String.valueOf(i));
				textField_5.setText(String.valueOf(i));
				textField_6.setText(String.valueOf(i));
			}
			
			}
			
		
		});
		setLocationRelativeTo(null);
		
	}
}
