package com.nidheeshnelson.niblinknbs.repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScPaymentDetailsModel;

@Repository
public interface NiBLinkNBScPaymentDetailsRepository extends JpaRepository<NiBLinkNBScPaymentDetailsModel, String>{
	NiBLinkNBScPaymentDetailsModel findByPaymentid (String s);
	List<NiBLinkNBScPaymentDetailsModel> findByCommissionid (String s);

}
