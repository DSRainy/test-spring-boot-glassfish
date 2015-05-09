/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.testspringboot.spring.boot.webapp.repositoriy;

import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import th.co.geniustree.testspringboot.spring.boot.webapp.config.WebInitializer;
//import th.co.geniustree.testspringboot.spring.boot.webapp.App;
import th.co.geniustree.testspringboot.spring.boot.webapp.model.Customer;

/**
 *
 * @author anonymous
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = WebInitializer.class)
@IntegrationTest
@Transactional
public class CustomerRepoIT {

    @Autowired
    private CustomerRepository customerRepository;
    public CustomerRepoIT() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void saveCustomerWithId_1_shouldOK() {
        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("Rainy");
        customerRepository.save(customer);
        Customer findOne = customerRepository.findOne(1);
        Assertions.assertThat(findOne).isNotNull();
    }
}
