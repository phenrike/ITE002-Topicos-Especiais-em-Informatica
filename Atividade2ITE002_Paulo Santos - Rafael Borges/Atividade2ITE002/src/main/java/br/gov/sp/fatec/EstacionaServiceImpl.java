package br.gov.sp.fatec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("estacionaService")
public class EstacionaServiceImpl implements EstacionaService {

	@Autowired
	private ClienteRepository clienteRepository;
	private CarroRepository carRepo;
	private EstacionamentoRepository estRepo;

	@Transactional
	public void exemploTransacao() {
		// Cria cliente
		Cliente cliente = new Cliente();
		Carro car = new Carro();
		Estacionamento est = new Estacionamento();

		car.setModelo("Corsa");
		car.setPlaca("SJC-1220");
		carRepo.save(car);

		cliente.setNome("Paulo");
		cliente.setIdcarro(car.getIdcarro());
		clienteRepository.save(cliente);
		
		est.setIdcliente(cliente.getIdcliente());
		estRepo.save(est);
	}

}
