package br.senai.sp.jandira.ui;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela {
	
	public void criarTela() {
		
		JFrame telaImc = new JFrame();
		telaImc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaImc.setSize(600, 800);
		telaImc.setTitle("Calculadora IMC");
		telaImc.setLayout(null);
		
		
		//criar label
		JLabel lblIdade = new JLabel();
		lblIdade.setText("Qual a sua idade?");
		lblIdade.setBounds(20, 20, 110, 30);
	
		//ciar um text field
		JTextField txtIdade = new JTextField();
		txtIdade.setText(null);
		txtIdade.setBounds(130, 20, 50, 30);
		
		//criar um botao
		JButton btnverificar = new JButton();
		btnverificar.setText("Verificar idade");
		btnverificar.setBounds(10, 70, 130, 30);
		
		//
		JLabel lblresultado = new JLabel();
		lblresultado.setText("Você é menor de idade!");
		lblresultado.setBounds(20, 110, 177, 30);
		
		
		//colocar o label na tela
		telaImc.getContentPane().add(lblIdade);
		telaImc.getContentPane().add(btnverificar);
		telaImc.getContentPane().add(txtIdade);
		telaImc.getContentPane().add(lblresultado);
		
		
		
		
		
		
		telaImc.setVisible(true);		
		
		//definir ouvinte de clique do mouse
		txtIdade.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("Soltou!");
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("Apertou!");
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("Saiu!");
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("Entrou!");
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		
	}
	
} 