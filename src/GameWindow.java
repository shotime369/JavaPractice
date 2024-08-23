import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameWindow extends JFrame {

        public GameWindow(int width, int height) {
            setSize(width, height);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JPanel panel = new JPanel();
            setContentPane(panel);
            setVisible(true);
        }

        public static void main(String[] args) {
            int windowWidth = 800;
            int windowHeight = 600;

            GameWindow gameWindow = new GameWindow(windowWidth, windowHeight);
        }
    }

