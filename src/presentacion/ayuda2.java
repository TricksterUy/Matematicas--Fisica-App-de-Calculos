package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class ayuda2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ayuda2 frame = new ayuda2();
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
	public ayuda2() {
		setTitle("Ayuda Ecuaci\u00F3nes 2do Grado");
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Archivos de Programas\\Eclipse Workspace\\MateFisi\\imagen\\icono.png"));
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 387, 255);
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
		btnVolver.setBounds(244, 162, 115, 40);
		contentPane.add(btnVolver);
		
		JTextArea txtrEcuacionDeSegundo = new JTextArea();
		txtrEcuacionDeSegundo.setEditable(false);
		txtrEcuacionDeSegundo.setText("Ecuacion de Segundo Grado: ax\u00B2 + bx +c = 0 \r\nax\u00B2 = a\r\nbx = b\r\nc = c \r\n\r\nPara resolverla hacemos uso de Bhaskara:\r\nx = -b \u00B1 \u221A b\u00B2 - 4.a.c / 2.a\r\n\r\n\r\n\r\n");
		txtrEcuacionDeSegundo.setBackground(UIManager.getColor("Button.background"));
		txtrEcuacionDeSegundo.setBounds(10, 10, 363, 142);
		contentPane.add(txtrEcuacionDeSegundo);
	}

}
