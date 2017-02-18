package marvin.demo.view;

import com.marvin.bundle.framework.handler.Handler;
import com.marvin.bundle.swing.ApplicationAction;
import com.marvin.bundle.swing.resources.view.AbstractSwingView;
import java.awt.Container;
import java.util.HashMap;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Home extends AbstractSwingView {
    
    private final Handler handler;
    
    private JPanel panel;
    private JButton button;

    public Home(Handler handler) {
        this.handler = handler;
    }

    @Override
    protected void prepare(HashMap<String, ?> model, Container pane) {
        this.panel = new JPanel();
        Action coucou = new ApplicationAction("Coucou", "/test", this.handler, pane);
        this.button = new JButton(coucou);
        this.panel.add(this.button);
    }

    @Override
    protected void display(HashMap<String, ?> model, Container pane) {
        pane.removeAll();
        pane.add(this.panel);
        pane.repaint();
    }
}
