package marvin.demo.view;

import com.marvin.bundle.framework.handler.Handler;
import com.marvin.bundle.swing.resources.view.SwingView;
import java.awt.Color;
import java.awt.Container;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Test extends SwingView {

    public Test(Handler handler) {
        super(handler);
    }

    @Override
    protected void prepare(HashMap<String, ?> model, JFrame frame) {
        this.getPanel().add(new JLabel("Bonjour le monde"));
        this.getPanel().setBackground(Color.BLUE);
//        pane.setBackground(Color.red);
//        pane.setSize(300, 300);
    }

    @Override
    protected void display(HashMap<String, ?> model, JFrame frame) {
        frame.getContentPane().removeAll();
        super.display(model, frame);
    }
}
