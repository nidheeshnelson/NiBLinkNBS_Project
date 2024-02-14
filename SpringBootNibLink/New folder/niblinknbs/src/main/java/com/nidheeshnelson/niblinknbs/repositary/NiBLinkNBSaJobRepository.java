package com.nidheeshnelson.niblinknbs.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSaJobModel;

@Repository
public interface NiBLinkNBSaJobRepository extends JpaRepository<NiBLinkNBSaJobModel, Integer>{
	NiBLinkNBSaJobModel findByJobcode(String s);
}
