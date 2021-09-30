import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
 //#1. Inject Map entries into a Bean, and print the same? Key - String(Aadhar Id) Value - Citizen(name, contact no., email id)

 


public class TestApp{
 
	public static void main(String[] args)
	{
		//ApplicationContext res = new FileSystemXmlApplicationContext("C:\\Users\\chandradeep.nagarale\\Eclipse_workspace\\Day6_Assigmnet_Program_1\\src\\main\\java");
	ApplicationContext res = new ClassPathXmlApplicationContext("bean.xml");
		//BeanFactory factory = new XmlBeanFactory(res);
 
		Object o = res.getBean("id1");
		A wb = (A)o;
 
		wb.show();
 
	}
 
}