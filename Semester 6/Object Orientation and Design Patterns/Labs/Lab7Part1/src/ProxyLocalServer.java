
public class ProxyLocalServer implements WebServer{

	public void getConnection() {
			System.out.println("You are attempting to connect to the web but have connected instead to a Proxy.");
			RealLocalServer real = new RealLocalServer();
			real.getConnection();
	}

}
