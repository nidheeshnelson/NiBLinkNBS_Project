package com.nidheeshnelson.niblinknbs.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSdCommissionPayedModel;

@Repository
public interface NiBLinkNBSdCommissionPayedRepository extends JpaRepository<NiBLinkNBSdCommissionPayedModel, Integer>{

}
