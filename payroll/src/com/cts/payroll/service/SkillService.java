package com.cts.payroll.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.payroll.bean.PayrollAppException;
import com.cts.payroll.bean.Skills;
import com.cts.payroll.dao.SkillDao;

@Service
public class SkillService {
	
	private SkillDao skillDao;
	
	
	@Autowired
	public void setSkillDao(SkillDao skillDao){
		this.skillDao=skillDao;
	}

	@Transactional
	public  List<Skills> getSkills() throws PayrollAppException {
		return skillDao.getSkills();
	}
}
