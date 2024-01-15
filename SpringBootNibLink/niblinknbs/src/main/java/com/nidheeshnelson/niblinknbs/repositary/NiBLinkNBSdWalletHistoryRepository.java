package com.nidheeshnelson.niblinknbs.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSdWalletHistoryModel;

@Repository
public interface NiBLinkNBSdWalletHistoryRepository extends JpaRepository<NiBLinkNBSdWalletHistoryModel, Integer>{

}
