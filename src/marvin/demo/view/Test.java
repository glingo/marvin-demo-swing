package marvin.demo.view;

import com.marvin.bundle.framework.handler.Handler;
import com.marvin.bundle.swing.resources.view.SwingView;
import java.awt.Color;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Test extends SwingView {

    private JLabel label;
    
    public Test(Handler handler) {
        super(handler);
    }

    @Override
    protected void prepare(HashMap<String, Object> model, JFrame frame) {
        this.label = new JLabel("Bonjour le monde");
    }

    @Override
    protected void display(HashMap<String, Object> model, JFrame frame) {
        frame.getContentPane().removeAll();
        background(Color.BLUE)
            .size(300, 300)
            .add(this.label);
        super.display(model, frame);
    }
}
