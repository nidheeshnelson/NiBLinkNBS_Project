package com.nidheeshnelson.niblinknbs.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScPersonalModel;

@Repository
public interface NiBLinkNBScPersonalRepository extends JpaRepository<NiBLinkNBScPersonalModel, Integer>{
	@Query("SELECT a FROM NiBLinkNBScPersonalModel a INNER JOIN FETCH a.namelistid c WHERE c.namelistid = :namelistid")
	NiBLinkNBScPersonalModel findByNamelistId(@Param("namelistid") String namelistid);
}
