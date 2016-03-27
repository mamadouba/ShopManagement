package metier.entities;


import java.util.Set;
import java.util.TreeSet;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="CLIENTS")
@PrimaryKeyJoinColumn(name="id")
public class Client extends Person{
	private static final long serialVersionUID = 1L;
	private String categorieClient;
	@OneToMany(mappedBy="client")
	private Set<Commande> commandes = new TreeSet<Commande>();
	
	public Client(String nom, String prenom, String telephone, String email, String adresse, String categorieClient) {
		super(nom, prenom, telephone, email, adresse);
		 this.categorieClient = categorieClient;
	}
	public Client(){}
	public String getCategorieClient() {
		return categorieClient;
	}
	public void setCategorieClient(String categorieClient) {
		this.categorieClient = categorieClient;
	}
	public Set<Commande> getCommandes() {
		return commandes;
	}
	public void setCommandes(Set<Commande> commandes) {
		this.commandes = commandes;
	}
	
	
}
	