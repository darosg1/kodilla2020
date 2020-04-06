package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith (SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

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
        try{
          companyDao.deleteById(softwareMachineIdID);
          companyDao.deleteById(dataMaestersId);
          companyDao.deleteById(greymatterId);
        } catch (Exception e){
        //do  nothing
        }
    }
    @Test
    public void testRetrieveEmployeesByLastname(){
        //Given
        Employee johnSmith = new Employee ("John", "Smith");
        Employee stephanieClarckson = new Employee ("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee ("Linda", "Kovalsky");

        employeeDao.save(johnSmith);
        int nameId = johnSmith.getId();
        employeeDao.save(stephanieClarckson);
        int name2Id = stephanieClarckson.getId();
        employeeDao.save(lindaKovalsky);
        int name3Id = lindaKovalsky.getId();
        //When
        List<Employee> employees = employeeDao.retrieveEmployeesByLastname ("CLARCKSON");
        //Then
        Assert.assertEquals ( 1, employees.size());
        //CleanUp
        employeeDao.deleteById(nameId);
        employeeDao.deleteById(name2Id);
        employeeDao.deleteById(name3Id);
    }
    @Test
    public void testRetrieveCompaniesThreeLettersEqualsTo(){
        //Given
        Company softwareMachine = new Company ("Software Machine");
        Company dataMaesters = new Company ("Data Maesters");
        Company greymatter = new Company ("Grey Matter");

        companyDao.save(softwareMachine);
        int companyId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int company2Id = dataMaesters.getId();
        companyDao.save(greymatter);
        int company3Id = greymatter.getId();
        //When
        List<Company> companies = companyDao.retrieveCompaniesThreeLettersEqualsTo ("Dat");
        //Then
        Assert.assertEquals(1, companies.size());
        //CleanUp
        companyDao.deleteById (companyId);
        companyDao.deleteById (company2Id);
        companyDao.deleteById (company3Id);
    }
}
