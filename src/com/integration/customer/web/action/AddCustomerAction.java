package com.integration.customer.web.action;

import org.springframework.web.struts.ActionSupport;
import org.springframework.beans.BeanUtils;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForm;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.integration.customer.service.CustomerService;
import com.integration.customer.web.form.CustomerForm;
import com.integration.customer.model.Customer;

/**
 * Created by IntelliJ IDEA.
 * User: sujan
 * Date: Jun 25, 2010
 * Time: 6:53:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class AddCustomerAction extends ActionSupport {


    public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest,
                                 HttpServletResponse httpServletResponse) throws Exception {

        CustomerService customerService = (CustomerService) getWebApplicationContext().getBean("customerService");

        CustomerForm customerForm = (CustomerForm) actionForm;
        Customer customer = new Customer();
        customer.setAddress(customerForm.getAddress());
        customer.setName(customerForm.getName());

        customerService.addCustomer(customer);

        return actionMapping.findForward("success");
        

    }
}
