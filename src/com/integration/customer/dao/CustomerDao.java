package com.integration.customer.dao;

import com.integration.customer.model.Customer;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: sujan
 * Date: Jun 25, 2010
 * Time: 12:25:34 PM
 * To change this template use File | Settings | File Templates.
 */
public interface CustomerDao {

    void addCustomer(Customer customer);

    List<Customer> findAllCustomer();

}
