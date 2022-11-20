package one.digitalinnovation.gof.service.impl;

import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.service.ClienteService;

public class ClienteServiceImpl implements ClienteService{
	
	//TODO Singleton: Injetar os componentes do Spring com @Autowired
	//TODO Strategy: Implementar os métodos definidos na Interface
	//TODO Facade: Abstrair integrações com subsistemas, provendo uma Interface simples.
	
	@Override
	public Iterable<Cliente> buscarTodos(){
		//FIXME Buscar todos os Clientes.
		return null;
		
	}
	
	@Override
	public Cliente buscarPorId(Long id) {
		//FIXME Buscar Cliente por ID.
		return null;
	}
	
	@Override
	public void inserir(Cliente cliente) {
		//FIXME Buscar Cliente por ID.
		//FIXME Caso não exista, integrar com o ViaCEP e persistir o retorno.
		//FIXME Inserir Clientem vinculando o Endereco (novo ou existente).
	}
	
	@Override
	public void atualizar(Long id, Cliente cliente) {
		//FIXME Buscar Cliente por ID, caso exista:
		//FIXME Verificar se o Endereco do Cliente já existe (pelo CEP).
		//FIXME Caso não exista, integrar com o ViaCEP e persistir o retorno.
		//FIXME Alterar Cliente, vinculando o Endereco (novo ou existente).
	}
	
	@Override
	public void deletar(Long id) {
		//FIXME Deletar Cliente por ID.
	}

}
