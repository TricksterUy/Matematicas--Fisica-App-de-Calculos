package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import java.awt.Toolkit;

public class ayuda3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ayuda3 frame = new ayuda3();
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
	public ayuda3() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Archivos de Programas\\Eclipse Workspace\\MateFisi\\imagen\\icono.png"));
		setTitle("Ayuda Ecuaci\u00F2nes");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 610, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setBounds(443, 373, 115, 40);
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		contentPane.setLayout(null);
		btnVolver.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnVolver.setBackground(new Color(102, 204, 204));
		contentPane.add(btnVolver);
		
		JTextArea txtrTePreguntarascmo = new JTextArea();
		txtrTePreguntarascmo.setEditable(false);
		txtrTePreguntarascmo.setText("Te preguntaras, \u00BFc\u00F3mo se cuando estoy ante una ecuaci\u00F3n de primer o segundo grado?\r\n\r\nPues aqu\u00ED te explicaremos como identificar cada una:\r\n\r\nECUACIONES DE PRIMER GRADO\r\nUna ecuaci\u00F3n de primer grado es una igualdad que tiene una o m\u00E1s variables (inc\u00F3gnitas) cuyo exponente es \r\n1 (elevadas a uno, que no se escribe), resolverlas significa encontrar el valor de las variables con los que se \r\ncumple la igualdad. En otras palabras, una ecuaci\u00F3n de primer grado, son aquellas donde solamente tienes \r\nuna inc\u00F3gnita que puede ser llamada x la cual carece de exponente, por ejemplo:\r\n\r\n4x + 11 = 0\r\n\r\nECUACIONES DE SEGUNDO GRADO\r\nUna ecuaci\u00F3n de segundo grado es la que tiene la forma ax\u00B2 + bx + c, donde a, b, y c son n\u00FAmeros reales \r\ny a es diferente a cero, por ejemplo:\r\n\r\n4x\u00B2 + 3x + 12 = 0     a=4, b=3, c=12                  \r\n6x\u00B2 \u2013 5x = 0            a=6, b=-5, c=0\r\n\r\nCon la presente ayuda, esperamos te sea de utilidad a la hora de identificar cual deseas calcular.\r\nBuena suerte!!");
		txtrTePreguntarascmo.setBackground(UIManager.getColor("Button.background"));
		txtrTePreguntarascmo.setBounds(10, 10, 576, 353);
		contentPane.add(txtrTePreguntarascmo);
	}
}
