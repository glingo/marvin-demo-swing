package marvin.demo.view;

import com.marvin.bundle.framework.handler.Handler;
import com.marvin.bundle.swing.ApplicationAction;
import com.marvin.bundle.swing.resources.view.AbstractSwingView;
import java.awt.Container;
import java.util.HashMap;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Home extends AbstractSwingView {
    
    private final Handler handler;
    
    private JMenuBar menuBar;
    private JPanel panel;
    private JButton button;

    public Home(Handler handler) {
        this.handler = handler;
    }
    
    private void createMenu() {
        this.menuBar = new JMenuBar();
        JMenu menu              = new JMenu("Demo");
        JMenuItem home          = new JMenuItem(new ApplicationAction("home_action", "/", this.handler));
        JMenuItem view          = new JMenuItem(new ApplicationAction("view_action", "/demo/view", this.handler));
        JMenuItem model         = new JMenuItem(new ApplicationAction("model_action", "/demo/model", this.handler));
        JMenuItem modelandview  = new JMenuItem(new ApplicationAction("model_and_view_action", "/demo/modelandview", this.handler));
        JMenuItem modelmap      = new JMenuItem(new ApplicationAction("model_as_map_action", "/demo/modelmap", this.handler));
        
        menu.add(home);
        menu.add(view);
        menu.add(model);
        menu.add(modelandview);
        menu.add(modelmap);
        this.menuBar.add(menu);
    }

    @Override
    protected void prepare() {
        Action coucou = new ApplicationAction("Coucou", "/test", this.handler);
        this.button = new JButton(coucou);
        this.panel = new JPanel();
        this.panel.add(this.button);
        
        createMenu();
    }

    @Override
    protected void display(HashMap<String, ?> model, Container pane) {
        pane.add(this.panel);
    }
}
