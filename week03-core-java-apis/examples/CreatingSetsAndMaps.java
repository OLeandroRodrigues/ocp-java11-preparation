
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class CreatingSetsAndMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*#Introducing Sets*/
		/*A Set is a collection of objects that cannot contain duplicates. If you try to add a duplicate
		to a set, the API will not fulfill the request.*/
		
		Set<Integer> set = new HashSet<>();
		System.out.println(set.add(66)); // true
		System.out.println(set.add(66)); // false
		System.out.println(set.size()); // 1
		set.remove(66);
		System.out.println(set.isEmpty()); // true
		
		/*#Introducing Maps*/
		//The most common implementation of Map is HashMap.
		
		/*Table 5.7 									Common Map methods
		Method 										Description
		V get(Object key) 							Returns the value mapped by key or null if none is mapped
		V getOrDeafult(Object key, V other) 		Returns the value mapped by key or other if none is mapped
		V put(K key, V value) 						Adds or replaces key/value pair. Returns previous value or null
		V remove(Object key) 						Removes and returns value mapped to key. Returns null if none
		boolean containsKey(Object key) 			Returns whether key is in map
		boolean containsValue(Object key) 			Returns whether value is in map
		Set<K> keySet() 							Returns set of all keys
		Collection<V> values() 						Returns Collection of all values*/
		
		Map<String, String> map = new HashMap<>();
		map.put("koala", "bamboo");
		String food = map.get("koala"); // bamboo
		String other = map.getOrDefault("ant", "leaf"); // leaf
		for (String key: map.keySet())
			System.out.println(key + " " + map.get(key)); // koala bamboo
		
		/*#Calculating with Math APIs*/
		/*Pay special attention to return types in math questions. They are an excellent opportunity
		for trickery!*/
		
		//min() and max()
		/*The min() and max() methods compare two values and return one of them.
			The method signatures for min() are as follows:
				double min(double a, double b)
				float min(float a, float b)*/
		int first = Math.max(3, 7); // 7
		int second = Math.min(7, -9); // -9
		
		///round()
		/*The round() method gets rid of the decimal portion of the value, choosing the next higher
		number if appropriate. If the fractional part is .5 or higher, we round up.
			The method signatures for round() are as follows:
				long round(double num)
				int round(float num)*/
		long low = Math.round(123.45); // 123
		long high = Math.round(123.50); // 124
		int fromFloat = Math.round(123.45f); // 123
		
		//pow()
		//The pow() method handles exponents
		/* 	The method signature is as follows:
		 		double pow(double number, double exponent)*/
		double squared = Math.pow(5, 2); // 25.0
		
		//random()
		//The random() method returns a value greater than or equal to 0 and less than 1.
			/*The method signature is as follows:
				double random()*/
		double num = Math.random();
	}

}
