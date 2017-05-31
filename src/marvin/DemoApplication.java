package marvin;

import com.marvin.bundle.swing.SwingApplication;
import com.marvin.component.kernel.Kernel;
import java.util.Arrays;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import marvin.app.AppKernel;

public class DemoApplication extends SwingApplication {
    
    private static final String ENV_PARAMETER_PREFIX = "-env=";

    protected DemoApplication(Kernel kernel) {
        super(kernel);
    }
    
    public static void main(String[] args) {
        String env = Arrays.stream(args)
                .filter(arg -> arg.startsWith(ENV_PARAMETER_PREFIX))
                .findFirst().orElse("-env=dev")
                .replace(ENV_PARAMETER_PREFIX, "");
        SwingApplication.launch(DemoApplication.class, new AppKernel(env, true));
    }
    
    @Override
    protected JMenuBar createMenu(JMenuBar menuBar) {
        menuBar.add(createUserMenu());
        menuBar.add(createDemoMenu());
        menuBar.add(createAddressBookMenu());
        menuBar.add(createGameMenu());
        return menuBar;
    }
    
    private JMenu createDemoMenu() {
        JMenu menu              = new JMenu("Demo");
        JMenuItem home          = new JMenuItem(createAction("home_action", "/"));
        JMenuItem view          = new JMenuItem(createAction("view_action", "/demo/view"));
        JMenuItem model         = new JMenuItem(createAction("model_action", "/demo/model"));
        JMenuItem modelandview  = new JMenuItem(createAction("model_and_view_action", "/demo/modelandview"));
        JMenuItem modelmap      = new JMenuItem(createAction("model_as_map_action", "/demo/modelmap"));
        
        menu.add(home);
        menu.add(view);
        menu.add(model);
        menu.add(modelandview);
        menu.add(modelmap);
        
        return menu;
    }
    
    private JMenu createUserMenu() {
        JMenu menu = new JMenu("User");
        JMenuItem login = new JMenuItem(createAction("login", "/login"));
        menu.add(login);
        
        return menu;
    }
    
    private JMenu createAddressBookMenu() {
        JMenu menu = new JMenu("Address book");
        
        JMenuItem addressBook = new JMenuItem(createAction("persons", "/addressbook/"));
        menu.add(addressBook);
        
        return menu;
    }
    
    private JMenu createGameMenu() {
        JMenu menu = new JMenu("Game");
        
        JMenuItem games = new JMenuItem(createAction("games", "/game/"));
        menu.add(games);
        
        return menu;
    }
}
