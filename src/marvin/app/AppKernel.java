package marvin.app;

import com.marvin.bundle.addressbook.AddressBookBundle;
import com.marvin.component.kernel.Kernel;
import com.marvin.component.kernel.bundle.Bundle;
import com.marvin.bundle.debug.DebugBundle;
import com.marvin.bundle.framework.FrameworkBundle;
import com.marvin.bundle.game.GameBundle;
import com.marvin.bundle.swing.SwingBundle;
import marvin.demo.DemoBundle;
import marvin.nn.NeuralNetworkBundle;
import marvin.test.TestBundle;

public class AppKernel extends Kernel {

    public AppKernel(String environment, boolean debug) {
        super(environment, debug);
    }
    
    @Override
    protected Bundle[] registerBundles() {
        return new Bundle[]{
            
            // add framework bundle.
            new FrameworkBundle(),
            new DebugBundle(),
            
            new SwingBundle(),
            
            new DemoBundle(),
            new AddressBookBundle(),
            new GameBundle(),
            new TestBundle(),
            new NeuralNetworkBundle(),
        };
    }
}
