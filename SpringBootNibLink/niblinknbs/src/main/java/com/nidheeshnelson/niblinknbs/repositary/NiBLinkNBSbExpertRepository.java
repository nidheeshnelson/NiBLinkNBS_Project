package com.nidheeshnelson.niblinknbs.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSbbExpertModel;

@Repository
public interface NiBLinkNBSbExpertRepository extends JpaRepository<NiBLinkNBSbbExpertModel, String>{
	NiBLinkNBSbbExpertModel findByExpertid(String s);
}
