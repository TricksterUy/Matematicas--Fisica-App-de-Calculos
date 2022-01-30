package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ecuaciones extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ecuaciones frame = new ecuaciones();
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
	public ecuaciones() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int salida = 0;
				salida = JOptionPane.showConfirmDialog(null, "Realmente deseas salir del programa?");

				switch (salida) {
				case 0:
					dispose();
					JOptionPane.showMessageDialog(null,
							"No eres tu, soy yo, pero quizas deberiamos probar otros programas");
					break;
				case 1:
					JOptionPane.showMessageDialog(null, "Aqui no ha pasado nada, seguimos");
					break;
				case 2:
					
					break;
				case -1: break;
				}
			}
		});
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Archivos de Programas\\Eclipse Workspace\\MateFisi\\imagen\\icono.png"));
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setResizable(false);
		setTitle("Men\u00FA de Ecuaci\u00F3nes Matem\u00E1ticas");
		setBounds(100, 100, 341, 417);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblOpcion = new JLabel("Elija entre las siguientes opci\u00F3nes");
		lblOpcion.setHorizontalAlignment(SwingConstants.CENTER);
		lblOpcion.setBounds(10, 20, 317, 40);
		lblOpcion.setFont(new Font("Calibri", Font.PLAIN, 20));
		contentPane.add(lblOpcion);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setBackground(new Color(102, 204, 204));
		btnVolver.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new principal().setVisible(true);
			}
		});
		btnVolver.setBounds(187, 322, 115, 40);
		contentPane.add(btnVolver);
		
		JButton btnPrimergdo = new JButton("Primer Grado");
		btnPrimergdo.setBackground(new Color(255, 102, 153));
		btnPrimergdo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new primergdo().setVisible(true);
				dispose();
			}
		});
		btnPrimergdo.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnPrimergdo.setBounds(55, 126, 230, 59);
		contentPane.add(btnPrimergdo);
		
		JButton btnSegundogdo = new JButton("Segundo Grado");
		btnSegundogdo.setBackground(new Color(255, 255, 153));
		btnSegundogdo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new segundogdo().setVisible(true);
				dispose();
			}
		});
		btnSegundogdo.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnSegundogdo.setBounds(55, 226, 230, 59);
		contentPane.add(btnSegundogdo);
		
		JButton btnHelp = new JButton("Help");
		btnHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ayuda3().setVisible(true);
			}
		});
		btnHelp.setFont(new Font("Arial Narrow", Font.PLAIN, 10));
		btnHelp.setBackground(new Color(102, 153, 255));
		btnHelp.setBounds(253, 73, 61, 21);
		contentPane.add(btnHelp);
		
	}
}
