package marvin.app;

import com.marvin.bundle.addressbook.AddressBookBundle;
import com.marvin.bundle.addressbook.resources.view.swing.Persons;
import com.marvin.component.kernel.Kernel;
import com.marvin.bundle.debug.DebugBundle;
import com.marvin.bundle.framework.FrameworkBundle;
import com.marvin.bundle.game.GameBundle;
import com.marvin.bundle.swing.SwingBundle;
import com.marvin.component.kernel.bundle.Bundle;

public class AppKernel extends Kernel {

    public AppKernel(String environment, boolean debug) {
        super(environment, debug);
        
        this.logger.info(Persons.class.getName());
    }
    
    @Override
    protected Bundle[] registerBundles() {
        return new Bundle[]{
            
            // add framework bundle.
            new FrameworkBundle(),
            new DebugBundle(),
            
            new SwingBundle(),
            
            new AddressBookBundle(),
            new GameBundle(),
        };
    }
}
