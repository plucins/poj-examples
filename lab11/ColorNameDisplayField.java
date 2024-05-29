package lab11;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JTextField;

public class ColorNameDisplayField extends JTextField {

    public ColorNameDisplayField() {
        setFont(new Font("Arial", Font.PLAIN, 24));
        setEditable(false);
    }

    public void setColor(Color color){
        setText("Kolor " + colorToHex(color));
    }

    private String colorToHex(Color color) {
        return String.format("#%02x%02x%02x", color.getRed(), color.getGreen(), color.getBlue());
    }
}
