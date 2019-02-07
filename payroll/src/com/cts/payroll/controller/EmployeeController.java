package com.cts.payroll.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.payroll.bean.Employee;
import com.cts.payroll.bean.EmployeeService;
import com.cts.payroll.bean.PayrollAppException;
import com.cts.payroll.service.DepartmentService;
import com.cts.payroll.service.SkillService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	private EmployeeService employeeService;
	private DepartmentService departmentService;
	private SkillService skillService;
	

	@Autowired
	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}

	@Autowired
	public void setSkillService(SkillService skillService) {
		this.skillService = skillService;
	}

	@Autowired
	public void setEmployeeService(EmployeeService employeeService) {
		
		this.employeeService = employeeService;
	}

	@GetMapping("/display")
	public String display() {
		return "updateemp";
	}

	@GetMapping("/show/{employeeId}")
	//@ExceptionHandler({ PayrollAppException.class })
	public String getEmployee(@PathVariable int employeeId, Model model) throws PayrollAppException {
		
		Employee employee = employeeService.getEmployee(employeeId);
		
		model.addAttribute("employee", employee);
		model.addAttribute("departments", departmentService.getDepartments());
		model.addAttribute("skills", skillService.getSkills());
		return "updateemp";
	}

	@PostMapping("/modify")
	public String updateEmployee(@ModelAttribute("employee") Employee employee,
			@RequestParam("skill") String[] skills, Model model) throws PayrollAppException {
		System.out.println("inside post mapping");
		System.out.println(employee);
	
		employeeService.updateEmployee(employee, skills);
		model.addAttribute("employee", employeeService.getEmployee(employee.getId()));
		model.addAttribute("departments", departmentService.getDepartments());
		model.addAttribute("skills", skillService.getSkills());
		return "updateemp";
	}
	
}
