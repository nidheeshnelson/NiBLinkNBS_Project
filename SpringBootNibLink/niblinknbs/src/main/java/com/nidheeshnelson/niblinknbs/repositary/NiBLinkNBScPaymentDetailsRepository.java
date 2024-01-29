package com.nidheeshnelson.niblinknbs.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScAddressModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScPaymentDetailsModel;

@Repository
public interface NiBLinkNBScPaymentDetailsRepository extends JpaRepository<NiBLinkNBScPaymentDetailsModel, String>{
	NiBLinkNBScPaymentDetailsModel findByPaymentid (String s);

}
