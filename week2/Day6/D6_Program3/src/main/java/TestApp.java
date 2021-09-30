import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

//#3. Repeat #1, using Java Configuration class
public class TestApp{
 
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig.class);
			//ApplicationContext res = new ClassPathXmlApplicationContext("spconfig.xml");
			//BeanFactory factory = new XmlBeanFactory(res);
	 
			Citizen citizen1 = ctx.getBean(Citizen.class);
			citizen1.setName("Ajay");
			citizen1.setEmailAddress("Ajay88@gmail.com");
			citizen1.setContactNumber("888888888");
			
			Citizen citizen2 = ctx.getBean(Citizen.class);
			citizen2.setName("Ashok");
			citizen2.setEmailAddress("Ashok77@gmail.com");
			citizen2.setContactNumber("7777777777");
			
			A newClass = ctx.getBean(A.class);
			Map<String, Citizen> data = new HashMap<String, Citizen>();
			
			data.put("22335648", citizen1);
			data.put("99886677", citizen2);
			
			newClass.setData(data);
			newClass.show();
			
	 
		}
}