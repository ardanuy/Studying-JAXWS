package ardanuy.financas.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import ardanuy.financas.modelo.Conta;

@WebService
public interface Financa {
	@WebMethod //(operationName = "hello")
	public String sayHello(@WebParam(name = "name") String name);
	
	@WebMethod
	public Conta getContaPeloId(@WebParam(name = "contaId") Integer contaId);
	
	@WebMethod
	public Integer adicionaConta(@WebParam(name = "conta") Conta conta);
}
