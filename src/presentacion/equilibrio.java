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
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class equilibrio extends JFrame {

	private JPanel contentPane;
	private JTextField txtqA;
	private JTextField txtqB;
	private JTextField txtL;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					equilibrio frame = new equilibrio();
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
	public equilibrio() {
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
		setTitle("Equilibrio entre Cargas");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 467, 419);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new principal().setVisible(true);
			}
		});
		btnVolver.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnVolver.setBackground(new Color(102, 204, 204));
		btnVolver.setBounds(304, 331, 115, 40);
		contentPane.add(btnVolver);

		JLabel lblEquilibrio = new JLabel("Men\u00FA de calculo de Ecuaci\u00F3nes de equilibrio entre cargas");
		lblEquilibrio.setHorizontalAlignment(SwingConstants.CENTER);
		lblEquilibrio.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblEquilibrio.setBounds(10, 10, 443, 33);
		contentPane.add(lblEquilibrio);

		JLabel lblqA = new JLabel("Ingrese el valor de la carga qA");
		lblqA.setHorizontalAlignment(SwingConstants.CENTER);
		lblqA.setFont(new Font("Calibri", Font.BOLD, 14));
		lblqA.setBounds(33, 83, 209, 40);
		contentPane.add(lblqA);

		txtqA = new JTextField();
		txtqA.setForeground(new Color(0, 0, 0));
		txtqA.setFont(new Font("Calibri", Font.PLAIN, 14));
		txtqA.setColumns(10);
		txtqA.setBounds(252, 83, 130, 40);
		contentPane.add(txtqA);

		txtqB = new JTextField();
		txtqB.setFont(new Font("Calibri", Font.PLAIN, 14));
		txtqB.setColumns(10);
		txtqB.setBounds(252, 133, 130, 40);
		contentPane.add(txtqB);

		txtL = new JTextField();
		txtL.setFont(new Font("Calibri", Font.PLAIN, 14));
		txtL.setColumns(10);
		txtL.setBounds(252, 183, 130, 40);
		contentPane.add(txtL);

		JButton btnCalculo = new JButton("Calcular");
		btnCalculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String cargaA = txtqA.getText();
				String cargaB = txtqB.getText();
				String distancia = txtL.getText();

				if (cargaA.isEmpty() || cargaB.isEmpty() || distancia.isEmpty()) {
					JOptionPane.showMessageDialog(null, "No pueden haber campos vacios ");
				}

				try {
					double QA = Double.parseDouble(cargaA);
					double QB = Double.parseDouble(cargaB);
					double DistL = Double.parseDouble(distancia);

					double CoefA = QA - QB;
					double CoefB = -2 * DistL * QA;
					double CoefC = (QA * (DistL * DistL));

					if (QA == QB) {

						double resultado = DistL / 2;
						JOptionPane.showMessageDialog(null, "La distancia de x es = " + resultado + "mts");

					} else {

						double ProR = (CoefB * CoefB) - (4 * CoefA * CoefC);

						double x1 = (-CoefB + Math.sqrt(ProR)) / (2 * CoefA);
						double x2 = (-CoefB - Math.sqrt(ProR)) / (2 * CoefA);

						if (ProR < 0) {
							JOptionPane.showMessageDialog(null, "La ecuación no tiene solución");
						} else {

							JOptionPane.showMessageDialog(null,
									"El resultado de la ecuación es: \n Valor de x1 = " + String.format(java.util.Locale.US,"%.3f", x1) + "\nValor de x2 = " + String.format(java.util.Locale.US,"%.3f", x2));
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
		btnCalculo.setBackground(new Color(204, 153, 255));
		btnCalculo.setBounds(85, 258, 263, 40);
		contentPane.add(btnCalculo);

		JButton btnLimpiar = new JButton("Limpiar los campos");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtL.setText("");
				txtqA.setText("");
				txtqB.setText("");
			}
		});
		btnLimpiar.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnLimpiar.setBackground(new Color(255, 204, 0));
		btnLimpiar.setBounds(33, 331, 197, 40);
		contentPane.add(btnLimpiar);

		JLabel lblqB = new JLabel("Ingrese el valor de la carga qB");
		lblqB.setHorizontalAlignment(SwingConstants.CENTER);
		lblqB.setFont(new Font("Calibri", Font.BOLD, 14));
		lblqB.setBounds(33, 133, 209, 40);
		contentPane.add(lblqB);

		JLabel lblIngreseElValor = new JLabel("Ingrese el valor de L en metros");
		lblIngreseElValor.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngreseElValor.setFont(new Font("Calibri", Font.BOLD, 14));
		lblIngreseElValor.setBounds(33, 183, 209, 40);
		contentPane.add(lblIngreseElValor);
		
		JButton btnNewButton = new JButton("Help");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ayuda().setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(102, 153, 255));
		btnNewButton.setFont(new Font("Arial Narrow", Font.PLAIN, 10));
		btnNewButton.setBounds(381, 53, 61, 21);
		contentPane.add(btnNewButton);
		
		JButton btnCarga = new JButton("Esquema de Cargas");
		btnCarga.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new cargas().setVisible(true);
			}
		});
		btnCarga.setFont(new Font("Arial Narrow", Font.BOLD, 10));
		btnCarga.setBackground(new Color(0, 255, 255));
		btnCarga.setBounds(33, 53, 141, 21);
		contentPane.add(btnCarga);
	}
}
