package org.bhanu;

import org.springframework.core.io.Resource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
public class DisplayDetails {
	public static void main(String arg[]) {
		Resource r=new ClassPathResource("config.xml");
		BeanFactory f=new XmlBeanFactory(r);
		Shopping i=(Shopping) f.getBean("shopBean");
		i.display();
	}
}
