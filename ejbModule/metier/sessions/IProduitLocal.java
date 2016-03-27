package metier.sessions;
import java.util.List;

import javax.ejb.Local;

import metier.entities.Produit;
@Local
public interface IProduitLocal {
	public void addProduit(Produit produit);
	public Produit getProduit(int id);
	public Produit editProduit(Produit produit);
	public Produit deleteProduit(int id);
	public List<Produit> listProduits();
}
