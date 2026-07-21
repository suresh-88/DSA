import java.util.*;
class Student
{
	public static void main(String args[]){
		HashMap<Integer,Double> map = new HashMap<>();
		map.put(501,8.9);
		map.put(502,9.2);
		map.put(503,7.6);
		map.put(504,8.7);
		Set<Integer> x = map.keySet();
		for(Integer s:x)
			System.out.println(s+" "+map.get(s));
	}
}