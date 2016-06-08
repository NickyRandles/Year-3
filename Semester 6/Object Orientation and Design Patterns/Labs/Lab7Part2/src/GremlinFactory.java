import java.util.HashMap;


public class GremlinFactory {

	private static final HashMap<String, Gremlin> gremlinByName = new HashMap<String, Gremlin>();
	
	public static Gremlin getGremlin(String name){
		Gremlin gremlin = gremlinByName.get(name);
		
		if(gremlin == null){
			gremlin = new Gremlin(name);
			gremlinByName.put(name, gremlin);
		}
		
		return gremlin;
	}
}
