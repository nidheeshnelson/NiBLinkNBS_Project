package com.nidheeshnelson.niblinknbs.repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSfStateModel;

@Repository
public interface NiBLinkNBSfStateRepository extends JpaRepository<NiBLinkNBSfStateModel, Integer>{
	List<NiBLinkNBSfStateModel> findByCountrycode(String s);
}
