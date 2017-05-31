package marvin.app.resources.view.swing;

import com.marvin.bundle.swing.resources.view.SwingView;
import com.marvin.bundle.framework.mvc.Handler;
import java.util.HashMap;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Home extends SwingView {
    private JButton button;

    public Home(String name) {
        super(name);
    }

    @Override
    protected void prepare(HashMap<String, Object> model, JFrame frame) {
        Action coucou = createAction("Coucou", "/test", frame);
        this.button = new JButton(coucou);
    }

    @Override
    protected void display(HashMap<String, Object> model, JFrame frame) {
        frame.getContentPane().removeAll();
        add(this.button);
        super.display(model, frame);
    }
}
