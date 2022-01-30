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

public class primergdo extends JFrame {

	private JPanel contentPane;
	private JTextField txtX;
	private JTextField txtI;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					primergdo frame = new primergdo();
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
	public primergdo() {
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
		setResizable(false);
		setTitle("Ecuaci\u00F3nes de Primer Grado");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 413, 414);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblX = new JLabel("Ingrese el valor de X");
		lblX.setFont(new Font("Calibri", Font.BOLD, 14));
		lblX.setBounds(86, 104, 130, 40);
		contentPane.add(lblX);
		
		txtX = new JTextField();
		txtX.setFont(new Font("Calibri", Font.PLAIN, 14));
		txtX.setColumns(10);
		txtX.setBounds(226, 104, 130, 40);
		contentPane.add(txtX);
		
		JLabel lblI = new JLabel("Ingrese el valor Independiente");
		lblI.setFont(new Font("Calibri", Font.BOLD, 14));
		lblI.setBounds(20, 167, 196, 40);
		contentPane.add(lblI);
		
		txtI = new JTextField();
		txtI.setFont(new Font("Calibri", Font.PLAIN, 14));
		txtI.setColumns(10);
		txtI.setBounds(226, 167, 130, 40);
		contentPane.add(txtI);
		
		JLabel lblPrimero = new JLabel("Men\u00FA de calculo de Ecuaci\u00F3nes de 1er Grado");
		lblPrimero.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrimero.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblPrimero.setBounds(10, 10, 346, 33);
		contentPane.add(lblPrimero);
		
		JButton btnCalculo = new JButton("Calcular");
		btnCalculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String X = txtX.getText();
				String I = txtI.getText();

				if (X.isEmpty() || I.isEmpty()) {
					JOptionPane.showMessageDialog(null,
							"No pueden haber campos vacios, en caso de no tener el valor, ingrese un 0 ");
				}

				try {
					double CoefX = Double.parseDouble(X);
					double CoefI = Double.parseDouble(I);
					double Prom = -CoefI/CoefX;

					if (X.equals(0)) {
						JOptionPane.showMessageDialog(null, "No es una ecuación de primer grado");
					} else {

						JOptionPane.showMessageDialog(null,
								"El resultado de la ecuación es = " +Prom);
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
		btnCalculo.setBounds(86, 240, 263, 40);
		contentPane.add(btnCalculo);
		
		JButton btnLimpiar = new JButton("Limpiar los campos");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtX.setText("");
				txtI.setText("");
				
			}
		});
		btnLimpiar.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnLimpiar.setBackground(new Color(255, 204, 0));
		btnLimpiar.setBounds(20, 324, 197, 40);
		contentPane.add(btnLimpiar);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new ecuaciones().setVisible(true);
			}
		});
		btnVolver.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnVolver.setBackground(new Color(102, 204, 204));
		btnVolver.setBounds(258, 324, 115, 40);
		contentPane.add(btnVolver);
	}
}
