package com.nidheeshnelson.niblinknbs.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSeShiftRequestModel;

@Repository
public interface NiBLinkNBSeShiftRequestRepository extends JpaRepository<NiBLinkNBSeShiftRequestModel, Integer>{

}
