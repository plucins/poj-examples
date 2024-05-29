package lab11;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;

public class ColorChangingButton extends JButton implements ActionListener {
    private Random random;
    private ColorNameDisplayField field;

    public ColorChangingButton(ColorNameDisplayField field) {
        setFont(new Font("Arial", Font.PLAIN, 24));
        setText("Kliknij tu");
        this.random = new Random();
        addActionListener(this);
        this.field = field;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Color newColor = new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256));
        setBackground(newColor);
        field.setColor(newColor);
    }
}
