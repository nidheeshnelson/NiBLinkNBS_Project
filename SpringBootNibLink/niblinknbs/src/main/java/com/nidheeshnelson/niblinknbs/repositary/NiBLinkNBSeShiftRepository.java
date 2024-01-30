package com.nidheeshnelson.niblinknbs.repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSeShiftModel;
import com.nidheeshnelson.niblinknbs.model.ShiftStatus;

@Repository
public interface NiBLinkNBSeShiftRepository extends JpaRepository<NiBLinkNBSeShiftModel, Integer>{
	NiBLinkNBSeShiftModel findByGeneratedshiftid(String s);
	List<NiBLinkNBSeShiftModel> findByThalukcode(String s);
	List<NiBLinkNBSeShiftModel> findByJobcode(String s);
	List<NiBLinkNBSeShiftModel> findByExpertid(String s);
	List<NiBLinkNBSeShiftModel> findByCustomerid(String s);
	List<NiBLinkNBSeShiftModel> findByThalukcodeAndStatus(String s, ShiftStatus ss);
	List<NiBLinkNBSeShiftModel> findByExpertidAndStatus(String s, ShiftStatus ss);
	List<NiBLinkNBSeShiftModel> findByCustomeridAndStatus(String s, ShiftStatus ss);
	List<NiBLinkNBSeShiftModel> findByJobcodeAndStatus(String s, ShiftStatus ss);
}
