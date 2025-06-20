package code;
import java.util.LinkedHashMap;
public class LinkedHashMapEx {
	public static void main(String[] args) {
	
		LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
		
		lhm.put("one", "jack");
		lhm.put("two", "daniel");
		lhm.put("four", "steve");
		
		System.out.println(lhm);
		
		System.out.println("Getting value for key 'one': "+ lhm.get("one"));
		
		System.out.println("Size of the map: "+ lhm.size());
		
		System.out.println("Is map empty? "+ lhm.isEmpty());
	
		System.out.println("Contains key 'two'? "+ lhm.containsKey("two"));
		
		System.out.println("Contains value 'jack"+ "steve'? "+ lhm.containsValue("jack"+ ".steve"));
		
		System.out.println("delete element 'one': "+ lhm.remove("one"));
		
		System.out.println("Mappings of LinkedHashMap : "+ lhm);
		}

}
