package com.nidheeshnelson.niblinknbs.repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScAddressModel;

@Repository
public interface NiBLinkNBScAddressRepository extends JpaRepository<NiBLinkNBScAddressModel, Integer>{
	@Query("SELECT a FROM NiBLinkNBScAddressModel a INNER JOIN FETCH a.namelistid c WHERE c.namelistid = :namelistid")
	NiBLinkNBScAddressModel findAddressByNamelistId(@Param("namelistid") String namelistid);
}
