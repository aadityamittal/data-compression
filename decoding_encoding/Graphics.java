package decoding_encoding;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.awt.Window.Type;

public class Graphics {

	private JFrame frmDataCompresser;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Graphics window = new Graphics();
					window.frmDataCompresser.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Graphics() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDataCompresser = new JFrame();
		frmDataCompresser.setTitle("Data Compresser");
		frmDataCompresser.setBounds(100, 100, 742, 752);
		frmDataCompresser.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDataCompresser.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 49));
		textField.setBounds(35, 145, 663, 86);
		frmDataCompresser.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 34));
		lblNewLabel_2.setBounds(0, 477, 708, 108);
		frmDataCompresser.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("Enter text to compress");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 25));
		lblNewLabel.setBounds(119, 78, 484, 57);
		frmDataCompresser.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 34));
		lblNewLabel_1.setBounds(10, 389, 708, 108);
		frmDataCompresser.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Compress");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String string = textField.getText();
				lblNewLabel_1.setText("Encoded text = "+HuffMan.encode(string));
				lblNewLabel_2.setText("Decoded text = "+HuffMan.decode(HuffMan.encode(string)));
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btnNewButton.setBounds(241, 251, 215, 57);
		frmDataCompresser.getContentPane().add(btnNewButton);
		
		
	}
}
