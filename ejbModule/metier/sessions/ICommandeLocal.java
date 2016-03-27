
package metier.sessions;
import java.util.List;

import javax.ejb.Local;
import metier.entities.Commande;
@Local
public interface ICommandeLocal {
	public void addCommande(Commande commande);
	public Commande getCommande(int id);
	public Commande editCommande(Commande commande);
	public Commande deleteCommande(int id);
	public List<Commande> listCommandes();
}
