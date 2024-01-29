package com.nidheeshnelson.niblinknbs.repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSfThalukModel;

@Repository
public interface NiBLinkNBSfThalukRepository extends JpaRepository<NiBLinkNBSfThalukModel, Integer>{
	List<NiBLinkNBSfThalukModel> findByDistrictcode(String s);
}
