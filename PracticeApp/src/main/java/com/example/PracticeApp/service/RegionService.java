/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.PracticeApp.service;

import com.example.PracticeApp.bean.RegionBean;
import java.util.List;

/**
 *
 * @author HP
 */
public interface RegionService {

    public List getAllRegion();

    public RegionBean addRegion(RegionBean region);

//    public void editRegion(int id, RegionBean bean);
    public RegionBean editRegion(int id, RegionBean bean);

    public void deleteRegion(int id);
}
