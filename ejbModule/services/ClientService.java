package services;

import java.util.List;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

import metier.entities.Client;
import metier.sessions.ClientBean;
import metier.sessions.IClientLocal;

@Stateless
@WebService(name="client")
public class ClientService implements IClientLocal {
	private ClientBean ClientBean;
	
	@WebMethod(operationName="add")
	public void addClient(Client Client) {
		ClientBean.addClient(Client);
	}

	@WebMethod(operationName="get")
	public Client getClient(int id) {
		return ClientBean.getClient(id);
	}

	@WebMethod(operationName="edit")
	public Client editClient(Client Client) {
		return ClientBean.editClient(Client);
	}

	@WebMethod(operationName="delete")
	public Client deleteClient(int id) {
		return ClientBean.deleteClient(id);
	}

	@WebMethod(operationName="liste")
	public List<Client> listClients() {
		return ClientBean.listClients();
	}

}
