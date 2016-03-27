package metier.sessions;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import metier.entities.Fournisseur;

@Stateless
public class FournisseurBean implements IFournisseurLocal, IFournisseurRemote{
	
	@PersistenceContext(unitName="PU_GESTION")
	protected EntityManager manager; 
	public void addFournisseur(Fournisseur Fournisseur) {
		manager.persist(Fournisseur);
		
	}
	@Override
	public Fournisseur getFournisseur(int id) {
		return manager.find(Fournisseur.class, id);
	}
	@Override
	public Fournisseur deleteFournisseur(int id) {
		Fournisseur obj = getFournisseur(id);
		if (obj != null)
			manager.remove(obj);
		return obj;
	}
	@Override
	public List<Fournisseur> listFournisseurs() {
		String query = "Select p from Fournisseurs p";
		Query q = manager.createQuery(query);
		@SuppressWarnings("unchecked")
		List<Fournisseur> result = q.getResultList();
		return result;
	}
	@Override
	public Fournisseur editFournisseur(Fournisseur fournisseur) {
		Fournisseur obj = getFournisseur(fournisseur.getId());
		if (obj != null)
			manager.merge(obj);
		return obj;
	}


}
