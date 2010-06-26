package com.integration.customer.web.form;

import org.apache.struts.action.ActionForm;

/**
 * Created by IntelliJ IDEA.
 * User: sujan
 * Date: Jun 25, 2010
 * Time: 6:54:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class CustomerForm extends ActionForm {

    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
