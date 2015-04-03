package ardanuy.financas.service;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import ardanuy.financas.ejb.ContaEJB;
import ardanuy.financas.modelo.Conta;

@WebService
public class FinancaWS implements Financa{
	
	@EJB
	private ContaEJB contaEJB;

	@WebMethod //(operationName = "hello")
	public String sayHello(@WebParam(name = "name") String name) {
		return "Hello " + name + "!";
	}
	
	@WebMethod
	public Conta getContaPeloId(@WebParam(name = "contaId") Integer contaId){
		return contaEJB.getContaById(contaId);
	}
	
	@WebMethod
	public Integer adicionaConta(@WebParam(name = "conta") Conta conta){
		return contaEJB.addConta(conta);		 
	}
}
