package com.nidheeshnelson.niblinknbs.repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSfDistrictModel;

@Repository
public interface NiBLinkNBSfDistrictRepository extends JpaRepository<NiBLinkNBSfDistrictModel, Integer>{
	List<NiBLinkNBSfDistrictModel> findByStatecode(String s);
}
