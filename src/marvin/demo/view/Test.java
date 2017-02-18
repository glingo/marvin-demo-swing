package marvin.demo.view;

import com.marvin.bundle.framework.handler.Handler;
import com.marvin.bundle.swing.resources.view.AbstractSwingView;
import java.awt.Color;
import java.awt.Container;
import java.util.HashMap;
import javax.swing.JLabel;

public class Test extends AbstractSwingView {

    private final Handler handler;

    public Test(Handler handler) {
        this.handler = handler;
    }

    @Override
    protected void prepare(HashMap<String, ?> model, Container pane) {
        
    }
    
    @Override
    protected void display(HashMap<String, ?> model, Container pane) {
        pane.removeAll();
        pane.add(new JLabel("Bonjour le monde"));
        pane.repaint();
//        pane.setBackground(Color.red);
//        pane.setSize(300, 300);
    }
}
