package metier.sessions;
import java.util.List;

import javax.ejb.Remote;
import metier.entities.CategorieProduit;
@Remote
public interface ICategorieProduitRemote {
	public void addCategorieProduit(CategorieProduit categorieProduit);
	public CategorieProduit getCategorieProduit(int id);
	public CategorieProduit editCategorieProduit(CategorieProduit categorieProduit);
	public CategorieProduit deleteCategorieProduit(int id);
	public List<CategorieProduit> listCategorieProduits();
}
