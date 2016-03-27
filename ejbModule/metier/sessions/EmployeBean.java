package metier.sessions;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import metier.entities.Employe;

@Stateless
public class EmployeBean implements IEmployeLocal, IEmployeRemote{
	
	@PersistenceContext(unitName="PU_GESTION")
	protected EntityManager manager; 
	public void addEmploye(Employe employe) {
		manager.persist(employe);
		
	}
	@Override
	public Employe getEmploye(int id) {
		return manager.find(Employe.class, id);
	}
	@Override
	public Employe deleteEmploye(int id) {
		Employe obj = getEmploye(id);
		if (obj != null)
			manager.remove(obj);
		return obj;
	}
	@Override
	public List<Employe> listEmployes() {
		String query = "Select p from Employes p";
		Query q = manager.createQuery(query);
		@SuppressWarnings("unchecked")
		List<Employe> result = q.getResultList();
		return result;
	}
	@Override
	public Employe editEmploye(Employe employe) {
		Employe obj = getEmploye(employe.getId());
		if (obj != null)
			manager.merge(obj);
		return obj;
	}


}
