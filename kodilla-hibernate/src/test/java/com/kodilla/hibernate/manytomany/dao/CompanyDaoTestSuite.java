package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith (SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    CompanyDao companyDao;

    @Test
    public void testSaveManyToMany(){
        //Given
        Employee johnSmith = new Employee ("John", "Smith");
        Employee stephanieClarckson = new Employee ("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee ("Linda", "Kovalsky");

        Company softwareMachine = new Company ("Software Machine");
        Company dataMaesters = new Company ("Data Maesters");
        Company greymatter = new Company ("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greymatter.getEmployees().add(johnSmith);
        greymatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greymatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greymatter);
        //When
        companyDao.save(softwareMachine);
        int softwareMachineIdID = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greymatter);
        int greymatterId = greymatter.getId();
        //Then
        Assert.assertNotEquals(0, softwareMachineIdID);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greymatterId);
        //CleanUp
        //try{
        //  companyDao.deleteById(softwareMachineIdID);
        //  companyDao.deleteById(dataMaestersId);
        //  companyDao.deleteById(greymatterId);
        //} catch (Exception e){
        // //do  nothing
        //}
    }
}
