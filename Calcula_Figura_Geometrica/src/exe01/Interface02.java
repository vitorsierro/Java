package exe01;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class Interface02 {
	
	private JFrame frame;
	private JTextField tfBase;
	private JTextField tfAltura;
	private JTextField tfLado;
	private JTextField tfRaio;
	private JTextField tfResult;
	private JTextField tfResultados;
	private final ButtonGroup bgFormulasGeometrica = new ButtonGroup();

	/**
	 * Launch the application.
     * @param args
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
                        @Override
			public void run() {
				try {
					Interface02 window = new Interface02();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interface02() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 567, 434);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Metodos01 met = new Metodos01(); 
	
		JLabel lblCalculadorDeArea = new JLabel("CALCULADOR DE \u00C0REA");
		lblCalculadorDeArea.setBounds(141, 11, 292, 39);
		lblCalculadorDeArea.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 20));
		frame.getContentPane().add(lblCalculadorDeArea);
		
		//BASE
		
		JLabel lblBase = new JLabel("Base");
		lblBase.setBounds(78, 62, 83, 23);
		lblBase.setFont(new Font("Tahoma", Font.PLAIN, 16));
		frame.getContentPane().add(lblBase);
		
		
		
		JLabel lblPoBase = new JLabel("Preencimento obrigatorio");
		lblPoBase.setBounds(386, 68, 154, 14);
		frame.getContentPane().add(lblPoBase);
		
		tfBase = new JTextField();
		tfBase.addKeyListener(new KeyAdapter(){
                        @Override
			public void keyTyped(KeyEvent evt) {
				char c = evt.getKeyChar();
					if (tfBase.getText().isEmpty()== true){
						if (Character.isLetter(c)) {		
								evt.consume();
								lblPoBase.setVisible(true);
								
						}
					} else {
						lblPoBase.setVisible(false);
						tfLado.setEditable(false);
						tfRaio.setEditable(false);
											
					   }
				
				}
			});
		tfBase.setBounds(197, 65, 179, 20);
		frame.getContentPane().add(tfBase);
		tfBase.setColumns(10);
		
		//Altura
		
		tfAltura = new JTextField();
		tfAltura.setBounds(197, 107, 179, 20);
		frame.getContentPane().add(tfAltura);
		tfAltura.setColumns(10);
		
		
		JLabel lblAltura = new JLabel("Altura");
		lblAltura.setBounds(78, 107, 63, 20);
		lblAltura.setFont(new Font("Tahoma", Font.PLAIN, 16));
		frame.getContentPane().add(lblAltura);
		
		
		JLabel lblPoAlt = new JLabel("Preencimento obrigatorio");
		lblPoAlt.setBounds(386, 110, 154, 14);
		frame.getContentPane().add(lblPoAlt);
		tfAltura.addKeyListener(new KeyAdapter(){
                                @Override
				public void keyTyped(KeyEvent evt) {
				char c = evt.getKeyChar();
					if (tfAltura.getText().isEmpty() == true){
						if (Character.isLetter(c)) {
								evt.consume();
								lblPoAlt.setVisible(true);
								
						}
					} else {
						lblPoAlt.setVisible(false);
						tfLado.setEditable(false);
						tfRaio.setEditable(false);
							}
				}
		});
		
		//Lado
		
		JLabel lblLado = new JLabel("Lado");
		lblLado.setBounds(78, 147, 63, 20);
		lblLado.setFont(new Font("Tahoma", Font.PLAIN, 16));
		frame.getContentPane().add(lblLado);
		
		tfLado = new JTextField();
		tfLado.setBounds(197, 149, 179, 20);
		frame.getContentPane().add(tfLado);
		tfLado.setColumns(10);
		
		
		JLabel lblPoLado = new JLabel("Preencimento obrigatorio");
		lblPoLado.setBounds(386, 152, 154, 14);
		frame.getContentPane().add(lblPoLado);
		
		tfLado.addKeyListener(new KeyAdapter(){
                        @Override
			public void keyTyped(KeyEvent evt) {
			char c = evt.getKeyChar();
				if (tfLado.getText().isEmpty() == true){
					if (Character.isLetter(c)) {
							evt.consume();
							lblPoLado.setVisible(true);
							
					}
				} else {
					lblPoLado.setVisible(false);
					tfBase.setEditable(false);
					tfAltura.setEditable(false);
					tfRaio.setEditable(false);
						}
			}
	});
		
		//Raio
		
		
		JLabel lblRaio = new JLabel("Raio");
		lblRaio.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblRaio.setBounds(78, 191, 46, 14);
		frame.getContentPane().add(lblRaio);
		
		tfRaio = new JTextField();
		tfRaio.setBounds(197, 190, 179, 20);
		frame.getContentPane().add(tfRaio);
		tfRaio.setColumns(10);
		
		JLabel lblPoRaio = new JLabel("Preencimento obrigatorio");
		lblPoRaio.setEnabled(true);
		lblPoRaio.setBounds(386, 193, 154, 14);
		frame.getContentPane().add(lblPoRaio);
		
		tfRaio.addKeyListener(new KeyAdapter(){
                        @Override
			public void keyTyped(KeyEvent evt) {
			char c = evt.getKeyChar();
				if (tfRaio.getText().isEmpty() == true){
					if (Character.isLetter(c)) {
							evt.consume();
							lblPoRaio.setVisible(true);
							
					}
				} else {
					lblPoRaio.setVisible(false);
					tfBase.setEditable(false);
					tfAltura.setEditable(false);
					tfLado.setEditable(false);
						}
			}
		});

		tfResultados = new JTextField();
		tfResultados.setEditable(false);
		tfResultados.setBounds(197, 238, 179, 31);
		frame.getContentPane().add(tfResultados);
		tfResultados.setColumns(10);
		
		JLabel lblResultados = new JLabel("Resultados");
		lblResultados.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblResultados.setBounds(74, 235, 109, 31);
		frame.getContentPane().add(lblResultados);
		
		//RB TRIANGULO
		
		JRadioButton rdbtnTriangulo = new JRadioButton("Triangulo");

		bgFormulasGeometrica.add(rdbtnTriangulo);
		rdbtnTriangulo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnTriangulo.setBounds(78, 297, 105, 23);
		frame.getContentPane().add(rdbtnTriangulo);
		
		rdbtnTriangulo.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	lblPoBase.setVisible(true);
	        	lblPoAlt.setVisible(true);
	        	tfBase.setEditable(true);	        	
	        	tfAltura.setEditable(true);
	        	
	        	lblPoLado.setVisible(false);
	        	lblPoRaio.setVisible(false);
				tfLado.setEditable(false);
				tfRaio.setEditable(false);
	        }
	    });
		
		//RB RETANGULO
		
		JRadioButton rdbtnRetangulo = new JRadioButton("Retangulo");

		bgFormulasGeometrica.add(rdbtnRetangulo);
		rdbtnRetangulo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnRetangulo.setBounds(182, 297, 92, 23);
		frame.getContentPane().add(rdbtnRetangulo);
		
		rdbtnRetangulo.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	lblPoBase.setVisible(true);
	        	lblPoAlt.setVisible(true);
	        	tfBase.setEditable(true);	        	
	        	tfAltura.setEditable(true);
	        	
	        	lblPoRaio.setVisible(false);
	        	lblPoLado.setVisible(false);
				tfLado.setEditable(false);
				tfRaio.setEditable(false);
	        }
	    });
		
		
		//RB QUADRADO
		
		JRadioButton rdbtnQuadrado = new JRadioButton("Quadrado");
		bgFormulasGeometrica.add(rdbtnQuadrado);
		rdbtnQuadrado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnQuadrado.setBounds(276, 297, 100, 23);
		frame.getContentPane().add(rdbtnQuadrado);
		
		rdbtnQuadrado.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	lblPoLado.setVisible(true);
	        	tfLado.setEditable(true);
	        	
	        	lblPoBase.setVisible(false);
	        	lblPoAlt.setVisible(false);
	        	lblPoRaio.setVisible(false);
				tfBase.setEditable(false);
				tfAltura.setEditable(false);
				tfRaio.setEditable(false);
	        }
	    });
		
		
		//RB CIRCULO
		
		JRadioButton rdbtnCirculo = new JRadioButton("Circulo");

		bgFormulasGeometrica.add(rdbtnCirculo);
		rdbtnCirculo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnCirculo.setBounds(383, 297, 75, 23);
		frame.getContentPane().add(rdbtnCirculo);
		
		rdbtnCirculo.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	lblPoRaio.setVisible(true);
	        	tfRaio.setEditable(true);
	        	
	        	lblPoBase.setVisible(false);
	        	lblPoAlt.setVisible(false);
	        	lblPoLado.setVisible(false);
				tfBase.setEditable(false);
				tfAltura.setEditable(false);
				tfLado.setEditable(false);
	        }
	    });
			
		
		
		//Button
		JButton btnResultados = new JButton("Resultado");
		btnResultados.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		btnResultados.setEnabled(true);
		btnResultados.setBounds(78, 361, 380, 23);
		btnResultados.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
                            if(rdbtnTriangulo.isSelected()){
                                 met.setBase(Double.parseDouble(tfBase.getText()));
                                 met.setAltura(Double.parseDouble(tfAltura.getText()));
                                 tfResultados.setText(String.valueOf(met.Triangulo()));
                            }
                            if((rdbtnQuadrado.isSelected())){
                                met.setLado(Double.parseDouble(tfLado.getText()));
				tfResultados.setText(String.valueOf(met.Quadrado()));
                            }
                             if(rdbtnRetangulo.isSelected()){
                                met.setBase(Double.parseDouble(tfBase.getText()));
                                met.setAltura(Double.parseDouble(tfAltura.getText()));
                                tfResultados.setText(String.valueOf(met.Retangulo()));
                             }
                             if(rdbtnCirculo.isSelected()){
                             }
                             		met.setRaio(Double.parseDouble(tfRaio.getText()));
                        		tfResultados.setText(String.valueOf(met.Circulo()));
		
                             }
                            
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnResultados);
                

		JButton btnNewButton = new JButton("Limpar Campo De Texto");
		btnNewButton.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				tfBase.setText("");
				tfAltura.setText("");
				tfLado.setText("");
				tfRaio.setText("");
				tfResultados.setText("");
				tfBase.setEditable(true);
				tfAltura.setEditable(true);
				tfLado.setEditable(true);
				tfRaio.setEditable(true);
				lblPoBase.setVisible(true);
				lblPoAlt.setVisible(true);
				lblPoLado.setVisible(true);
				lblPoRaio.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		btnNewButton.setBounds(78, 327, 380, 23);
		frame.getContentPane().add(btnNewButton);
		
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
