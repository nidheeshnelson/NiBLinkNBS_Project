package com.nidheeshnelson.niblinknbs.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSbcCustomerModel;

@Repository
public interface NiBLinkNBSbCustomerRepository extends JpaRepository<NiBLinkNBSbcCustomerModel, String>{

}
