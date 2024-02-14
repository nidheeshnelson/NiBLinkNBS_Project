package com.nidheeshnelson.niblinknbs.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScCommissionModel;
@Repository
public interface NiBLinkNBScCommissionRepository extends JpaRepository<NiBLinkNBScCommissionModel, Integer>{
	NiBLinkNBScCommissionModel findByGeneratedcommissionid (String s);
}
