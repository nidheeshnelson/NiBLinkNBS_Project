package com.nidheeshnelson.niblinknbs.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSaLogInModel;

@Repository
public interface NiBLinkNBSaLogInRepository extends JpaRepository<NiBLinkNBSaLogInModel, Integer>{

}
