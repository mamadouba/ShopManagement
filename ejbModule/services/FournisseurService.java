package services;

import java.util.List;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

import metier.entities.Fournisseur;
import metier.sessions.FournisseurBean;
import metier.sessions.IFournisseurLocal;

@Stateless
@WebService(name="fournisseur")
public class FournisseurService implements IFournisseurLocal {
	private FournisseurBean FournisseurBean;
	
	@WebMethod(operationName="add")
	public void addFournisseur(Fournisseur Fournisseur) {
		FournisseurBean.addFournisseur(Fournisseur);
	}

	@WebMethod(operationName="get")
	public Fournisseur getFournisseur(int id) {
		return FournisseurBean.getFournisseur(id);
	}

	@WebMethod(operationName="edit")
	public Fournisseur editFournisseur(Fournisseur Fournisseur) {
		return FournisseurBean.editFournisseur(Fournisseur);
	}

	@WebMethod(operationName="delete")
	public Fournisseur deleteFournisseur(int id) {
		return FournisseurBean.deleteFournisseur(id);
	}

	@WebMethod(operationName="liste")
	public List<Fournisseur> listFournisseurs() {
		return FournisseurBean.listFournisseurs();
	}

}
