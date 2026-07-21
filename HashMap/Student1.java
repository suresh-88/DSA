import java.util.*;
class Student1
{
	public static void main(String args[]){
		HashMap<Integer,Double> map = new HashMap<>();
		map.put(501,8.9);
		map.put(502,9.2);
		map.put(503,7.6);
		map.put(504,8.7);
		for(Map.Entry<Integer,Double> e:map.entrySet()){
			Integer key = e.getKey();
			Double value = e.getValue();
			System.out.println(key+" "+value);;
		}
	}
}