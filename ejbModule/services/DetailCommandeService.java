package services;

import java.util.List;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

import metier.entities.DetailCommande;
import metier.sessions.DetailCommandeBean;
import metier.sessions.IDetailCommandeLocal;

@Stateless
@WebService(name="detailcommande")
public class DetailCommandeService implements IDetailCommandeLocal {
	private DetailCommandeBean DetailCommandeBean;
	
	@WebMethod(operationName="add")
	public void addDetailCommande(DetailCommande DetailCommande) {
		DetailCommandeBean.addDetailCommande(DetailCommande);
	}

	@WebMethod(operationName="get")
	public DetailCommande getDetailCommande(int id) {
		return DetailCommandeBean.getDetailCommande(id);
	}

	@WebMethod(operationName="edit")
	public DetailCommande editDetailCommande(DetailCommande DetailCommande) {
		return DetailCommandeBean.editDetailCommande(DetailCommande);
	}

	@WebMethod(operationName="delete")
	public DetailCommande deleteDetailCommande(int id) {
		return DetailCommandeBean.deleteDetailCommande(id);
	}

	@WebMethod(operationName="liste")
	public List<DetailCommande> listDetailCommandes() {
		return DetailCommandeBean.listDetailCommandes();
	}

}
