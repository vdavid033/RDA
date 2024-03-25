package videoteka;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Main {

	private JFrame frmVideoteka;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmVideoteka.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmVideoteka = new JFrame();
		frmVideoteka.setTitle("Videoteka");
		frmVideoteka.setBounds(100, 100, 420, 421);
		frmVideoteka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmVideoteka.getContentPane().setLayout(null);
		
		JButton btnPopisFilmova = new JButton("Popis filmova");
		btnPopisFilmova.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnPopisFilmova.setBounds(33, 61, 161, 45);
		frmVideoteka.getContentPane().add(btnPopisFilmova);
		
		JButton btnPopisPosudbi = new JButton("Popis posudbi filmova");
		btnPopisPosudbi.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnPopisPosudbi.setBounds(204, 61, 164, 45);
		frmVideoteka.getContentPane().add(btnPopisPosudbi);
		
		JButton btnUnosFilmova = new JButton("Unos filmova");
		btnUnosFilmova.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnUnosFilmova.setBounds(33, 128, 161, 45);
		frmVideoteka.getContentPane().add(btnUnosFilmova);
		
		JButton btnUnosKorisnika = new JButton("Unos korisnika");
		btnUnosKorisnika.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnUnosKorisnika.setBounds(207, 128, 161, 45);
		frmVideoteka.getContentPane().add(btnUnosKorisnika);
		
		textField = new JTextField();
		textField.setBounds(63, 232, 305, 29);
		frmVideoteka.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(33, 207, 108, 14);
		frmVideoteka.getContentPane().add(lblNewLabel);
	}
}
