package metier.sessions;

import java.util.List;

import javax.ejb.Local;

import metier.entities.Client;
@Local
public interface IClientLocal {
	public void addClient(Client client);
	public Client getClient(int id);
	public Client editClient(Client client);
	public Client deleteClient(int id);
	public List<Client> listClients();
}
