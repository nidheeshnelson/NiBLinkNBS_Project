package com.nidheeshnelson.niblinknbs.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScPaymentDetailsModel;

@Repository
public interface NiBLinkNBScPaymentDetailsRepository extends JpaRepository<NiBLinkNBScPaymentDetailsModel, Integer>{

}
