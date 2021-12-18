package javalab2;

//public class MouseEvents {
//}
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

class App1 extends JFrame implements MouseListener {
    JFrame actualWindow;
    JLabel message;
    App1() {
        Font myFont = new Font("Verdana",Font.BOLD, 30);
        actualWindow = new JFrame("Mouse Tracking");
        message = new JLabel("Mouse Events");

        actualWindow.addMouseListener(this);

        message.setFont(myFont);
        message.setHorizontalAlignment(JLabel.CENTER);

        actualWindow.add(message);

        actualWindow.setSize(500, 500);
        actualWindow.setVisible(true);
    }
    @Override
    public void mouseClicked(MouseEvent arg0) {
        message.setText("Mouse Clicked");
    }
    @Override
    public void mouseEntered(MouseEvent arg0) {
        message.setText("Mouse Entered");
    }
    @Override
    public void mouseExited(MouseEvent arg0) {
        message.setText("Mouse Exited");
    }
    @Override
    public void mousePressed(MouseEvent arg0) {
        message.setText("Mouse Pressed");
    }
    @Override
    public void mouseReleased(MouseEvent arg0) {
        message.setText("Mouse Released");
    }
}
class MouseEventsExample {

    public static void main(String[] args) {
        new App1();
    }

}