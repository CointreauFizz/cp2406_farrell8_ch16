import javax.swing.*;
import java.awt.*;

public class Exer1_JFontSizesPanel extends JPanel {

    public static class JFontSizesPanel {
        String phrase = new String("There's no place like home");
        final int START = 6;
        final int STOP = 20;
        final int HORIZ_POS = 50;
        int vertPos;
        int i;
        final int INCREASE = 20;
        Font myFont;

        void paintComponent(Graphics g) {
            vertPos = 10;
            for (i = START; i <= STOP; ++i) {
                myFont = new Font("TimesRoman", Font.BOLD, i);
                g.setFont(myFont);
                g.drawString(phrase, HORIZ_POS, vertPos);
                vertPos += INCREASE;
            }
        }

        public static void main(String[] args) {
            JFrame frame = new JFrame();
            frame.add(new Exer1_JFontSizesPanel());
            frame.setSize(360, 340);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }

}