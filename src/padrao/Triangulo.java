package padrao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Mariane
 */
public class Triangulo extends JFrame
{
    JLabel titulo, label1, label2, label3, exibir;
    JTextField lado1, lado2, lado3;
    JButton verificar, limpar;
 
    public Triangulo()
    {
        super("Fórmula de Bhaskara");
        Container tela = getContentPane();
        setLayout(null);
        titulo = new JLabel ("Tipo de Triângulo");
        label1 = new JLabel ("Valor do lado 1:");
        label2 = new JLabel ("Valor do lado 2:");
        label3 = new JLabel ("Valor do lado 3:");
        lado1 = new JTextField (5);
        lado2 = new JTextField (5);
        lado3 = new JTextField (5);
        verificar = new JButton ("Verificar");
        limpar = new JButton ("Limpar");
        exibir = new JLabel ("");
        
        titulo.setBounds (65, 30, 300, 25);
        
        label1.setBounds (30, 90, 150, 20);
        lado1.setBounds (170, 90, 100, 20);
        
        label2.setBounds (30, 130, 150, 20);
        lado2.setBounds (170, 130, 100, 20);
        
        label3.setBounds (30, 170, 150, 20);
        lado3.setBounds (170, 170, 100, 20);
        
        verificar.setBounds (30, 215, 120, 25);
        limpar.setBounds (150, 215, 120, 25);
        
        exibir.setBounds (350, 150, 300, 20);
        
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        label1.setFont(new Font("Arial", Font.BOLD, 16));
        label2.setFont(new Font("Arial", Font.BOLD, 16));
        label3.setFont(new Font("Arial", Font.BOLD, 16));
        verificar.setFont(new Font("Arial", Font.BOLD, 16));
        limpar.setFont(new Font("Arial", Font.BOLD, 16));
        exibir.setFont(new Font("Arial", Font.BOLD, 18));
    
        verificar.addActionListener
        (
            new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    double t1, t2, t3;
                 
                    t1 = Double.parseDouble(lado1.getText());
                    t2 = Double.parseDouble(lado2.getText());
                    t3 = Double.parseDouble(lado3.getText());
                   
                    if (t1 == t2 && t2 == t3)
                    {  
                        exibir.setVisible(true);    
                        exibir.setText("Triângulo Equilátero");
                    }
                    
                    else if (t1 == t2 && t2 != t3 || t2 == t3 && t3 != t1 || t1 == t3 && t3 != t2)
                    {
                        exibir.setVisible(true);    
                        exibir.setText("Triângulo Isósceles");
                    
                    }
                  
                    else
                    {
                        exibir.setVisible(true);    
                        exibir.setText("Triângulo Escaleno");                   
                    }
                } 
            }
        );
        
        limpar.addActionListener
        (
            new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    lado1.setText(null);
                    lado2.setText(null);
                    lado3.setText(null);
                    exibir.setText(null);
                    lado1.requestFocus();  
                } 
            }
        );
        
        exibir.setVisible(false);
        
        tela.add(titulo);
        
        tela.add(label1);
        tela.add(lado1);
        
        tela.add(label2);
        tela.add(lado2);
        
        tela.add(label3);
        tela.add(lado3);
 
        tela.add(verificar);
        tela.add(limpar);
        
        tela.add(exibir);
        
        tela.setBackground(Color.yellow);
        setLocationRelativeTo(null);
        setResizable(false);
        setSize(600, 300);
        setVisible(true);
    }
}
