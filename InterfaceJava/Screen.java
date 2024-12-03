import javax.swing.*;

public class Screen extends JFrame{
    public Screen() {
        
        setTitle("Interface Java");
        setVisible(true);
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args){
        Screen tela = new Screen();
        tela.setVisible(true);
    }
}
