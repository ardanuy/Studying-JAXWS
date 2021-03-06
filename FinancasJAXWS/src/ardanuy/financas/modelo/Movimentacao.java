package ardanuy.financas.modelo;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.google.gson.Gson;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
public class Movimentacao {	
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private Float valor;
	
	@Enumerated(EnumType.STRING)
	private TipoMovimentacao tipoMovimentacao;
	
	@Temporal(TemporalType.DATE)
	private Calendar data;
	
	private String descricao;

	@ManyToOne
	@XmlTransient
	Conta conta;
	
	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	Movimentacao(){}
	
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the valor
	 */
	public Float getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(Float valor) {
		this.valor = valor;
	}

	/**
	 * @return the tipoMovimentacao
	 */
	public TipoMovimentacao getTipoMovimentacao() {
		return tipoMovimentacao;
	}

	/**
	 * @param tipoMovimentacao the tipoMovimentacao to set
	 */
	public void setTipoMovimentacao(TipoMovimentacao tipoMovimentacao) {
		this.tipoMovimentacao = tipoMovimentacao;
	}

	/**
	 * @return the data
	 */
	public Calendar getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(Calendar data) {
		this.data = data;
	}

	/**
	 * @return the descriao
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * @param descriao the descriao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String toJon(){
		return new Gson().toJson(this);
	}
	
}
