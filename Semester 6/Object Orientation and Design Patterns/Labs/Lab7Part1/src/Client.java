
public class Client {
	
	public static void main(String [] args){
		WebServer realServer = new RealLocalServer();
		WebServer proxyServer = new ProxyLocalServer();
		
		realServer.getConnection();
		System.out.println();
		proxyServer.getConnection();

		
	}

}
