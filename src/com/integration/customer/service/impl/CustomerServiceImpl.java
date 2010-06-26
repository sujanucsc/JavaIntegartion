package com.integration.customer.service.impl;

import com.integration.customer.service.CustomerService;
import com.integration.customer.model.Customer;
import com.integration.customer.dao.CustomerDao;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: sujan
 * Date: Jun 25, 2010
 * Time: 12:23:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class CustomerServiceImpl implements CustomerService {

    CustomerDao customerDao;

    public void addCustomer(Customer customer) {
        customerDao.addCustomer(customer);
    }

    public List<Customer> findAllCustomer() {
        return customerDao.findAllCustomer();
    }

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }
}
