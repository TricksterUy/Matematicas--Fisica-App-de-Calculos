package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					principal frame = new principal();
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
	public principal() {
		addWindowListener(new WindowAdapter() {

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
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage("D:\\Archivos de Programas\\Eclipse Workspace\\MateFisi\\imagen\\icono.png"));
		setResizable(false);
		setTitle("Programa Matem\u00E1ticas y F\u00EDsica");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 560, 400);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.background"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lbltitulo = new JLabel("Programa de calculos de Matem\u00E1ticas y F\u00EDsica");
		lbltitulo.setForeground(new Color(0, 0, 0));
		lbltitulo.setFont(new Font("Calibri", Font.ITALIC, 24));
		lbltitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lbltitulo.setBounds(5, 5, 540, 73);
		contentPane.add(lbltitulo);

		JButton btnIntro = new JButton("INTRODUCCI\u00D3N");
		btnIntro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new introduccion().setVisible(true);
				dispose();
			}
		});
		btnIntro.setBackground(new Color(255, 51, 102));
		btnIntro.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnIntro.setBounds(34, 88, 200, 56);
		contentPane.add(btnIntro);

		JButton btnMates = new JButton("Men\u00FA Matem\u00E1ticas");
		btnMates.setBackground(new Color(0, 153, 255));
		btnMates.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ecuaciones().setVisible(true);
				dispose();
			}
		});
		btnMates.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnMates.setBounds(34, 169, 200, 56);
		contentPane.add(btnMates);

		JButton btnFisica = new JButton("Men\u00FA F\u00EDsica");
		btnFisica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new equilibrio().setVisible(true);
				dispose();
			}
		});
		btnFisica.setBackground(new Color(102, 204, 51));
		btnFisica.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnFisica.setBounds(34, 244, 200, 56);
		contentPane.add(btnFisica);

		JButton btnSalir = new JButton("SALIR");
		btnSalir.setBackground(new Color(255, 153, 51));
		btnSalir.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				JOptionPane.showMessageDialog(null,
						"No eres tu, soy yo, pero quizas deberiamos probar otros programas");
			}
		});
		btnSalir.setBounds(375, 294, 144, 51);
		contentPane.add(btnSalir);

		JLabel lblImagen = new JLabel("");
		lblImagen.setIcon(new ImageIcon("D:\\Archivos de Programas\\Eclipse Workspace\\MateFisi\\imagen\\HYDRA.png"));
		lblImagen.setHorizontalAlignment(SwingConstants.CENTER);
		lblImagen.setBounds(297, 88, 222, 155);
		contentPane.add(lblImagen);

		JLabel lblDevs = new JLabel("Barrera - Dutra Dev Team");
		lblDevs.setForeground(Color.BLACK);
		lblDevs.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDevs.setHorizontalAlignment(SwingConstants.CENTER);
		lblDevs.setBounds(297, 225, 222, 40);
		contentPane.add(lblDevs);

	}
}
