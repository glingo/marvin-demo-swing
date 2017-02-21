package marvin.app.controller;

import com.marvin.bundle.framework.mvc.ModelAndView;
import com.marvin.bundle.framework.mvc.controller.Controller;
import com.marvin.bundle.framework.mvc.model.Model;
import com.marvin.component.form.FormTypeInterface;
import com.marvin.component.form.support.TextType;
import java.util.logging.Level;
import java.util.logging.Logger;
import marvin.app.form.LoginForm;

public class DefaultController extends Controller {

    private static final Logger LOG = Logger.getLogger(DefaultController.class.getName());
    
    public String index() {
        LOG.info("DefaultController::index");
        return "home";
    }
    
    public String test() {
        LOG.info("DefaultController::test");
        return "test";
    }
    
    public ModelAndView login(Model model) {
        LOG.log(Level.INFO, "DefaultController::login {0}", model);
        
        FormTypeInterface form = (FormTypeInterface) model.get("form");
        
        if(null == form) {
            form = createFormBuilder("login", new LoginForm())
                .add("login", new TextType("username", ""))
                .add("password", new TextType("password", ""))
                .getForm();
            
            model.put("form", form);

            ModelAndView mav = new ModelAndView("login", model);
            return mav;
        }
        
        LoginForm data = (LoginForm) form.getData();
        if("Admin".equals(data.getLogin())) {
            return new ModelAndView("home", model);
        }
        
        return new ModelAndView("login", model);
    }
}
