import java.net.MalformedURLException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.microsoft.aad.adal4j.AuthenticationContext;
import com.microsoft.aad.adal4j.AuthenticationResult;
import com.microsoft.aad.adal4j.ClientCredential;

public class HelloWorld {
	
	public static void main(String ar[]) {
		testConnectivity();
	}

	private static void testConnectivity() {
		// TODO Auto-generated method stub
		String TENANT_ID = "d11a6097-dc0e-4ee6-897d-a7a5bdf5de59";
	    String AUTHORITY = "https://login.microsoftonline.com/" + TENANT_ID;
	    String CLIENT_ID = "86fad115-7fdb-439b-820a-9cade31f3dad";
	    String CLIENT_SECRET = "IEU8Q~zTLNYX869S_EGIY8bomGLpsOetBWqm0agG";
	    String RESOURCE = "https://storage.azure.com/.default";
	    String ACCESS_TOKEN = null;
	    ExecutorService service = Executors.newFixedThreadPool(1);
	    AuthenticationContext context = null;
	    try {
	        context = new AuthenticationContext(AUTHORITY, false, service);
	        ClientCredential credential = new ClientCredential(CLIENT_ID, CLIENT_SECRET);
	        Future<AuthenticationResult> future = context.acquireToken(RESOURCE, credential, null);
	        ACCESS_TOKEN = future.get().getAccessToken();
	        System.out.println("ACCESS_TOKEN"+ACCESS_TOKEN);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    } catch (ExecutionException e) {
	        e.printStackTrace();
	    } catch (MalformedURLException e) {
	        e.printStackTrace();
	    } finally {
	        service.shutdown();
	    }	
	}
}
