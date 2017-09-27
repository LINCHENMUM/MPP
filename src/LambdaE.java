import java.util.stream.Stream;

import org.omg.PortableServer.ServantActivator;

public class LambdaE {
	public static void main(String[] args){
		execute(()->{});
		public void execute (Runnable r){
		r.run();
		}
	}

}
