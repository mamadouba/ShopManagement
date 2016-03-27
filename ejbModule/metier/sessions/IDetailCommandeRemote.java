package metier.sessions;
import java.util.List;

import javax.ejb.Remote;
import metier.entities.DetailCommande;
@Remote
public interface IDetailCommandeRemote {
	public void addDetailCommande(DetailCommande detailCommande);
	public DetailCommande getDetailCommande(int id);
	public DetailCommande editDetailCommande(DetailCommande detailCommande);
	public DetailCommande deleteDetailCommande(int id);
	public List<DetailCommande> listDetailCommandes();
}
