package metier.sessions;

import java.util.List;

import javax.ejb.Local;

import metier.entities.Fournisseur;
@Local
public interface IFournisseurLocal {
	public void addFournisseur(Fournisseur fournisseur);
	public Fournisseur getFournisseur(int id);
	public Fournisseur editFournisseur(Fournisseur fournisseur);
	public Fournisseur deleteFournisseur(int id);
	public List<Fournisseur> listFournisseurs();
}
