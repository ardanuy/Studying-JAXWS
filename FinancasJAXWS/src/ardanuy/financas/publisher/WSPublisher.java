package ardanuy.financas.publisher;

import javax.xml.ws.Endpoint;

import ardanuy.financas.service.FinancaWS;

public class WSPublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/FinancasJAXWS/FinancaWS", new FinancaWS());
	}

}
