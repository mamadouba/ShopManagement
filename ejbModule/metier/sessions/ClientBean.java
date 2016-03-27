package metier.sessions;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import metier.entities.Client;

@Stateless
public class ClientBean implements IClientLocal, IClientRemote{
	
	@PersistenceContext(unitName="PU_GESTION")
	protected EntityManager manager; 
	public void addClient(Client Client) {
		manager.persist(Client);
		
	}
	@Override
	public Client getClient(int id) {
		return manager.find(Client.class, id);
	}
	@Override
	public Client deleteClient(int id) {
		Client obj = getClient(id);
		if (obj != null)
			manager.remove(obj);
		return obj;
	}
	@Override
	public List<Client> listClients() {
		String query = "Select p from clients p";
		Query q = manager.createQuery(query);
		@SuppressWarnings("unchecked")
		List<Client> result = q.getResultList();
		return result;
	}
	@Override
	public Client editClient(Client client) {
		Client obj = getClient(client.getId());
		if (obj != null)
			manager.merge(obj);
		return obj;
	}


}
