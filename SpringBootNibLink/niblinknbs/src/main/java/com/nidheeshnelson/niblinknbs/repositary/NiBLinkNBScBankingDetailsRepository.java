package com.nidheeshnelson.niblinknbs.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScBankingDetailsModel;

@Repository
public interface NiBLinkNBScBankingDetailsRepository extends JpaRepository<NiBLinkNBScBankingDetailsModel, String>{
	NiBLinkNBScBankingDetailsModel findByBankid (String s);
}
