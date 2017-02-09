package marvin.app.controller;

import java.util.logging.Logger;

public class DefaultController {

    private static final Logger LOG = Logger.getLogger(DefaultController.class.getName());
    
    public String index() {
        LOG.info("DefaultController::index");
        return "home";
    }
    
    public String test() {
        LOG.info("DefaultController::test");
        return "test";
    }
}
