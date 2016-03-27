package metier.sessions;
import java.util.List;
import javax.ejb.Remote;
import metier.entities.Produit;
@Remote
public interface IProduitRemote {
	public void addProduit(Produit produit);
	public Produit getProduit(int id);
	public Produit editProduit(Produit produit);
	public Produit deleteProduit(int id);
	public List<Produit> listProduits();
}
