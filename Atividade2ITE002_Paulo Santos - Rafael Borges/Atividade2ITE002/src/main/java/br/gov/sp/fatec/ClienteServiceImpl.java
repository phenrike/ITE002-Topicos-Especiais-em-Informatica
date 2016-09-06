package br.gov.sp.fatec;

import org.springframework.beans.factory.annotation.Autowired;

public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	private CarroRepository carRepo;

	public void exemploTransacao() {
		// Cria cliente
		Cliente cliente = new Cliente();
		Carro car = new Carro();

		car.setModelo("Corsa");
		car.setPlaca("SJC-1220");

		carRepo.save(car);

		cliente.setNome("Paulo");
		cliente.setIdcarro(car.getIdcarro());

		clienteRepository.save(cliente);
	}

}
