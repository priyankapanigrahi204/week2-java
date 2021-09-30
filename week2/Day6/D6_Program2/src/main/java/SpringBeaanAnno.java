import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

class A{
	int p1;
	A(int p1){
		this.p1 = p1;
		System.out.println("A()"+p1);
	}
	
	public void initBn(){
		System.out.println("initBn()...");
	}
	
	public void destroyBn(){
		System.out.println("destroyBn()...");
	}
	
	@Override
	public String toString(){
		return "a="+p1;
	}
}

class Employee{
	private String name;
	private String id ;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public Employee(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}

	public Employee() {
		System.out.println("Employee() ");
	}
}

@Configuration
class MyConfig{
	@Bean 
	@Scope("prototype")
	public Employee getEBean(){
		System.out.println("public Employee getEBean()");
		return new Employee();
	}	
	
	@Lazy
	@Bean 
	@Scope("prototype")
	public A getA(int p1){
		return new A(p1);
	}
}

public class SpringBeaanAnno {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig.class);
		Employee emp = ctx.getBean(Employee.class);
		emp.setId("10289");
		emp.setName("Suresh");
			
		Employee emp1=ctx.getBean(Employee.class) ;
		emp1.setId("10986");
		emp1.setName("Kamlesh");
		
		System.out.println(emp);
		System.out.println(emp1);
	
		A oa = ctx.getBean(A.class, 10289);
		System.out.println(oa);
		
	}
}
