package metier.sessions;

import java.util.List;

import javax.ejb.Remote;

import metier.entities.Employe;
@Remote
public interface IEmployeRemote{
	public void addEmploye(Employe employe);
	public Employe getEmploye(int id);
	public Employe editEmploye(Employe employe);
	public Employe deleteEmploye(int id);
	public List<Employe> listEmployes();
}


