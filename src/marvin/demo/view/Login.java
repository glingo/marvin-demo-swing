package marvin.demo.view;

import com.marvin.bundle.framework.handler.Handler;
import com.marvin.bundle.swing.action.ApplicationAction;
import com.marvin.bundle.swing.resources.view.FormView;
import java.util.HashMap;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends FormView {
    
    private JLabel passwordLabel;
    private JLabel usernameLabel;
    
    private JPasswordField passwordField;
    private JTextField usernameField;
    
    private JButton connect;
    private JButton cancel;
    
    public Login(Handler handler) {
        super(handler);
    }
    
    @Override
    protected void prepare(HashMap<String, ?> model, JFrame frame) throws Exception {
        super.prepare(model, frame);
        
        Action connectAction = new ApplicationAction("Se connecter", "/login", getHandler(), frame);
        Action cancelAction = new ApplicationAction("Anuler", "/", getHandler(), frame);
        this.connect = new JButton(connectAction);
        this.cancel = new JButton(cancelAction);
        
        this.getPanel().add(this.connect);
        this.getPanel().add(this.cancel);
    }

}
