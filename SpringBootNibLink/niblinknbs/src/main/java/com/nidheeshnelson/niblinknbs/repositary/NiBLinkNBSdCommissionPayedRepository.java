package com.nidheeshnelson.niblinknbs.repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSdCommissionPayedModel;

@Repository
public interface NiBLinkNBSdCommissionPayedRepository extends JpaRepository<NiBLinkNBSdCommissionPayedModel, Integer>{
	List<NiBLinkNBSdCommissionPayedModel> findByCommissionid(String s);
	NiBLinkNBSdCommissionPayedModel findByShiftid(String s);
	List<NiBLinkNBSdCommissionPayedModel> findByExpertid(String s);
	List<NiBLinkNBSdCommissionPayedModel> findByCustomerid(String s);
	List<NiBLinkNBSdCommissionPayedModel> findByThalukcode(String s);
}
