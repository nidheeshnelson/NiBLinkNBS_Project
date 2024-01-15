package com.nidheeshnelson.niblinknbs.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScIdentityModel;

@Repository
public interface NiBLinkNBScIdentityRepository extends JpaRepository<NiBLinkNBScIdentityModel, Integer>{

}
