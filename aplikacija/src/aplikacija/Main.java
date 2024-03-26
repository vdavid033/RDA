package aplikacija;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frmGlavniProzor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmGlavniProzor.setVisible(true);
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
		frmGlavniProzor = new JFrame();
		frmGlavniProzor.setTitle("Glavni prozor");
		frmGlavniProzor.setBounds(100, 100, 482, 401);
		frmGlavniProzor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGlavniProzor.getContentPane().setLayout(null);
		
		JButton btnPopisFilmova = new JButton("Popis filmova");
		btnPopisFilmova.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Popis filmova");
			
			}
		});
		btnPopisFilmova.setBounds(23, 62, 140, 51);
		frmGlavniProzor.getContentPane().add(btnPopisFilmova);
		
		JButton btnPopisPosudbi = new JButton("Popis posudbi filmova");
		btnPopisPosudbi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		btnPopisPosudbi.setBounds(210, 62, 148, 51);
		frmGlavniProzor.getContentPane().add(btnPopisPosudbi);
		
		JButton btnUnosFilmova = new JButton("Unos filmova");
		btnUnosFilmova.setBounds(23, 174, 140, 51);
		frmGlavniProzor.getContentPane().add(btnUnosFilmova);
		
		JButton btnUnosKorisnika = new JButton("Unos korisnika");
		btnUnosKorisnika.setBounds(207, 174, 151, 51);
		frmGlavniProzor.getContentPane().add(btnUnosKorisnika);
	}
}
