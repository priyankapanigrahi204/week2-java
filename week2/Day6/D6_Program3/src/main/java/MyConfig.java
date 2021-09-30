import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfig {
	
	@Bean 
	@Scope("prototype")
	public Citizen getCBean(){
		System.out.println("This is public Citizen getCBean()");
		return new Citizen();
	}
	
	@Bean
	@Scope("prototype")
	public A getNBean() {
		System.out.println("This is  public NewClass getNBean()");
		return new A();
	}

}
