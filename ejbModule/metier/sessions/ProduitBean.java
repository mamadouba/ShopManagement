package metier.sessions;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import metier.entities.Produit;

@Stateless
public class ProduitBean implements IProduitLocal, IProduitRemote{
	
	@PersistenceContext(unitName="PU_GESTION")
	protected EntityManager manager; 
	public void addProduit(Produit Produit) {
		manager.persist(Produit);
		
	}
	@Override
	public Produit getProduit(int id) {
		return manager.find(Produit.class, id);
	}
	@Override
	public Produit deleteProduit(int id) {
		Produit obj = getProduit(id);
		if (obj != null)
			manager.remove(obj);
		return obj;
	}
	@Override
	public List<Produit> listProduits() {
		String query = "Select p from Produits p";
		Query q = manager.createQuery(query);
		@SuppressWarnings("unchecked")
		List<Produit> result = q.getResultList();
		return result;
	}
	@Override
	public Produit editProduit(Produit produit) {
		Produit obj = getProduit(produit.getIdProduit());
		if (obj != null)
			manager.merge(obj);
		return obj;
	}


}
