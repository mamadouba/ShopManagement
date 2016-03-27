package metier.sessions;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import metier.entities.CategorieProduit;

@Stateless
public class CategorieProduitBean implements ICategorieProduitLocal, ICategorieProduitRemote{
	
	@PersistenceContext(unitName="PU_GESTION")
	protected EntityManager manager; 
	public void addCategorieProduit(CategorieProduit CategorieProduit) {
		manager.persist(CategorieProduit);
		
	}
	@Override
	public CategorieProduit getCategorieProduit(int id) {
		return manager.find(CategorieProduit.class, id);
	}
	@Override
	public CategorieProduit deleteCategorieProduit(int id) {
		CategorieProduit obj = getCategorieProduit(id);
		if (obj != null)
			manager.remove(obj);
		return obj;
	}
	@Override
	public List<CategorieProduit> listCategorieProduits() {
		String query = "Select p from CategorieProduits p";
		Query q = manager.createQuery(query);
		@SuppressWarnings("unchecked")
		List<CategorieProduit> result = q.getResultList();
		return result;
	}
	@Override
	public CategorieProduit editCategorieProduit(CategorieProduit categorieProduit) {
		CategorieProduit obj = getCategorieProduit(categorieProduit.getIdCategorie());
		if (obj != null)
			manager.merge(obj);
		return obj;
	}


}
