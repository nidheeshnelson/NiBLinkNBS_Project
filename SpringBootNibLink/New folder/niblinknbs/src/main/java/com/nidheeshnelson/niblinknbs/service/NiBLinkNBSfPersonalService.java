package com.nidheeshnelson.niblinknbs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScPersonalModel;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBScPersonalRepository;

@Service
public class NiBLinkNBSfPersonalService implements NiBLinkNBSaiePersonalService{
	@Autowired
	private NiBLinkNBScPersonalRepository pr;
	private NiBLinkNBScPersonalModel pm;
	public NiBLinkNBScPersonalModel showPersonal(String s) {
		return pr.findByPersonalid(s);
	}
	
	public NiBLinkNBScPersonalModel addPersonal(NiBLinkNBScPersonalModel pm) {
		return pr.save(pm);
	}
	
	public NiBLinkNBScPersonalModel editPersonal(NiBLinkNBScPersonalModel pm) {
		this.pm=pr.findByPersonalid(pm.getPersonalid());
		try {
		if(pm.getAge()!=0) {
			this.pm.setAge(pm.getAge());
		}
		if(pm.getChildren()!=0) {
			this.pm.setChildren(pm.getChildren());
		}
		if(pm.getDateofbirth()!=null) {
			this.pm.setDateofbirth(pm.getDateofbirth());
		}
		if(pm.getFather()!=null) {
			this.pm.setFather(pm.getFather());
		}
		if(pm.getGender()!=null) {
			this.pm.setGender(pm.getGender());
		}
		if(pm.getMother()!=null) {
			this.pm.setMother(pm.getMother());
		}
		if(pm.getSpouse()!=null) {
			this.pm.setSpouse(pm.getSpouse());
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return pr.save(this.pm);
	}
	
}
