package ardanuy.financas.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ardanuy.financas.modelo.Conta;

@Stateless
public class ContaEJB {


	@PersistenceContext(unitName = "financas")
    private EntityManager entityManager;
	
	public Conta getContaById(Integer contaId){
		return entityManager.find(Conta.class, contaId);
	}
	
	public Integer addConta(Conta conta){
		entityManager.persist(conta);
		return conta.getId();
	}
	
}
