package com.nidheeshnelson.niblinknbs.repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSdSalaryModel;

@Repository
public interface NiBLinkNBSdSalaryRepository extends JpaRepository<NiBLinkNBSdSalaryModel, Integer>{
	NiBLinkNBSdSalaryModel findByShiftid(String s);
	List<NiBLinkNBSdSalaryModel> findByCommissionid(String s);
	List<NiBLinkNBSdSalaryModel> findByExpertid(String s);
	List<NiBLinkNBSdSalaryModel> findByCustomerid(String s);
	List<NiBLinkNBSdSalaryModel> findByThalukcode(String s);
}
