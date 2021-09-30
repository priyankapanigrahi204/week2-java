import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class A {
 
private Map<String, Citizen> data= new HashMap<String, Citizen>();	 
	
	A(Map<String, Citizen> data){
		this.data = data;
	}
 
	public A() {	}

	public void setData(Map data) {
		this.data = data;
	}
 
	public void show()
	   {
		   Set s=data.entrySet();
		   Iterator it = s.iterator();
		   while(it.hasNext())
		   {
			   Map.Entry me = (Map.Entry)it.next();
			   System.out.println("Aadhar Number: "+me.getKey()+ " Citizen Info  "+me.getValue());
		   }
	   }
 
	}