package com.nidheeshnelson.niblinknbs.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScPersonalModel;

@Repository
public interface NiBLinkNBScPersonalRepository extends JpaRepository<NiBLinkNBScPersonalModel, String>{
	NiBLinkNBScPersonalModel findByPersonalid (String s);
}
