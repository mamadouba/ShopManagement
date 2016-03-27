package metier.sessions;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import metier.entities.Commande;

@Stateless
public class CommandeBean implements ICommandeLocal, ICommandeRemote{
	
	@PersistenceContext(unitName="PU_GESTION")
	protected EntityManager manager; 
	public void addCommande(Commande Commande) {
		manager.persist(Commande);
		
	}
	@Override
	public Commande getCommande(int id) {
		return manager.find(Commande.class, id);
	}
	@Override
	public Commande deleteCommande(int id) {
		Commande obj = getCommande(id);
		if (obj != null)
			manager.remove(obj);
		return obj;
	}
	@Override
	public List<Commande> listCommandes() {
		String query = "Select p from Commandes p";
		Query q = manager.createQuery(query);
		@SuppressWarnings("unchecked")
		List<Commande> result = q.getResultList();
		return result;
	}
	@Override
	public Commande editCommande(Commande commande) {
		Commande obj = getCommande(commande.getIdCommande());
		if (obj != null)
			manager.merge(obj);
		return obj;
	}


}
