package br.gov.sp.fatec;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import br.gov.sp.fatec.Cliente;
import br.gov.sp.fatec.ClienteRepository;

public class App 
{
    public static void main( String[] args )
    {
      
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
    	ClienteRepository clienteRepo = (ClienteRepository) context.getBean("clienteRepository");
    	CarroRepository carRepo = (CarroRepository) context.getBean("carroRepository");

    	Cliente cliente = new Cliente();
    	Carro car = new Carro();
    	
    	car.setModelo("Corsa");
    	car.setPlaca("SJC-1220");
    	
    	carRepo.save(car);	
    	
    	cliente.setNome("Paulo");
    	cliente.setIdcarro(car.getIdcarro());
    
    	clienteRepo.save(cliente);
    	
    	System.out.println("                          ");
    	System.out.println("Nome: " + cliente.getNome());
    	System.out.println("Carro: " + car.getModelo());
    }
}
