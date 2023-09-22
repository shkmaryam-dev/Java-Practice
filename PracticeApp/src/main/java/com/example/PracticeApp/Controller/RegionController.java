/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.PracticeApp.Controller;

import com.example.PracticeApp.bean.RegionBean;
import com.example.PracticeApp.service.RegionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author HP
 */
@RestController
public class RegionController {

    @Autowired
    private RegionService regionService;

    @GetMapping("/getAllRegion")
    public ResponseEntity<List> getAllRegion() {
        return ResponseEntity.ok(regionService.getAllRegion());
    }

//    @PostMapping("addRegion")
//    public void addRegion(@RequestBody RegionBean region){
//        System.out.println(region.toString());
//        regionService.addRegion(region);
//    }
    @PostMapping("addRegion")
    public ResponseEntity<RegionBean> addRegion(@RequestBody RegionBean region) {
        RegionBean addedRegion = regionService.addRegion(region);
        if (addedRegion != null) {
            return ResponseEntity.status(HttpStatus.CREATED).body(addedRegion);
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    
//    @PutMapping("/editRegion")
//    public void editRegion(@RequestParam("region_id") int region_id, @RequestBody RegionBean bean){
//        regionService.editRegion(region_id, bean);
//        System.out.println("output : " + bean.toString());
////        return null;
//    }
    
    @PutMapping("editRegion")
    public ResponseEntity<RegionBean> editRegion(@RequestParam("id") int id, @RequestBody RegionBean regionBean) {
        RegionBean editRegion = regionService.editRegion(id, regionBean);
        if (editRegion != null) {
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(editRegion);
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    
    @DeleteMapping("deleteRegion")
    public void deleteRegion(@RequestParam("id") int id){
        regionService.deleteRegion(id);
    }

}
