package com.cts.payroll.bean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.payroll.dao.AddressDao;
import com.cts.payroll.dao.EmployeeDao;
import com.cts.payroll.dao.EmployeeSkillDao;

@Service
public class EmployeeService {

	private EmployeeDao employeeDao;
	private AddressDao addressDao;
	private EmployeeSkillDao employeeSkillDao;

	@Autowired
	public void setAddressDao(AddressDao addressDao) {
		this.addressDao = addressDao;
	}

	@Autowired
	public void setEmployeeSkillDao(EmployeeSkillDao employeeSkillDao) {
		this.employeeSkillDao = employeeSkillDao;
	}

	@Autowired
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Transactional
	public List<Employee> getEmployees() throws PayrollAppException {

		return employeeDao.getEmployees();
	}

	@Transactional
	public Employee getEmployee(int id) throws PayrollAppException {

		return employeeDao.getEmployee(id);
	}

	public void updateEmployee(Employee employee, String skills[]) throws PayrollAppException {
		employeeDao.updateEmployee(employee);
		addressDao.updateAddress(employee.getAddress());
		employeeSkillDao.deleteEmployeeSkills(employee.getId());
		employeeSkillDao.insertEmployeeSkills(employee.getId(),skills);

	}
}
