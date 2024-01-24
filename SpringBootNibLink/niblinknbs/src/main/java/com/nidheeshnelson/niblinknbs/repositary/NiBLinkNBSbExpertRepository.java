package com.nidheeshnelson.niblinknbs.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSbbExpertModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScAddressModel;

@Repository
public interface NiBLinkNBSbExpertRepository extends JpaRepository<NiBLinkNBSbbExpertModel, Integer>{
	@Query("SELECT a FROM NiBLinkNBSbbExpertModel a INNER JOIN FETCH a.namelistid c WHERE c.namelistid = :namelistid")
	NiBLinkNBSbbExpertModel findByNamelistId(@Param("namelistid") String namelistid);
}
