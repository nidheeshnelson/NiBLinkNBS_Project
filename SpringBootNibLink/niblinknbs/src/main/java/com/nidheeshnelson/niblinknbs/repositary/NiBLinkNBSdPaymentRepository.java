package com.nidheeshnelson.niblinknbs.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSdPayedModel;

@Repository
public interface NiBLinkNBSdPaymentRepository extends JpaRepository<NiBLinkNBSdPayedModel, Integer>{

}
