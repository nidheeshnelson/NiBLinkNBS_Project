package com.nidheeshnelson.niblinknbs.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScAddressModel;

@Repository
public interface NiBLinkNBScAddressRepository extends JpaRepository<NiBLinkNBScAddressModel, String>{
	NiBLinkNBScAddressModel findByAddressid(String s);
}
