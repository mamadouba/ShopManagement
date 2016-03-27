package services;

import java.util.List;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

import metier.entities.Commande;
import metier.sessions.CommandeBean;
import metier.sessions.ICommandeLocal;

@Stateless
@WebService(name="commande")
public class CommandeService implements ICommandeLocal {
	private CommandeBean CommandeBean;
	
	@WebMethod(operationName="add")
	public void addCommande(Commande Commande) {
		CommandeBean.addCommande(Commande);
	}

	@WebMethod(operationName="get")
	public Commande getCommande(int id) {
		return CommandeBean.getCommande(id);
	}

	@WebMethod(operationName="edit")
	public Commande editCommande(Commande Commande) {
		return CommandeBean.editCommande(Commande);
	}

	@WebMethod(operationName="delete")
	public Commande deleteCommande(int id) {
		return CommandeBean.deleteCommande(id);
	}

	@WebMethod(operationName="liste")
	public List<Commande> listCommandes() {
		return CommandeBean.listCommandes();
	}

}
