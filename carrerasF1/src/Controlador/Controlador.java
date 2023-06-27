package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;

import vista.*;
import modelo.*;

public class Controlador implements ActionListener{

	Vista vista = new Vista();
	
	static ArrayList<Piloto> pilotos = new ArrayList<Piloto>();
	static DefaultListModel modelo = new DefaultListModel();
	static ArrayList<Piloto> pilotoselegidos = new ArrayList<Piloto>();
	
	public Controlador(Vista vista) {
		
		this.vista = vista;
		this.vista.btnañadir.addActionListener(this);
		this.vista.btncargarpilotos.addActionListener(this);
		this.vista.btnEliminar.addActionListener(this);
		this.vista.btnsimular.addActionListener(this);
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		if(e.getSource() == vista.btnañadir) {
			System.out.println("Boton añadir");
			boolean existe = true;
			
			String nombre = this.vista.textnombre.getText();
			String nacionalidad = this.vista.textnacionalidad.getText();
			String	edad = this.vista.textedad.getText();
			String dorsal = this.vista.textdorsal.getText();
			String habilidad = this.vista.texthabilidad.getText();
			
			Piloto piloto = new Piloto();
			piloto.setNombre(nombre);
			piloto.setNacionalidad(nacionalidad);
			piloto.setHabilidad(habilidad);
			piloto.setDorsal(dorsal);
			piloto.setEdad(edad);
			
			
			
			
			if(pilotos.isEmpty()) {
				modelo.addElement(nombre);
				pilotos.add(piloto);
			}else {
				//comprobamos si existe
				for(int i = 0; i < pilotos.size(); i++) {
					if(nombre.equalsIgnoreCase(pilotos.get(i).getNombre())) {
						existe = false;
					}
				}
				if(existe) {
					modelo.addElement(nombre);
					pilotos.add(piloto);
				}
				
				
			}
			
			vista.list.setModel(modelo);
			
			this.vista.textnombre.setText("");
			this.vista.textnacionalidad.setText("");
			this.vista.textedad.setText("");
			this.vista.textdorsal.setText("");
			this.vista.texthabilidad.setText("");
			
			if(pilotos.size() == 3) {
				this.vista.btncargarpilotos.setEnabled(true);;
			}
		}else if(e.getSource() == vista.btncargarpilotos){
			System.out.println("Boton cargar pilotos");
			ArrayList<Piloto> pilotoselegidos = new ArrayList<Piloto>();
			
			int njug = 0;
			Piloto pilotoelegido;
			System.out.println("Total de pilotos: "+pilotos.size());
			System.out.println("Lista de pilotos");
			for (int i = 0; i < pilotos.size(); i++) {
				System.out.println(pilotos.get(i));
			}
			//añadimos 3 pilotos aleatorio a la lista de elegidos
			for (int i = 0; i < 3; i++) {
				njug = (int)(Math.random()*pilotos.size());
				System.out.println(njug);
				pilotoelegido = pilotos.get(njug);
				pilotos.remove(njug);
				pilotoselegidos.add(pilotoelegido);
			}
			
			this.pilotoselegidos = pilotoselegidos;
			//actualizar la informacion de la intefaz
			vista.lblNombre1.setText(this.pilotoselegidos.get(0).getNombre());
			vista.lblNombre2.setText(this.pilotoselegidos.get(1).getNombre());
			vista.lblNombre3.setText(this.pilotoselegidos.get(2).getNombre());
			
			vista.lblimg1.setIcon(new ImageIcon(pilotoselegidos.get(0).getNombre()+".png"));
			vista.lblimg2.setIcon(new ImageIcon(pilotoselegidos.get(1).getNombre()+".png"));
			vista.lblimg3.setIcon(new ImageIcon(pilotoselegidos.get(2).getNombre()+".png"));
			
			this.pilotoselegidos = null;
			
			this.vista.btnsimular.setEnabled(true);
		}else if(e.getSource() == vista.btnEliminar) {
			System.out.println("Boton eliminar");
			
			for (int i = 0; i < pilotos.size(); i++) {
				if(pilotos.get(i).getNombre().equalsIgnoreCase((String)vista.list.getSelectedValue())) {
					pilotos.remove(i);
					modelo.remove(i);
				}
			}
			
			
		}else if(e.getSource() == vista.btnsimular) {
			System.out.println("Boton simular");
		}
		
	}
}
