import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class CalculadoraGUI {
	private JFrame frame;
	private JTextField textField;
	private JPanel panel;
	protected JButton btn9; 
	protected JButton btn8;
	protected JButton btn7;
	protected JButton btnDel;
	protected JButton btn4;
	protected JButton btn5;
	protected JButton btn6;
	protected JButton btn1;
	protected JButton btn2;
	protected JButton btn3;
	protected JButton btn0;
	protected JButton btnPunto;
	protected JButton btnIgual;
	protected JButton btnDiv;
	protected JButton btnMult;
	protected JButton btnRes;
	protected JButton btnSum;
	protected JButton btnAC;
	protected JButton btnParIzq;
	protected JButton btnParDer;
	private String texto;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraGUI window = new CalculadoraGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private void actionBotonIgual() {
			MouseListener oyenteRaton = new MouseListener() {
				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					texto = Resolvedor.resolver(texto);
					textField.setText(texto);
				}

				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
			};
			btnIgual.addMouseListener(oyenteRaton);
		
	}
	private void actionBotonAC() {
		MouseListener oyenteRaton = new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				texto = "";
				textField.setText(texto);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		};
		btnAC.addMouseListener(oyenteRaton);
	}
	private void actionBotonParDer() {
		MouseListener oyenteRaton = new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				texto += btnParDer.getText();
				textField.setText(texto);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		};
		btnParDer.addMouseListener(oyenteRaton);
	}
	private void actionBotonParIzq() {
		MouseListener oyenteRaton = new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				texto += btnParIzq.getText();
				textField.setText(texto);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		};
		btnParIzq.addMouseListener(oyenteRaton);
	}
	private void actionBotonPunto() {
		MouseListener oyenteRaton = new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				texto += btnPunto.getText();
				textField.setText(texto);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		};
		btnPunto.addMouseListener(oyenteRaton);
	}
	private void actionBotonDiv() {
		MouseListener oyenteRaton = new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				texto += btnDiv.getText();
				textField.setText(texto);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		};
		btnDiv.addMouseListener(oyenteRaton);
	}
	private void actionBotonMult() {
		MouseListener oyenteRaton = new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				texto += btnMult.getText();
				textField.setText(texto);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		};
		btnMult.addMouseListener(oyenteRaton);
	}
	private void actionBotonRes() {
		MouseListener oyenteRaton = new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				texto += btnRes.getText();
				textField.setText(texto);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		};
		btnRes.addMouseListener(oyenteRaton);
	}
	private void actionBotonSum() {
		MouseListener oyenteRaton = new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				texto += btnSum.getText();
				textField.setText(texto);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		};
		btnSum.addMouseListener(oyenteRaton);
	}
	private void actionBotonDel() {
		MouseListener oyenteRaton = new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				texto = texto.substring(0,texto.length()-1);
				textField.setText(texto);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		};
		btnDel.addMouseListener(oyenteRaton);
	}
	private void actionBoton0() {
		MouseListener oyenteRaton = new MouseListener() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				texto += btn0.getText();
				textField.setText(texto);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		};
		btn0.addMouseListener(oyenteRaton);
	}
	private void actionBoton6() {
		MouseListener oyenteRaton = new MouseListener() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				texto += btn6.getText();
				textField.setText(texto);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		};
		btn6.addMouseListener(oyenteRaton);
	}
	private void actionBoton1() {
		MouseListener oyenteRaton = new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				texto += btn1.getText();
				textField.setText(texto);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		};
		btn1.addMouseListener(oyenteRaton);
	}
	private void actionBoton2() {
		MouseListener oyenteRaton = new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				texto += btn2.getText();
				textField.setText(texto);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		};
		btn2.addMouseListener(oyenteRaton);
	}
	private void actionBoton3() {
		MouseListener oyenteRaton = new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				texto += btn3.getText();
				textField.setText(texto);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		};
		btn3.addMouseListener(oyenteRaton);
	}
	private void actionBoton4() {
		MouseListener oyenteRaton = new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				texto += btn4.getText();
				textField.setText(texto);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		};
		btn4.addMouseListener(oyenteRaton);
	}
	private void actionBoton5() {
		MouseListener oyenteRaton = new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				texto += btn5.getText();
				textField.setText(texto);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		};
		btn5.addMouseListener(oyenteRaton);
	}
	private void actionBoton7() {
		MouseListener oyenteRaton = new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				texto += btn7.getText();
				textField.setText(texto);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		};
		btn7.addMouseListener(oyenteRaton);
	}
	private void actionBoton8() {
		MouseListener oyenteRaton = new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				texto += btn8.getText();
				textField.setText(texto);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		};
		btn8.addMouseListener(oyenteRaton);
	}
	private void actionBoton9() {
		MouseListener oyenteRaton = new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				texto += btn9.getText();
				textField.setText(texto);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		};
		btn9.addMouseListener(oyenteRaton);
	}

	public CalculadoraGUI() {
		texto = "";
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 430, 403);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField.setBounds(20, 10, 382, 55);
		panel.add(textField);
		textField.setColumns(10);
		textField.setEditable(false);
		
		btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn7.setBounds(20, 85, 74, 67);
		panel.add(btn7);
		actionBoton7();
		
		btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn8.setBounds(94, 85, 74, 67);
		panel.add(btn8);
		actionBoton8();
		
		btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn9.setBounds(167, 85, 74, 67);
		panel.add(btn9);
		actionBoton9();
		
		btnDel = new JButton("Del");
		btnDel.setBackground(Color.ORANGE);
		btnDel.setForeground(Color.BLUE);
		btnDel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDel.setBounds(260, 85, 74, 67);
		panel.add(btnDel);
		actionBotonDel();
		
		btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn4.setBounds(20, 152, 74, 67);
		panel.add(btn4);
		actionBoton4();
		
		btn5 = new JButton("5");
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn5.setBounds(94, 152, 74, 67);
		panel.add(btn5);
		actionBoton5();
		
		btn6 = new JButton("6");
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn6.setBounds(167, 152, 74, 67);
		panel.add(btn6);
		actionBoton6();
		
		btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn1.setBounds(20, 219, 74, 67);
		panel.add(btn1);
		actionBoton1();
		
		btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn2.setBounds(94, 219, 74, 67);
		panel.add(btn2);
		actionBoton2();
		
		btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn3.setBounds(167, 219, 74, 67);
		panel.add(btn3);
		actionBoton3();
		
		btn0 = new JButton("0");
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn0.setBounds(20, 286, 74, 67);
		panel.add(btn0);
		actionBoton0();
		
		btnPunto = new JButton(".");
		btnPunto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnPunto.setBounds(260, 287, 74, 66);
		panel.add(btnPunto);
		actionBotonPunto();
		
		btnIgual = new JButton("=");
		btnIgual.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnIgual.setBounds(329, 286, 73, 67);
		panel.add(btnIgual);
		actionBotonIgual();
		
		btnDiv = new JButton("/");
		btnDiv.setForeground(Color.BLUE);
		btnDiv.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDiv.setBounds(329, 152, 74, 67);
		panel.add(btnDiv);
		actionBotonDiv();
		
		btnMult = new JButton("*");
		btnMult.setForeground(Color.BLUE);
		btnMult.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnMult.setBounds(260, 152, 74, 67);
		panel.add(btnMult);
		actionBotonMult();
		
		btnRes = new JButton("-");
		btnRes.setForeground(Color.BLUE);
		btnRes.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnRes.setBounds(329, 219, 74, 67);
		panel.add(btnRes);
		actionBotonRes();
		
		btnSum = new JButton("+");
		btnSum.setForeground(Color.BLUE);
		btnSum.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSum.setBounds(260, 219, 74, 67);
		panel.add(btnSum);
		actionBotonSum();
		
		btnAC = new JButton("AC");
		btnAC.setBackground(Color.ORANGE);
		btnAC.setForeground(Color.BLUE);
		btnAC.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnAC.setBounds(329, 85, 74, 67);
		panel.add(btnAC);
		actionBotonAC();
		
		btnParIzq = new JButton("(");
		btnParIzq.setForeground(Color.BLUE);
		btnParIzq.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnParIzq.setBounds(94, 285, 74, 69);
		panel.add(btnParIzq);
		actionBotonParIzq();
		
		btnParDer = new JButton(")");
		btnParDer.setForeground(Color.BLUE);
		btnParDer.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnParDer.setBounds(167, 286, 74, 67);
		panel.add(btnParDer);
		actionBotonParDer();
	}
	
}
