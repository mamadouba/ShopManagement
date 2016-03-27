package metier.sessions;

import java.util.List;

import javax.ejb.Remote;

import metier.entities.Client;
@Remote
public interface IClientRemote {
	public void addClient(Client client);
	public Client getClient(int id);
	public Client editClient(Client client);
	public Client deleteClient(int id);
	public List<Client> listClients();
}
