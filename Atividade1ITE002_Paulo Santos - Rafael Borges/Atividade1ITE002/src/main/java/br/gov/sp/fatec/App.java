package br.gov.sp.fatec;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    			Estacionamento obj = (Estacionamento) context.getBean("estacionamento");

    			System.out.println(obj.guardarCarroCliente());
    }
}
