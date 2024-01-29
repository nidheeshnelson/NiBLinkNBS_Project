package com.nidheeshnelson.niblinknbs.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScWalletModel;

@Repository
public interface NiBLinkNBScWalletRepository extends JpaRepository<NiBLinkNBScWalletModel, String>{
	NiBLinkNBScWalletModel findByWalletid (String s);
}
