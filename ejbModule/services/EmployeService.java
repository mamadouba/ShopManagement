package services;

import java.util.List;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

import metier.entities.Employe;
import metier.sessions.EmployeBean;
import metier.sessions.IEmployeLocal;

@Stateless
@WebService(name="employe")
public class EmployeService implements IEmployeLocal {
	private EmployeBean EmployeBean;
	
	@WebMethod(operationName="add")
	public void addEmploye(Employe Employe) {
		EmployeBean.addEmploye(Employe);
	}

	@WebMethod(operationName="get")
	public Employe getEmploye(int id) {
		return EmployeBean.getEmploye(id);
	}

	@WebMethod(operationName="edit")
	public Employe editEmploye(Employe Employe) {
		return EmployeBean.editEmploye(Employe);
	}

	@WebMethod(operationName="delete")
	public Employe deleteEmploye(int id) {
		return EmployeBean.deleteEmploye(id);
	}

	@WebMethod(operationName="liste")
	public List<Employe> listEmployes() {
		return EmployeBean.listEmployes();
	}

}
