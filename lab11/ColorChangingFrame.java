package lab11;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class ColorChangingFrame extends JFrame {

    public ColorChangingFrame() {
        setTitle("Kolorowy przycisk");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        ColorNameDisplayField field = new ColorNameDisplayField();
        ColorChangingButton button = new ColorChangingButton(field);

        add(button, BorderLayout.CENTER);
        add(field, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ColorChangingFrame frame = new ColorChangingFrame();
            frame.setVisible(true);
        });
    }
}
