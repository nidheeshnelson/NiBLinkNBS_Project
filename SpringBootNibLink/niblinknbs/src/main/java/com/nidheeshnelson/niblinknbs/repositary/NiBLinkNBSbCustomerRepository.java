package com.nidheeshnelson.niblinknbs.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSbCustomerModel;

@Repository
public interface NiBLinkNBSbCustomerRepository extends JpaRepository<NiBLinkNBSbCustomerModel, Integer>{

}
