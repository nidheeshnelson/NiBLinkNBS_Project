package com.nidheeshnelson.niblinknbs.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScWalletModel;

@Repository
public interface NiBLinkNBScWalletRepository extends JpaRepository<NiBLinkNBScWalletModel, Integer>{
	@Query("SELECT a FROM NiBLinkNBScWalletModel a INNER JOIN FETCH a.namelistid c WHERE c.namelistid = :namelistid")
	NiBLinkNBScWalletModel findByNamelistId(@Param("namelistid") String namelistid);
}
