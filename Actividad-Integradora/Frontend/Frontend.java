package Frontend;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frontend extends JFrame {
 
    JLabel lblsimulador = new JLabel("SIMULADOR LANZAR MONEDA");
    JButton btnMoneda = new JButton(" ¡LANZAR! ");
    JLabel lblfrecuenciaCara = new JLabel("CARA: 0 ");
    JLabel lblfrecuenciaCruz = new JLabel("CRUZ: 0 ");

    public Frontend(){

        super("Simular lanzar Moneda");
        CreacionVentana();

    } // fin-constructor

    void CreacionVentana(){

        this.setLayout(null);
        this.setSize(400,400);
        lblsimulador.setBounds(100, 30, 200, 30);
        lblfrecuenciaCara.setBounds(30 , 280, 60, 30);
        lblfrecuenciaCruz.setBounds(220 , 280, 60, 30);
        btnMoneda.setBounds(140, 140, 100, 50);

        

        add(lblsimulador);
        add(lblfrecuenciaCara);
        add(lblfrecuenciaCruz);
        add(btnMoneda);

    } // fin-creacionVentana

    public static void main(String[] args) {
        
        Frontend ventana = new Frontend();

        ventana.setSize(400,400);
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ventana.setVisible(true);

    } // fin-main

}
