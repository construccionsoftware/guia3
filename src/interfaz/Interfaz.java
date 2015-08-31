package interfaz;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

import mundo.Paciente;
public class Interfaz   {

	private JFrame frame;
	JTextField jname, name, jedad, edad, jdate, date, jidpaciente
	,idpaciente,jdatecita,datecita,jtelefono,telefono,jhisto,japer,jafam;
	JButton registrar;
	JButton buscar;
	JTextArea histor,aper,afam;
	
	ArrayList<Paciente> bdPaciente = new ArrayList<Paciente>();
	Paciente p;
	
	public Interfaz() throws IOException
	{
		
	     
		
		Paciente pbd = new Paciente("Jorge Otavo","28", "07/08/1987", "234567","30/09/2015",
				"123","Hipertiroidismo","Alergia polvo","Hipotiroidismo");
		bdPaciente.add(pbd);
		Paciente pbd1 = new Paciente("Pedro Perez","35", "07/08/1965", "123456","30/05/2015",
				"123","Examenes de tension normales control 1","Hipertension","Hipertension");
		bdPaciente.add(pbd1);
		Paciente pbd3 = new Paciente("Ana Martinez","23", "07/08/1990", "345678","04/07/2015",
				"123","Examenes de tension normales control 1","Migra;a","Hipertension");
		bdPaciente.add(pbd3);
		    String path = "https://dl.dropboxusercontent.com/u/5120457/Picture1.jpg";
		    URL url = new URL(path);
	        BufferedImage image = ImageIO.read(url);
	        JLabel label = new JLabel(new ImageIcon(image));
	        JFrame f = new JFrame();
	        f.getContentPane().setLayout(null);
	        f.getContentPane().setLayout(new FlowLayout());
	        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        f.getContentPane().add(label);
	        jname = new JTextField("Nombre", 15);
			jedad = new JTextField("Edad", 15);
			jdate = new JTextField("Fecha de Nacimiento", 15);
			jidpaciente = new JTextField("Identificacion", 15);
			jdatecita = new JTextField("Fecha de la cita", 15);
			jtelefono = new JTextField("Telefono", 15);
			jhisto = new JTextField("Historial", 15);
			japer = new JTextField("Antecedentes Personales", 15);
			jafam = new JTextField("Antecedentes Familiares", 15);
			
			//Jtext atributos
			name = new JTextField(20);
			edad = new JTextField(20);
			date = new JTextField(20);
			idpaciente = new JTextField(20);
			datecita = new JTextField(20);
			telefono = new JTextField(20);
			
			//Atributo de los labels
			jname.setEditable(false);
			jedad.setEditable(false);
			jdate.setEditable(false);
			jidpaciente.setEditable(false);
			jdatecita.setEditable(false);
			jtelefono.setEditable(false);
			jhisto.setEditable(false);
			japer.setEditable(false);
			jafam.setEditable(false);
			
			//Text Area
			 histor = new JTextArea(5,20);
			JScrollPane scrollPane1 = new JScrollPane(histor); 
	        
			aper = new JTextArea(5,20);
			JScrollPane scrollPane2 = new JScrollPane(aper); 
			
			afam = new JTextArea(5,20);
			JScrollPane scrollPane3 = new JScrollPane(afam); 
			//Boton de registrar
			registrar = new JButton("Registrar");
			//Add Contenedor
			f.getContentPane().add(jname);
			f.getContentPane().add(name);
			f.getContentPane().add(jedad);
			f.getContentPane().add(edad);
			f.getContentPane().add(jdate);
			f.getContentPane().add(date);
			f.getContentPane().add(jidpaciente);
			f.getContentPane().add(idpaciente);
			f.getContentPane().add(jdatecita);
			f.getContentPane().add(datecita);
			f.getContentPane().add(jhisto);
			f.getContentPane().add(scrollPane1);
			f.getContentPane().add(japer);
			f.getContentPane().add(scrollPane2);
			f.getContentPane().add(jafam);
			f.getContentPane().add(scrollPane3);
			f.getContentPane().add(registrar);
	        f.pack();
	        f.setBounds(50,50,500,900);
			f.setVisible(true);
			f.setResizable(false);
			idpaciente.addFocusListener(new FocusListener(){

			    @Override
			    public void focusGained(FocusEvent e) {
			    	 Paciente p1;
					
					  for (int i = 0; i <bdPaciente.size(); i++) {
						  
				           p1=bdPaciente.get(i);
				           String text="";
						  if(p1.getIdpaciente().equals(idpaciente.getText()))
						  {
							  name.setText(p1.getNombre());
							  edad.setText(p1.getEdad());
							  date.setText(p1.getDate());
							  datecita.setText(p1.getDateCita());
							  telefono.setText(p1.getTelefono());
							  text+="\n-----------------------------------------------\n";
							  text+=p1.getHistorial();
							  text+="\n-----------------------------------------------\n";
							  histor.setText(text);
							  text="";
							  text+="\n-----------------------------------------------\n";
							  text+=p1.getApersonal();
							  text+="\n-----------------------------------------------\n";
							  aper.setText(text);
							  text="";
							  text+="\n-----------------------------------------------\n";
							  text+=p1.getAfamiliar();
							  text+="\n-----------------------------------------------\n";
							  afam.setText(text);
							  text="";
						  }
				        }
			       
			    }

			    @Override
			    public void focusLost(FocusEvent e) {                
			    }

			});
			
			registrar.addActionListener(new ActionListener() {  
				  public void actionPerformed(ActionEvent event ) {  
					    p = new Paciente();
						p.setNombre(name.getText());
						p.setEdad(edad.getText());
						p.setDate(date.getText().toString());
						p.setIdpaciente(idpaciente.getText());
						p.setDateCita(datecita.getText());
						p.setTelefono(telefono.getText());
						p.setHistorial(histor.getText());
						p.setApersonal(aper.getText());
						p.setAfamiliar(afam.getText());
						bdPaciente.add(p);
						JOptionPane.showMessageDialog(null,p.getNombre()+"  !!!  A quedado Registrado !!!!");
						name.setText("");
						edad.setText("");
						date.setText("");
						idpaciente.setText("");
						datecita.setText("");
						telefono.setText("");
						histor.setText("");
						aper.setText("");
						afam.setText("");
				   
				  }  
				}); 
	}
	
	
	    

	public JFrame getFrame(){
		return this.frame;
	}
}
