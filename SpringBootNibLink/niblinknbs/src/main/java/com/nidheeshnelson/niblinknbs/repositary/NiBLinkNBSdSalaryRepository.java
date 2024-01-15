package com.nidheeshnelson.niblinknbs.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSdSalaryModel;

@Repository
public interface NiBLinkNBSdSalaryRepository extends JpaRepository<NiBLinkNBSdSalaryModel, Integer>{

}
