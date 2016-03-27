package metier.sessions;
import java.util.List;

import javax.ejb.Local;
import metier.entities.CategorieProduit;
@Local
public interface ICategorieProduitLocal {
	public void addCategorieProduit(CategorieProduit categorieProduit);
	public CategorieProduit getCategorieProduit(int id);
	public CategorieProduit editCategorieProduit(CategorieProduit categorieProduit);
	public CategorieProduit deleteCategorieProduit(int id);
	public List<CategorieProduit> listCategorieProduits();
}
