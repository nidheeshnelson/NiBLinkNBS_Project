package com.nidheeshnelson.niblinknbs.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSdCommissionModel;

@Repository
public interface NiBLinkNBSdCommissionRepository extends JpaRepository<NiBLinkNBSdCommissionModel, Integer>{

}
