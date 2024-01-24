package com.nidheeshnelson.niblinknbs.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScAddressModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScBankingDetailsModel;

@Repository
public interface NiBLinkNBScBankingDetailsRepository extends JpaRepository<NiBLinkNBScBankingDetailsModel, Integer>{
	@Query("SELECT a FROM NiBLinkNBScBankingDetailsModel a INNER JOIN FETCH a.namelistid c WHERE c.namelistid = :namelistid")
	NiBLinkNBScBankingDetailsModel findByNamelistId(@Param("namelistid") String namelistid);
}
