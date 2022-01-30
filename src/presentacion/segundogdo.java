package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class segundogdo extends JFrame {

	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;
	private JButton btnCalculo;
	private JLabel lblSegundo;
	private JButton btnLimpiar;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					segundogdo frame = new segundogdo();
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
	public segundogdo() {
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
				case -1:
					break;
				}
			}
		});
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage("D:\\Archivos de Programas\\Eclipse Workspace\\MateFisi\\imagen\\icono.png"));
		setResizable(false);
		setTitle("Ecuaci\u00F3nes de Segundo Grado");
		setBounds(100, 100, 416, 382);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblA = new JLabel("Ingrese el valor de a");
		lblA.setFont(new Font("Calibri", Font.BOLD, 14));
		lblA.setBounds(33, 54, 130, 40);
		contentPane.add(lblA);

		JLabel lblB = new JLabel("Ingrese el valor de b");
		lblB.setFont(new Font("Calibri", Font.BOLD, 14));
		lblB.setBounds(33, 117, 130, 40);
		contentPane.add(lblB);

		JLabel lblC = new JLabel("Ingrese el valor de c");
		lblC.setFont(new Font("Calibri", Font.BOLD, 14));
		lblC.setBounds(33, 179, 130, 40);
		contentPane.add(lblC);

		txtA = new JTextField();
		txtA.setFont(new Font("Calibri", Font.PLAIN, 14));
		txtA.setBounds(166, 53, 130, 40);
		contentPane.add(txtA);
		txtA.setColumns(10);

		txtB = new JTextField();
		txtB.setFont(new Font("Calibri", Font.PLAIN, 14));
		txtB.setColumns(10);
		txtB.setBounds(166, 116, 130, 40);
		contentPane.add(txtB);

		txtC = new JTextField();
		txtC.setFont(new Font("Calibri", Font.PLAIN, 14));
		txtC.setColumns(10);
		txtC.setBounds(166, 178, 130, 40);
		contentPane.add(txtC);

		btnCalculo = new JButton("Calcular");
		btnCalculo.setBackground(new Color(204, 153, 255));
		btnCalculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String A = txtA.getText();
				String B = txtB.getText();
				String C = txtC.getText();

				if (A.isEmpty() || B.isEmpty() || C.isEmpty()) {
					JOptionPane.showMessageDialog(null,
							"No pueden haber campos vacios, en caso de no tener el valor, ingrese un 0 ");
				}

				try {
					double CoefA = Double.parseDouble(A);
					double CoefB = Double.parseDouble(B);
					double CoefC = Double.parseDouble(C);

					if (CoefB == 0) {
						
						double ProR = (CoefB * CoefB) - (4 * CoefA * CoefC);

						double x1 = (-CoefB + Math.sqrt(ProR)) / (2 * CoefA);
						double x2 = (-CoefB - Math.sqrt(ProR)) / (2 * CoefA);
						if (x1 == x2) {
							JOptionPane.showMessageDialog(null,
									"El resultado de la ecuación es: \n Valor de x = ± " + x1);

						} else {

							JOptionPane.showMessageDialog(null, "El resultado de la ecuación es: \n Valor de x1 = "
									+ x1 + "\nValor de x2 = " + x2);
						}

					} else {

						double ProR = (CoefB * CoefB) - (4 * CoefA * CoefC);

						double x1 = (-CoefB + Math.sqrt(ProR)) / (2 * CoefA);
						double x2 = (-CoefB - Math.sqrt(ProR)) / (2 * CoefA);

						if (ProR < 0) {
							JOptionPane.showMessageDialog(null, "La ecuación no tiene solución");
						} else {
							if (x1 == x2) {
								JOptionPane.showMessageDialog(null,
										"El resultado de la ecuación es: \n Valor de x = ± " + x1);

							} else {

								JOptionPane.showMessageDialog(null, "El resultado de la ecuación es: \n Valor de x1 = "
										+ x1 + "\nValor de x2 = " + x2);
							}
						}
					}

				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Solo puede ingresar numeros");
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "ERROR");
				}
			}
		});
		btnCalculo.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnCalculo.setBounds(75, 229, 263, 40);
		contentPane.add(btnCalculo);

		lblSegundo = new JLabel("Men\u00FA de calculo de Ecuaci\u00F3nes de 2do Grado");
		lblSegundo.setHorizontalAlignment(SwingConstants.CENTER);
		lblSegundo.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblSegundo.setBounds(10, 10, 346, 33);
		contentPane.add(lblSegundo);

		btnLimpiar = new JButton("Limpiar los campos");
		btnLimpiar.setBackground(new Color(255, 204, 0));
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtA.setText("");
				txtB.setText("");
				txtC.setText("");
			}
		});
		btnLimpiar.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnLimpiar.setBounds(33, 292, 197, 40);
		contentPane.add(btnLimpiar);

		btnNewButton = new JButton("Help");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ayuda2().setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Arial Narrow", Font.PLAIN, 10));
		btnNewButton.setBackground(new Color(102, 153, 255));
		btnNewButton.setBounds(325, 54, 61, 21);
		contentPane.add(btnNewButton);

		JButton btnVolver = new JButton("Volver");
		btnVolver.setBackground(new Color(102, 204, 204));
		btnVolver.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnVolver.setBounds(271, 292, 115, 40);
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new ecuaciones().setVisible(true);
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnVolver);

	}
}
