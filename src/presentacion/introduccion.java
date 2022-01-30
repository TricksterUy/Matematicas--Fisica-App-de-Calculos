package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JScrollBar;
import java.awt.ScrollPane;
import java.awt.SystemColor;
import java.awt.TextArea;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class introduccion extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					introduccion frame = new introduccion();
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
	public introduccion() {
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
		setTitle("INTRODUCCI\u00D3N");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setBackground(new Color(102, 204, 204));
		btnVolver.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new principal().setVisible(true);
			}
		});
		btnVolver.setBounds(628, 509, 115, 40);
		contentPane.add(btnVolver);
		
		TextArea txtIntro = new TextArea();
		txtIntro.setEditable(false);
		txtIntro.setBackground(UIManager.getColor("Button.background"));
		txtIntro.setFont(new Font("Arial", Font.PLAIN, 14));
		txtIntro.setText("\r\n                        \u00A1Bienvenidos al programa de c\u00E1lculo de Matem\u00E1ticas y F\u00EDsica!\r\n\r\nEstas a punto de experimentar un gran avance tecnol\u00F3gico en cuanto a c\u00E1lculos de las materias nombradas, \r\nel presente programa fue desarrollado por dos de los alumnos de 2do BG: Sandra Barrera y V\u00EDctor Dutra.\r\n\r\nEste programa est\u00E1 dise\u00F1ado con el fin de que puedas realizar c\u00E1lculos de ecuaciones hasta de 2do grado \r\nde manera simple y amigable, accediendo a cada una de las opciones dadas (Matem\u00E1ticas o F\u00EDsica) \r\nencontraras los campos establecidos donde completando los mismos, el programa te arrojara el o los \r\nresultados, no obstante, contaras con una ventana llamada \u201CHELP\u201D donde tendr\u00E1s ejemplos de c\u00F3mo \r\ningresar las funciones para los casos de las ecuaciones de 2do grado y/o en el c\u00E1lculo de equilibrio \r\nentre cargas para el caso de f\u00EDsica, como ingresar los valores con exponentes, adem\u00E1s de una tabla con \r\ncada una de las equivalencias.\r\n\r\nTe preguntaras\u2026\u00BFc\u00F3mo puedo usarlo?, \u00BFla respuesta? \u00A1Muy f\u00E1cil!!\r\n\r\nSimplemente deber\u00E1s de oprimir el bot\u00F3n de la materia que elijas, una vez dentro de ella, llenar los \r\ncampos establecidos de manera clara, luego adem\u00E1s del bot\u00F3n de ayuda ya nombrado, contaras con \r\ntres botones m\u00E1s:\r\n\r\nCalcular: Habiendo llenado los campos solicitados, y oprimiendo este bot\u00F3n, el programa realizara \r\nel c\u00E1lculo solicitado arrojando en una ventana emergente el o los resultados.\r\n\r\nLimpiar: Tal como dice su nombre, si quieres realizar un nuevo c\u00E1lculo, basta con dar click y limpiar \r\nlos campos.\r\n\r\nVolver: Como bien dice su nombre, presionando este bot\u00F3n, vas un paso m\u00E1s atr\u00E1s, volviendo a la \r\nopci\u00F3n anterior o al men\u00FA principal.\r\n\r\nTen presente en todo momento que, si no quieres usar el programa, est\u00E9s donde est\u00E9s, presionando \r\nla \u201CX\u201D en la parte superior derecha, se te daran opci\u00F3nes para cerrar el programa, en caso contrario, \r\npuedes salir en la ventana principal presionando el bot\u00F3n \u201CSalir\u201D y\u2026ojo...el programa es un poco \r\nsensible de sentimientos.\r\n\r\nNo te entretenemos m\u00E1s, esperamos que sea de suma utilidad nuestro peque\u00F1o aporte y que te brinde \r\nuna gran ayuda en tus c\u00E1lculos cotidianos.\r\n\r\n\u00A1Disfruta!!!\r\n\r\n\r\n\r\n");
		txtIntro.setBounds(10, 10, 764, 493);
		contentPane.add(txtIntro);
		
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.setBounds(10, 10, 764, 493);
		contentPane.add(scrollPane);
		
	
		

	}
}
