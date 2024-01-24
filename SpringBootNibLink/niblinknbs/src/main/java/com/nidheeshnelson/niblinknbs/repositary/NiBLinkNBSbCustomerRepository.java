package com.nidheeshnelson.niblinknbs.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSbcCustomerModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScAddressModel;

@Repository
public interface NiBLinkNBSbCustomerRepository extends JpaRepository<NiBLinkNBSbcCustomerModel, Integer>{
	@Query("SELECT a FROM NiBLinkNBSbcCustomerModel a INNER JOIN FETCH a.namelistid c WHERE c.namelistid = :namelistid")
	NiBLinkNBSbcCustomerModel findCustomerByNamelistId(@Param("namelistid") String namelistid);
}
