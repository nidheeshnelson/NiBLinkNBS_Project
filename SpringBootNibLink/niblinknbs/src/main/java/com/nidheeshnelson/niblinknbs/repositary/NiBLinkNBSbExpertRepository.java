package com.nidheeshnelson.niblinknbs.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSbExpertModel;

@Repository
public interface NiBLinkNBSbExpertRepository extends JpaRepository<NiBLinkNBSbExpertModel, Integer>{

}
