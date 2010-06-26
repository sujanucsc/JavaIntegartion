package com.integration.customer.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.integration.customer.dao.CustomerDao;
import com.integration.customer.model.Customer;
import java.util.List;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: sujan
 * Date: Jun 25, 2010
 * Time: 12:25:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class HibernateCustomerDao extends HibernateDaoSupport implements CustomerDao {

    public void addCustomer(Customer customer) {
        customer.setCreationDate(new Date());
        getHibernateTemplate().save(customer);
    }

    public List<Customer> findAllCustomer() {
        return getHibernateTemplate().find("from Customer");
    }

}
