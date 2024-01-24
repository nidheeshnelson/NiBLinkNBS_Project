package com.nidheeshnelson.niblinknbs.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScAddressModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScIdentityModel;

@Repository
public interface NiBLinkNBScIdentityRepository extends JpaRepository<NiBLinkNBScIdentityModel, Integer>{
	@Query("SELECT a FROM NiBLinkNBScIdentityModel a INNER JOIN FETCH a.namelistid c WHERE c.namelistid = :namelistid")
	NiBLinkNBScIdentityModel findByNamelistId(@Param("namelistid") String namelistid);
}
