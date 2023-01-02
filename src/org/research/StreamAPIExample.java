package org.research;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamAPIExample {

	public static void main(String[] args) {
		
		
		
		ArrayList<Integer> ar3 = new ArrayList(); //10 - Load factor 0.75
        
        ar3.add(1);
        ar3.add(61);
        ar3.add(23);
        ar3.add(64);
        ar3.add(98);
        ar3.add(2);
        ar3.add(38);
        ar3.add(55);
        ar3.add(86);
        ar3.add(92);
        ar3.add(23);
        ar3.add(64);
        
        Predicate<Integer> pred = new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				
				return t % 2 ==0;
			}
        	
        	
		};
        
        List<Integer> evenNumber= ar3.stream().filter(pred).collect(Collectors.toList());
        							//Loop     Apply condn  collect Collct will collect   converting it to List
        
        //evenNumber.forEach(System.out::println);
        
        long count = ar3.stream().count();
        
        
        List<Integer> collect = ar3.stream().distinct().collect(Collectors.toList());
        
        
        Optional<Integer> abc = ar3.stream().findAny();
        
//        if(abc.isPresent()) {
//        	System.out.println(abc.get());
//        }
        
        Integer integer = ar3.stream().findFirst().get();
        
        
        Integer reduce = ar3.stream().reduce(3, new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer t, Integer u) {
				
				return t+u;
			}
		});
        
        System.out.println("Reduce : "+reduce);
        
        
        List<Integer> collect2 = ar3.stream().limit(5).collect(Collectors.toList());
        
        collect2.forEach(System.out::println);
        
        List<Students> studentList = new ArrayList<>();
        
        studentList.add(new Students(2, 19, "Tony"));
        studentList.add(new Students(3, 16, "Namaz"));
        studentList.add(new Students(1, 18, "Danish"));
        studentList.add(new Students(4, 20, "Shaikh"));
        
        //Function<T, R>
//        List<Employee> collect3 = studentList.stream().map(new Function<Students, Employee>() {
//
//			@Override
//			public Employee apply(Students student) {
//				Employee emp = new Employee();
//				
//				emp.setId(student.getId());
//				emp.setAge(student.getAge());
//				emp.setName("Employee : ".concat(student.getLastname()) );
//				return emp;
//			}
//		}).collect(Collectors.toList());
        
        List<Employee> collect3 = studentList.stream().map(student -> {
				Employee emp = new Employee();
				
				emp.setId(student.getId());
				emp.setAge(student.getAge());
				emp.setName("Employee : ".concat(student.getLastname()) );
				return emp;
			
		}).collect(Collectors.toList());
        
        
        collect3.forEach(System.out::println);
        

		
	}
}

class Employee {
	
	Employee(){}
	
	private int id;
	private int age;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", age=" + age + ", name=" + name + "]";
	}
	public Employee(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}
	
	
}
