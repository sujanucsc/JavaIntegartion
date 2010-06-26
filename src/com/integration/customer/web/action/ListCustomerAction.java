package com.integration.customer.web.action;

import org.springframework.web.struts.ActionSupport;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.DynaActionForm;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.integration.customer.service.CustomerService;
import com.integration.customer.model.Customer;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: sujan
 * Date: Jun 25, 2010
 * Time: 6:53:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class ListCustomerAction extends ActionSupport {
    public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

        CustomerService customerService = (CustomerService) getWebApplicationContext().getBean("customerService");

        DynaActionForm dynaActionForm = (DynaActionForm) actionForm;

        List<Customer> customerList = customerService.findAllCustomer();

        dynaActionForm.set("customerList", customerList);

        return actionMapping.findForward("success");
    }
}
