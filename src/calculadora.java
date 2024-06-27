import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Math;

public class calculadora extends JFrame {
    private JTextField numero1;
    private JTextField numero2;
    private JTextField resultado;
    public calculadora(){
        setTitle("Calculadoras ESFOT");
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7, 2));

        numero1= new JTextField();
        numero2= new JTextField();
        resultado= new JTextField();
        resultado.setEditable(false);

        JButton botonsuma = new JButton("+");
        JButton botonresta = new JButton("-");
        JButton botonmultiplicacion = new JButton("x");
        JButton botondividir = new JButton("/");
        JButton botonseno = new JButton("sen");
        JButton botoncoseno = new JButton("cos");
        JButton botonraiz = new JButton("√");
        JButton botonlimpiar = new JButton("Limpiar");

        botonsuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(numero1.getText());
                int num2 = Integer.parseInt(numero2.getText());
                int total = num1 + num2;

                resultado.setText(Integer.toString(total));

            }
        });

        botonresta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(numero1.getText());
                int num2 = Integer.parseInt(numero2.getText());
                int total = num1 - num2;

                resultado.setText(Integer.toString(total));

            }
        });

        botonmultiplicacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(numero1.getText());
                int num2 = Integer.parseInt(numero2.getText());
                int total = num1 * num2;

                resultado.setText(Integer.toString(total));

            }
        });

        botondividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(numero1.getText());
                int num2 = Integer.parseInt(numero2.getText());
                double total = (double) num1 / num2;

                resultado.setText(String.format("%.2f", total));
            }
        });

        botonseno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(numero1.getText());
                int num2 = Integer.parseInt(numero2.getText());
                double total = Math.sin(Math.toRadians(num1 + num2));

                resultado.setText(Double.toString(total));
            }
        });

        botoncoseno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(numero1.getText());
                int num2 = Integer.parseInt(numero2.getText());
                double total = Math.cos(Math.toRadians(num1 + num2));

                resultado.setText(Double.toString(total));
            }
        });

        botonraiz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(numero1.getText());
                int num2 = Integer.parseInt(numero2.getText());
                double total = Math.sqrt(num1 + num2);

                resultado.setText(Double.toString(total));
            }
        });

        botonlimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero1.setText("");
                numero2.setText("");
                resultado.setText("");
            }
        });

        panel.add(new JLabel("Numero 1"));
        panel.add(numero1);
        panel.add(new JLabel("Numero 2"));
        panel.add(numero2);
        panel.add(new JLabel("Resultado"));
        panel.add(resultado);
        panel.add(botonsuma);
        panel.add(botonresta);
        panel.add(botonmultiplicacion);
        panel.add(botondividir);
        panel.add(botonseno);
        panel.add(botoncoseno);
        panel.add(botonraiz);
        panel.add(botonlimpiar);
        add(panel);
        setVisible(true);
    }
}
