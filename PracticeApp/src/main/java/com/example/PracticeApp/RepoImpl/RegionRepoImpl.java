/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.PracticeApp.RepoImpl;

import com.example.PracticeApp.Repo.RegionRepo;
import com.example.PracticeApp.bean.RegionBean;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author HP
 */
@Repository
public class RegionRepoImpl implements RegionRepo {

    @Autowired(required = true)
    private JdbcTemplate jdbcTemplate;

    @Override
    public List getAllRegion() {
        String sql = "SELECT region_id,region_name FROM myschema.regions";
        return jdbcTemplate.queryForList(sql);
    }

//    @Override
//    public RegionBean addRegion(RegionBean region) {
//        StringBuilder sql = new StringBuilder();
//        sql.append("INSERT INTO myschema.regions(region_name) VALUES('").append(region.getRegion_name()).append("')");
//        System.out.println("query " + sql.toString());
////        jdbcTemplate.execute(sql.toString());
//        
////        sql.setLength(0);
//////        sql.append("SELECT region_name FROM myschema.regions WHERE region_id IN (SELECT Max(region_id) FROM myschema.regions)");
////        sql.append("SELECT 101 AS region_id, \"TEXT\" AS region_name from dual");
////        RegionBean regionObj = jdbcTemplate.queryForObject(sql.toString(), RegionBean.class);
////        System.out.println("object " + regionObj.toString());
//        return  jdbcTemplate.execute(sql.toString());
//    }
    @Override
    public RegionBean addRegion(RegionBean region) {
        StringBuilder insertSql = new StringBuilder();
        insertSql.append("INSERT INTO myschema.regions(region_name) VALUES('").append(region.getRegion_name()).append("')");
        System.out.println("Insert query: " + insertSql.toString());

        jdbcTemplate.update(insertSql.toString());

        insertSql.setLength(0);
//    StringBuilder selectSql = new StringBuilder();
//    insertSql.append("SELECT * FROM myschema.regions WHERE region_id = LAST_INSERT_ID()");
        insertSql.append("SELECT region_id,region_name FROM myschema.regions WHERE region_id IN (SELECT Max(region_id) FROM myschema.regions)");

        return jdbcTemplate.queryForObject(insertSql.toString(), (rs, rowNum) -> {
            RegionBean regionObj = new RegionBean();
            regionObj.setRegion_id(rs.getInt("region_id"));
            regionObj.setRegion_name(rs.getString("region_name"));
            return regionObj;
        });
    }

//    @Override
//    public void editRegion(int id, RegionBean bean) {
//        StringBuilder query = new StringBuilder();
////        query.append("update myschema.regions SET region_name = \"India\" where region_id=15");
//        query.append("update myschema.regions SET region_name='").append(bean.getRegion_name()).append("'").append(" where region_id=").append(id);
//        jdbcTemplate.execute(query.toString());
//        System.out.println("query data : " + query);
////        return null;
//    }
    
    public RegionBean editRegion(int id, RegionBean bean) {
        String updateSql = "UPDATE myschema.regions SET region_name = ? WHERE region_id = ?";
        jdbcTemplate.update(updateSql, bean.getRegion_name(), id);

        String selectSql = "SELECT * FROM myschema.regions WHERE region_id = ?";
        
        return jdbcTemplate.queryForObject(selectSql, (rs, rowNum) -> {
            RegionBean updatedRegion = new RegionBean();
            updatedRegion.setRegion_id(rs.getInt("region_id"));
            updatedRegion.setRegion_name(rs.getString("region_name"));
            return updatedRegion;
        }, id);
    }

    @Override
    public void deleteRegion(int id) {
        StringBuilder query = new StringBuilder();
        query.append("delete from myschema.regions where region_id=").append(id);
        System.out.println("query is: " + query.toString());
        jdbcTemplate.execute(query.toString());
      }

}
