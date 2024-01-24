package com.nidheeshnelson.niblinknbs.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSaStatusModel;

@Repository
public interface NiBLinkNBSaStatusRepository extends JpaRepository<NiBLinkNBSaStatusModel, String>{

}
