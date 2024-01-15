package com.nidheeshnelson.niblinknbs.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScBankDetailsModel;

@Repository
public interface NiBLinkNBScBankDetailsRepository extends JpaRepository<NiBLinkNBScBankDetailsModel, Integer>{

}
