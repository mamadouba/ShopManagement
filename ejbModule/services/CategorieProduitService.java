package services;

import java.util.List;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

import metier.entities.CategorieProduit;
import metier.sessions.CategorieProduitBean;
import metier.sessions.ICategorieProduitLocal;

@Stateless
@WebService(name="categorie")
public class CategorieProduitService implements ICategorieProduitLocal {
	private CategorieProduitBean categorieProduitBean;
	
	@WebMethod(operationName="add")
	public void addCategorieProduit(CategorieProduit categorieProduit) {
		categorieProduitBean.addCategorieProduit(categorieProduit);
	}

	@WebMethod(operationName="get")
	public CategorieProduit getCategorieProduit(int id) {
		return categorieProduitBean.getCategorieProduit(id);
	}

	@WebMethod(operationName="edit")
	public CategorieProduit editCategorieProduit(CategorieProduit categorieProduit) {
		return categorieProduitBean.editCategorieProduit(categorieProduit);
	}

	@WebMethod(operationName="delete")
	public CategorieProduit deleteCategorieProduit(int id) {
		return categorieProduitBean.deleteCategorieProduit(id);
	}

	@WebMethod(operationName="liste")
	public List<CategorieProduit> listCategorieProduits() {
		return categorieProduitBean.listCategorieProduits();
	}

}
