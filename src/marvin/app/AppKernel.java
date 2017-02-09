package marvin.app;

import com.marvin.component.kernel.Kernel;
import com.marvin.component.kernel.bundle.Bundle;
import com.marvin.bundle.debug.DebugBundle;
import com.marvin.bundle.framework.FrameworkBundle;
import com.marvin.bundle.swing.SwingBundle;
import com.marvin.component.container.IContainer;
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
            new TestBundle(),
            new NeuralNetworkBundle(),
        };
    }
    
    public static void main(String[] args) {
        Kernel kernel = new AppKernel("dev", true);
        kernel.boot();
        
        IContainer container = kernel.getContainer();
        container.getClass();
    }
}
