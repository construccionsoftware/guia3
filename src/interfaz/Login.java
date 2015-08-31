package interfaz;
import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPasswordField; 
import javax.swing.JOptionPane; 
import java.awt.Color; 
import java.awt.Font;   
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent; 
public class Login {          
	private JLabel label, label2;     
	private JTextField user;     
	private JPasswordField pass;     
	private JButton boton1;               
	public Login()     {             
		JFrame frame = new JFrame();             
		frame.getContentPane().setLayout(null);
		//JLabel label = new JLabel(); 
		//ImageIcon panel = new ImageIcon("img/logo1.jpg");
		//label.setIcon(panel);
		//frame.getContentPane().add(label);
		frame.setTitle("Consultorio ESTEBAN RIOS");
		//CREAR ETIQUETA Y CAMBIAR ATRIBUTOS   
		label=new JLabel("ID DE USUARIO");         
		label.setForeground(Color.DARK_GRAY);         
		label.setFont(new Font("Arial",Font.BOLD,12));         
		label.setBounds(20,10,150,30);        
		frame.getContentPane().add(label);         
		//CREAR CAMPO DE TEXTO Y COLOCAR EN POSICION         
		user=new JTextField(15);         
		user.setBounds(150,10,150,30);         
		frame.getContentPane().add(user);                  
		//CREAR ETIQUETA Y CAMBIAR ATRIBUTOS         
		label2=new JLabel("PASSWORD");         
		label2.setForeground(Color.darkGray);         
		label2.setFont(new Font("Arial",Font.BOLD,12));         
		label2.setBounds(20,60,150,30);         
		frame.getContentPane().add(label2);         
		//CREAR CAMPO DE TEXTO Y COLOCAR EN POSICION         
		pass=new JPasswordField(15);         
		pass.setBounds(150,60,150,30);        
		frame.getContentPane().add(pass);                       
		//CREAR BOTON Y CAMBIAR ATRIBUTOS         
		boton1  =  new JButton ("INGRESAR");                
		boton1.setForeground(Color.DARK_GRAY);         
		boton1.setFont(new Font("Arial",Font.BOLD,12));         
		boton1.setBounds(150,90,150,30);                
		//AQUI SE AGREGA EL EVENTO DEL BOTON DIRECTAMENTE         
		boton1.addActionListener(new ActionListener()         
		{             public void actionPerformed(ActionEvent evento)                 
		{                                   if( (user.getText().equals("erios") && pass.getText().equals("d123"))||(user.getText().equals("asistente") && pass.getText().equals("a123")))  
		{
			frame.dispose();  
			try {
				Interfaz i = new Interfaz();
				JFrame f = i.getFrame();
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
		else{                                                                                    
			if( !(user.getText().equals("erios"))||(user.getText().equals("asistente")) )                         
				JOptionPane.showMessageDialog(null,"USUARIO INCORRECTO");                    
			else                                
				if( !pass.getText().equals("d123")||pass.getText().equals("a123") )                         
					JOptionPane.showMessageDialog(null,"PASSWORD INCORRECTO");                     
			}                                           }                       });     
		
		
		 
		 
		frame.getContentPane().add(boton1);    
		frame.setSize(350,180);         
		frame.setLocation(200,200);         
		frame.setVisible(true);                         
		}     
	public static void main(String[] args) 
	{         
		
		new Login();     
	} 
	}
	



