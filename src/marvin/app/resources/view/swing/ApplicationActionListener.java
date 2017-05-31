package marvin.app.resources.view.swing;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Logger;

public class ApplicationActionListener implements ActionListener {
    
    private static final Logger LOG = Logger.getLogger(ActionListener.class.getName());
    
    private Container container;

    public ApplicationActionListener() {
    }

    public ApplicationActionListener(Container container) {
        this.container = container;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        e.setSource(container);
        LOG.info(e.getActionCommand());
    }
    
}
