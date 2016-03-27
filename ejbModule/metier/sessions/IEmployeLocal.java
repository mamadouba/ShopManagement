package metier.sessions;

import java.util.List;

import javax.ejb.Local;

import metier.entities.Employe;
@Local
public interface IEmployeLocal {
	public void addEmploye(Employe employe);
	public Employe getEmploye(int id);
	public Employe editEmploye(Employe employe);
	public Employe deleteEmploye(int id);
	public List<Employe> listEmployes();
}
