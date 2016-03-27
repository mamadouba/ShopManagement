package metier.sessions;

import java.util.List;

import javax.ejb.Remote;

import metier.entities.Fournisseur;
@Remote
public interface IFournisseurRemote {
	public void addFournisseur(Fournisseur fournisseur);
	public Fournisseur getFournisseur(int id);
	public Fournisseur editFournisseur(Fournisseur fournisseur);
	public Fournisseur deleteFournisseur(int id);
	public List<Fournisseur> listFournisseurs();
}
