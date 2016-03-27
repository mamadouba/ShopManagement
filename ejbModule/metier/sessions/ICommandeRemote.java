package metier.sessions;
import java.util.List;

import javax.ejb.Remote;
import metier.entities.Commande;
@Remote
public interface ICommandeRemote {
	public void addCommande(Commande commande);
	public Commande getCommande(int id);
	public Commande editCommande(Commande commande);
	public Commande deleteCommande(int id);
	public List<Commande> listCommandes();
}
