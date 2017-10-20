package LISTASDOBLES;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 742, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMenuDeOpciones = new JLabel("Menu de opciones ");
		lblMenuDeOpciones.setBounds(74, 38, 111, 36);
		contentPane.add(lblMenuDeOpciones);
		
		JButton btnInsertarNodoadelante = new JButton("Insertar  nodoadelante");
		btnInsertarNodoadelante.setBounds(65, 95, 169, 23);
		contentPane.add(btnInsertarNodoadelante);
		
		JButton btnInsertarNodoAtras = new JButton("Insertar nodo atras");
		btnInsertarNodoAtras.setBounds(65, 129, 169, 23);
		contentPane.add(btnInsertarNodoAtras);
		
		JButton btnEliminarPrimerNodo = new JButton("Eliminar primer nodo");
		btnEliminarPrimerNodo.setBounds(65, 168, 169, 23);
		contentPane.add(btnEliminarPrimerNodo);
		
		JButton btnEliminarUltimoNodo = new JButton("Eliminar ultimo nodo");
		btnEliminarUltimoNodo.setBounds(65, 202, 169, 23);
		contentPane.add(btnEliminarUltimoNodo);
		
		JButton btnRecorridoHaciaDelante = new JButton("Recorrido hacia delante");
		btnRecorridoHaciaDelante.setBounds(65, 241, 169, 23);
		contentPane.add(btnRecorridoHaciaDelante);
		
		JButton btnRecorridoHaciaAtras = new JButton("Recorrido hacia atras");
		btnRecorridoHaciaAtras.setBounds(65, 288, 169, 23);
		contentPane.add(btnRecorridoHaciaAtras);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(70, 364, 89, 23);
		contentPane.add(btnLimpiar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(200, 364, 89, 23);
		contentPane.add(btnSalir);
		
		JLabel lblInserteIdDe = new JLabel("INSERTE ID DE LA CANCION ");
		lblInserteIdDe.setBounds(417, 38, 242, 14);
		contentPane.add(lblInserteIdDe);
		
		textField = new JTextField();
		textField.setBounds(385, 63, 274, 42);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblInserteElAlbun = new JLabel("INSERTE  EL ALBUN DE LA CANCION");
		lblInserteElAlbun.setBounds(417, 116, 242, 14);
		contentPane.add(lblInserteElAlbun);
		
		textField_1 = new JTextField();
		textField_1.setBounds(382, 141, 274, 35);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblInserteElNombre = new JLabel("INSERTE EL NOMBRE DEL ARTISTA");
		lblInserteElNombre.setBounds(418, 187, 225, 14);
		contentPane.add(lblInserteElNombre);
		
		textField_2 = new JTextField();
		textField_2.setBounds(385, 218, 274, 38);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblInserteElGenero = new JLabel("INSERTE  EL GENERO DE LA CANCION");
		lblInserteElGenero.setBounds(418, 267, 225, 14);
		contentPane.add(lblInserteElGenero);
		
		textField_3 = new JTextField();
		textField_3.setBounds(385, 292, 274, 36);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
	}
}
