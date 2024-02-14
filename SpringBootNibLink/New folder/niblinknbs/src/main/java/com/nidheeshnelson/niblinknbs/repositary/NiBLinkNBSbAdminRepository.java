package com.nidheeshnelson.niblinknbs.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSbaAdminModel;

@Repository
public interface NiBLinkNBSbAdminRepository extends JpaRepository<NiBLinkNBSbaAdminModel, String>{

}
