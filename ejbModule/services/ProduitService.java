package services;

import java.util.List;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

import metier.entities.Produit;
import metier.sessions.ProduitBean;
import metier.sessions.IProduitLocal;

@Stateless
@WebService(name="produit")
public class ProduitService implements IProduitLocal {
	private ProduitBean ProduitBean;
	
	@WebMethod(operationName="add")
	public void addProduit(Produit Produit) {
		ProduitBean.addProduit(Produit);
	}

	@WebMethod(operationName="get")
	public Produit getProduit(int id) {
		return ProduitBean.getProduit(id);
	}

	@WebMethod(operationName="edit")
	public Produit editProduit(Produit Produit) {
		return ProduitBean.editProduit(Produit);
	}

	@WebMethod(operationName="delete")
	public Produit deleteProduit(int id) {
		return ProduitBean.deleteProduit(id);
	}

	@WebMethod(operationName="liste")
	public List<Produit> listProduits() {
		return ProduitBean.listProduits();
	}

}
