package com.nidheeshnelson.niblinknbs.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSfCountryModel;

@Repository
public interface NiBLinkNBSfCountryRepository extends JpaRepository<NiBLinkNBSfCountryModel, Integer>{

}
