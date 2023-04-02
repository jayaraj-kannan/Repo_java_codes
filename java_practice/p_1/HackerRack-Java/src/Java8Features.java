import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Features {
	public static Employee employee;
	public static void main(String[] args) {
		
		
	List<Employee> emp=new ArrayList();
	
	emp.add(new Employee(1, "EMP1", 12000));
	emp.add(new Employee(2, "EMP2", 10000));
	emp.add(new Employee(3, "EMP3", 6000));
	emp.add(new Employee(4, "EMP4", 25000));
	emp.add(new Employee(9, "EMP9", 59000));
	emp.add(new Employee(34, "EMP34", 12000));
	emp.add(new Employee(54, "EMP54", 5000));
	emp.add(new Employee(23, "EMP23", 1200));
	emp.add(new Employee(97, "EMP97", 6000));
	emp.add(new Employee(112, "EMP112", 40000));
	
	 emp.stream()
		.sorted(Comparator.comparing(Employee::getName))
		.forEach(e->System.out.println(e.getName()));
	
	List<Employee> sortedData=emp.stream()
		.filter(em -> em.getSalary() < 10000)
		.map(em -> {
			em.setSalary(em.getSalary()+(em.getSalary()*0.1));return em;})
		.collect(Collectors.toList());
	iterator(sortedData,emp);
			

	
	}
	
	public static void iterator(List<Employee> newData,List<Employee> oldData) {
		System.out.printf("%-5s %-10s %10s %10s\n", "ID", "Name", "Salary", "Old Salary");
		newData.stream()
		.map(e->{
			Employee empOld=oldData.stream().filter(f-> f.getId()==e.getId()).findFirst().orElse(null);
			return String.format("%-5s %-10s %10s %10s\n", 
					e.getId(), 
					e.getName(),
					e.getSalary(), 
					empOld!=null?empOld.getSalary():"");
		}).forEach(System.out::printf);
	}
	

}
