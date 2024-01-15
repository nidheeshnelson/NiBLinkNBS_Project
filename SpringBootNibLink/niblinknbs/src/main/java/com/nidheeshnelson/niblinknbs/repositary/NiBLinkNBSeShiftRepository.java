package com.nidheeshnelson.niblinknbs.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSeShiftModel;

@Repository
public interface NiBLinkNBSeShiftRepository extends JpaRepository<NiBLinkNBSeShiftModel, Integer>{

}
