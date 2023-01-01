package org.research;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

public class HashMapExample2 {
	
	public static void main(String[] args) {
		
		HashMap<Stud,String> hm = new HashMap();
		
		Stud c1 = new Stud(1, "Priyanka");
		
		Stud c2 = new Stud(1, "Priyanka");
		
		//Cycle c3 = c1;
		
		hm.put(c1, "Red"); // 1 & 15 = 7
		// 1 c1 Red null
		hm.put(c2, "Green"); // 1 & 15 = 7
		// c2.equals(c1); true
		
		System.out.println(c2.equals(c1)); // ==
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
		System.out.println(hm);
		
//		for (Entry<Cycle, String> c : hm.entrySet()) {
//			
//			System.out.println(c);
//		}
		
		
		Map<Integer, String>  map = new HashMap<>();
		
		map.put(101, "martin");
		map.put(102, "adam");
		map.put(103, "martin");
		map.put(104, "bruce");
		map.put(105, "jack");
		map.put(106, "adam");
		map.put(107, "sam");
		
		Map<String, Integer>  map2 = new HashMap<>();
		
		
		for(Entry<Integer,String> ss :map.entrySet()) {
			
			if(map2.containsKey(ss.getValue())) {
				map2.put(ss.getValue(), map2.get(ss.getValue())+1);
			}else{
				map2.put(ss.getValue(), 1);
			}
		}
		System.out.println(map2);
		
	}
}

class Stud{
	
	private int id;
	private String name;
	
	public Stud(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Cycle [id=" + id + ", name=" + name + "]";
	}
	
	@Override
	public int hashCode() {
		return getId();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stud other = (Stud) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		
//		Cycle c = (Cycle) obj;
//		return this.getId() == c.getId() && c.getName().equals(this.getName());
//	}
	
	
	
	
	
	
}
