package metier.sessions;
import java.util.List;

import javax.ejb.Local;
import metier.entities.DetailCommande;
@Local
public interface IDetailCommandeLocal {
	public void addDetailCommande(DetailCommande detailCommande);
	public DetailCommande getDetailCommande(int id);
	public DetailCommande editDetailCommande(DetailCommande detailCommande);
	public DetailCommande deleteDetailCommande(int id);
	public List<DetailCommande> listDetailCommandes();
}
