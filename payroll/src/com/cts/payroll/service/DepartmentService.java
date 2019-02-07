package com.cts.payroll.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.payroll.bean.Department;
import com.cts.payroll.bean.PayrollAppException;
import com.cts.payroll.dao.DepartmentDao;

@Service
public class DepartmentService {
	private DepartmentDao departmentDao;

	@Autowired
	public void setDepartmentDao(DepartmentDao departmentDao) {
		this.departmentDao = departmentDao;
	}

	@Transactional
	public List<Department> getDepartments() throws PayrollAppException {

		return departmentDao.getDepartments();
	}
}
