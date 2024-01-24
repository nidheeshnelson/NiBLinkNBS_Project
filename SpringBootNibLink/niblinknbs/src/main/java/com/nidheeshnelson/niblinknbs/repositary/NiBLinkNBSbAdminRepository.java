package com.nidheeshnelson.niblinknbs.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSbaAdminModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScAddressModel;

@Repository
public interface NiBLinkNBSbAdminRepository extends JpaRepository<NiBLinkNBSbaAdminModel, Integer>{
	@Query("SELECT a FROM NiBLinkNBSbaAdminModel a INNER JOIN FETCH a.namelistid c WHERE c.namelistid = :namelistid")
	NiBLinkNBSbaAdminModel findAdminByNamelistId(@Param("namelistid") String namelistid);
}
