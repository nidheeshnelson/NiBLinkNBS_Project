package com.nidheeshnelson.niblinknbs.repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSeShiftRequestModel;
import com.nidheeshnelson.niblinknbs.model.ShiftStatus;

@Repository
public interface NiBLinkNBSeShiftRequestRepository extends JpaRepository<NiBLinkNBSeShiftRequestModel, Integer>{
	List<NiBLinkNBSeShiftRequestModel> findByShiftid(String s);
	List<NiBLinkNBSeShiftRequestModel> findByExpertid(String s);
	List<NiBLinkNBSeShiftRequestModel> findByCustomerid(String s);
	List<NiBLinkNBSeShiftRequestModel> findByExpertidAndStatus(String s, ShiftStatus ss);
	List<NiBLinkNBSeShiftRequestModel> findByExpertidAndStatusAndShiftid(String s, ShiftStatus ss, String sss);
	List<NiBLinkNBSeShiftRequestModel> findByCustomeridAndStatus(String s, ShiftStatus ss);
}
