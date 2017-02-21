package marvin;

import com.marvin.bundle.swing.Application;
import com.marvin.component.kernel.Kernel;
import java.util.Arrays;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import marvin.app.AppKernel;

public class DemoApplication extends Application {
    
    private static final String ENV_PARAMETER_PREFIX = "-env=";

    protected DemoApplication(Kernel kernel) {
        super(kernel);
    }
    
    public static void main(String[] args) {
        String env = Arrays.stream(args)
                .filter(arg -> arg.startsWith(ENV_PARAMETER_PREFIX))
                .findFirst().orElse("-env=dev")
                .replace(ENV_PARAMETER_PREFIX, "");
        Application.launch(DemoApplication.class, new AppKernel(env, true));
    }
    
    @Override
    protected JMenuBar createMenu(JMenuBar menuBar) {
        JMenu menu              = new JMenu("Demo");
        JMenuItem home          = new JMenuItem(createAction("home_action", "/"));
        JMenuItem view          = new JMenuItem(createAction("view_action", "/demo/view"));
        JMenuItem model         = new JMenuItem(createAction("model_action", "/demo/model"));
        JMenuItem modelandview  = new JMenuItem(createAction("model_and_view_action", "/demo/modelandview"));
        JMenuItem modelmap      = new JMenuItem(createAction("model_as_map_action", "/demo/modelmap"));
        
        JMenuItem login          = new JMenuItem(createAction("login", "/login"));
        menuBar.add(login);

        menu.add(home);
        menu.add(view);
        menu.add(model);
        menu.add(modelandview);
        menu.add(modelmap);
        
        menuBar.add(menu);
        return menuBar;
    }
}
