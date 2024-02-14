package com.nidheeshnelson.niblinknbs.repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSdPayedModel;

@Repository
public interface NiBLinkNBSdPaymentRepository extends JpaRepository<NiBLinkNBSdPayedModel, Integer>{
	List<NiBLinkNBSdPayedModel> findByCommissionid(String s);
	NiBLinkNBSdPayedModel findByShiftid(String s);
	List<NiBLinkNBSdPayedModel> findByCustomerid(String s);
	List<NiBLinkNBSdPayedModel> findByExpertid(String s);
}
