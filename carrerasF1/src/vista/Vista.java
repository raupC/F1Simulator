package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JEditorPane;
import javax.swing.JProgressBar;
import javax.swing.JButton;

import Controlador.*;

public class Vista {

	private JFrame frame;
	public JTextField textnombre, textnacionalidad, textedad, textdorsal, texthabilidad;
	public JList list;
	public JButton btnañadir,btnEliminar, btncargarpilotos, btnsimular;
	public JLabel lblNombre1, lblNombre2,lblNombre3,lblimg1, lblimg2,lblimg3,lbldist1, lbldist2, lbldist3, lblcircuito,lblganador;
	public JProgressBar progressBar3, progressBar2, progressBar1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista window = new Vista();
					window.frame.setVisible(true);
					
					Controlador controlador = new Controlador(window);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Vista() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 1022, 761);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblnombre = new JLabel("Nombre:");
		lblnombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblnombre.setBounds(37, 48, 126, 25);
		frame.getContentPane().add(lblnombre);
		
		JLabel lblNacionalidad = new JLabel("Nacionalidad");
		lblNacionalidad.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNacionalidad.setBounds(37, 84, 126, 25);
		frame.getContentPane().add(lblNacionalidad);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEdad.setBounds(37, 122, 126, 25);
		frame.getContentPane().add(lblEdad);
		
		JLabel lblDorsal = new JLabel("Dorsal");
		lblDorsal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDorsal.setBounds(37, 158, 126, 25);
		frame.getContentPane().add(lblDorsal);
		
		JLabel lblHabilidad = new JLabel("Habilidad");
		lblHabilidad.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHabilidad.setBounds(37, 196, 126, 25);
		frame.getContentPane().add(lblHabilidad);
		
		textnombre = new JTextField();
		textnombre.setBounds(161, 51, 151, 26);
		frame.getContentPane().add(textnombre);
		textnombre.setColumns(10);
		
		textnacionalidad = new JTextField();
		textnacionalidad.setColumns(10);
		textnacionalidad.setBounds(161, 84, 151, 26);
		frame.getContentPane().add(textnacionalidad);
		
		textedad = new JTextField();
		textedad.setColumns(10);
		textedad.setBounds(161, 120, 151, 26);
		frame.getContentPane().add(textedad);
		
		textdorsal = new JTextField();
		textdorsal.setColumns(10);
		textdorsal.setBounds(161, 158, 151, 26);
		frame.getContentPane().add(textdorsal);
		
		texthabilidad = new JTextField();
		texthabilidad.setColumns(10);
		texthabilidad.setBounds(161, 199, 151, 26);
		frame.getContentPane().add(texthabilidad);
		
		JLabel lblPilotosInscritos = new JLabel("Pilotos inscritos");
		lblPilotosInscritos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPilotosInscritos.setBounds(693, 11, 246, 25);
		frame.getContentPane().add(lblPilotosInscritos);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(631, 48, 300, 192);
		frame.getContentPane().add(scrollPane);
		
		list = new JList();
		scrollPane.setViewportView(list);
		
		JPanel panel = new JPanel();
		panel.setBounds(161, 371, 191, 224);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		lblNombre1 = new JLabel("Nombre1");
		lblNombre1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNombre1.setBounds(37, 11, 126, 25);
		panel.add(lblNombre1);
		
		lblimg1 = new JLabel("");
		lblimg1.setBounds(10, 40, 171, 115);
		panel.add(lblimg1);
		
		progressBar1 = new JProgressBar();
		progressBar1.setBounds(20, 199, 146, 14);
		panel.add(progressBar1);
		
		lbldist1 = new JLabel("0");
		lbldist1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbldist1.setBounds(82, 166, 33, 25);
		panel.add(lbldist1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(385, 371, 191, 224);
		frame.getContentPane().add(panel_1);
		
		lblNombre2 = new JLabel("Nombre2");
		lblNombre2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNombre2.setBounds(41, 11, 126, 25);
		panel_1.add(lblNombre2);
		
		lblimg2 = new JLabel("");
		lblimg2.setBounds(10, 36, 171, 115);
		panel_1.add(lblimg2);
		
		progressBar2 = new JProgressBar();
		progressBar2.setBounds(21, 199, 146, 14);
		panel_1.add(progressBar2);
		
		lbldist2 = new JLabel("0");
		lbldist2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbldist2.setBounds(84, 162, 33, 25);
		panel_1.add(lbldist2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(604, 371, 191, 224);
		frame.getContentPane().add(panel_2);
		
		lblNombre3 = new JLabel("Nombre3");
		lblNombre3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNombre3.setBounds(36, 11, 126, 25);
		panel_2.add(lblNombre3);
		
		lblimg3 = new JLabel("");
		lblimg3.setBounds(10, 37, 171, 115);
		panel_2.add(lblimg3);
		
		progressBar3 = new JProgressBar();
		progressBar3.setBounds(16, 199, 146, 14);
		panel_2.add(progressBar3);
		
		lbldist3 = new JLabel("0");
		lbldist3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbldist3.setBounds(85, 163, 33, 25);
		panel_2.add(lbldist3);
		
		lblganador = new JLabel("GANADOR");
		lblganador.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblganador.setBounds(385, 648, 217, 31);
		frame.getContentPane().add(lblganador);
		
		btnañadir = new JButton("A\u00F1adir pilotos");
		btnañadir.setBounds(631, 279, 101, 31);
		frame.getContentPane().add(btnañadir);
		
		lblcircuito = new JLabel("");
		lblcircuito.setBounds(37, 244, 330, 111);
		frame.getContentPane().add(lblcircuito);
		
		btnEliminar = new JButton("Eliminar pilotos");
		btnEliminar.setBounds(754, 279, 126, 31);
		frame.getContentPane().add(btnEliminar);
		
		JLabel lblNewLabel_6 = new JLabel("Circuito efa moratalaz");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(404, 244, 145, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		btncargarpilotos = new JButton("Cargar pilotos");
		btncargarpilotos.setEnabled(false);
		btncargarpilotos.setBounds(428, 269, 148, 23);
		frame.getContentPane().add(btncargarpilotos);
		
		btnsimular = new JButton("Simular");
		btnsimular.setEnabled(false);
		btnsimular.setBounds(428, 304, 148, 23);
		frame.getContentPane().add(btnsimular);
	}
}
