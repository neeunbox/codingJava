import java.awt.event.WindowListener;

public class Program {
    public static void main(String[] args) {
        GameFrame frame = new GameFrame();
        WindowListener listener = new GameWindowListner();
        frame.addWindowListener(listener);
        frame.setVisible(true);
    }
}
