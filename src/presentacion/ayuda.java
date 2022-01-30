package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.Toolkit;
import java.awt.ScrollPane;
import java.awt.TextArea;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class ayuda extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ayuda frame = new ayuda();
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
	public ayuda() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Archivos de Programas\\Eclipse Workspace\\MateFisi\\imagen\\icono.png"));
		setTitle("Ayuda F\u00EDsica");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 419, 525);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnVolver.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnVolver.setBackground(new Color(102, 204, 204));
		btnVolver.setBounds(276, 432, 115, 40);
		contentPane.add(btnVolver);
		
		TextArea textArea = new TextArea();
		textArea.setEditable(false);
		textArea.setBackground(UIManager.getColor("Button.background"));
		textArea.setText("\r\nEQUILIBRIO ENTRE CARGAS\r\n\r\nLa posici\u00F3n de equilibrio entre dos cargas a una distancia x, \r\nes aquella en la que la fuerza de atracci\u00F3n o repulsi\u00F3n entre \r\nlas cargas es igual a cero, es decir, la FN (Fuerza Neta) = 0\r\n\r\nINGRESO DE DATOS:\r\n\r\nDeberas ingresar las ecuaci\u00F3nes de las siguientes formas:\r\n\r\nn\u00B0 exponente n\u00B0-----> 4e-6\r\n\r\nu otra forma de ingresar seria...\r\n\r\nsu valor sin exponente con punto----> 0.000004\r\n\r\n*************************************************************\r\n*                              TABLA DE EQUIVALENCIAS               *\r\n*************************************************************\r\n\r\nFactor\tPrefijo\tS\u00EDmbolo\tFactor\tPrefijo\tS\u00EDmbolo\r\ne1\tdeca\tda\te-1\tdeci \td\r\ne2\thecto\th\te-2\tcenti\tc\r\ne3\tkilo\tk\te-3\tmili \tm\r\ne6\tmega\tM\te-6\tmicro\t\u00B5\r\ne9\tgiga\tG\te-9\tnano \tn\r\ne12\ttera\tT\te-12\tpico \tp\r\ne15\tpeta\tP\te-15\tfemto\tf\r\ne18\texa\tE\te-18\tatto \ta\r\ne21\tzetta\tZ\te-21\tzepto\tz\r\ne24\tyotta\tY\te-24\tyocto\ty\r\n\r\n");
		textArea.setBounds(10, 10, 386, 403);
		contentPane.add(textArea);
	}
}
