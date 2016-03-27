package metier.sessions;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import metier.entities.DetailCommande;

@Stateless
public class DetailCommandeBean implements IDetailCommandeLocal, IDetailCommandeRemote{
	
	@PersistenceContext(unitName="PU_GESTION")
	protected EntityManager manager; 
	public void addDetailCommande(DetailCommande DetailCommande) {
		manager.persist(DetailCommande);
		
	}
	@Override
	public DetailCommande getDetailCommande(int id) {
		return manager.find(DetailCommande.class, id);
	}
	@Override
	public DetailCommande deleteDetailCommande(int id) {
		DetailCommande obj = getDetailCommande(id);
		if (obj != null)
			manager.remove(obj);
		return obj;
	}
	@Override
	public List<DetailCommande> listDetailCommandes() {
		String query = "Select p from DetailCommandes p";
		Query q = manager.createQuery(query);
		@SuppressWarnings("unchecked")
		List<DetailCommande> result = q.getResultList();
		return result;
	}
	@Override
	public DetailCommande editDetailCommande(DetailCommande detailCommande) {
		DetailCommande obj = getDetailCommande(detailCommande.getIdDetailCommande());
		if (obj != null)
			manager.merge(obj);
		return obj;
	}


}
