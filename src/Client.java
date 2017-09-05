//import org.apache.commons.configuration.beanutils.BeanFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import org.springframework.beans.BeanFactory;
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// dev 
		/*Employee eRef=new Employee();
	    eRef.setEid(101);
	    eRef.setEname("John Watson");
	    eRef.setAddress("RedWood Shores");
	    System.out.println("Employee Details: "+eRef);
	    */
	    //ioc
      // Resource resource=new ClassPathResource("EmployeeBean.xml");
       //BeanFactory factory=new XmlBeanFactory(resource);
       
       ApplicationContext context=new ClassPathXmlApplicationContext("EmployeeBean.xml");
       
       
       Employee e1=(Employee)context.getBean("emp");
      // Employee e2=(Employee)context.getBean("emp2");
       System.out.println("Employee 1 details :   "+e1.toString());
       //System.out.println("Employee 2 details :   "+e2.toString());
       //context.
       ClassPathXmlApplicationContext cxt=new ClassPathXmlApplicationContext(context);
       cxt.close();
	}

}
