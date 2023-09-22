/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.PracticeApp.serviceImpl;

import com.example.PracticeApp.Repo.RegionRepo;
import com.example.PracticeApp.bean.RegionBean;
import com.example.PracticeApp.service.RegionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author HP
 */
@Service
public class RegionServiceImpl implements RegionService {

    @Autowired
    private RegionRepo regionRepo;

    @Override
    public List getAllRegion() {
        return regionRepo.getAllRegion();
    }

    @Override
    public RegionBean addRegion(RegionBean region) {
        return regionRepo.addRegion(region);
    }

//    @Override
//    public void editRegion(int id, RegionBean bean) {
//         regionRepo.editRegion(id,bean);
//    }

    @Override
    public void deleteRegion(int id) {
        regionRepo.deleteRegion(id);
    }

    @Override
    public RegionBean editRegion(int id, RegionBean bean) {
       return regionRepo.editRegion(id, bean);
    }

}
