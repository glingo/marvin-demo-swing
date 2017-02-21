package marvin.demo.view;

import com.marvin.bundle.framework.handler.Handler;
import com.marvin.bundle.swing.action.ApplicationAction;
import com.marvin.bundle.swing.resources.view.SwingView;
import java.awt.Container;
import java.util.HashMap;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Home extends SwingView {
    private JButton button;

    public Home(Handler handler) {
        super(handler);
    }

    @Override
    protected void prepare(HashMap<String, ?> model, JFrame frame) {
        Action coucou = new ApplicationAction("Coucou", "/test", getHandler(), frame);
        this.button = new JButton(coucou);
        this.getPanel().add(this.button);
    }

    @Override
    protected void display(HashMap<String, ?> model, JFrame frame) {
        frame.getContentPane().removeAll();
        super.display(model, frame);
    }
}
