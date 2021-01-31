package com.huynhbaoloc.controller;


import com.huynhbaoloc.entity.Customer;
import com.huynhbaoloc.service.ICustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller

public class CustomerController {
    private static final Logger LOG = LoggerFactory.getLogger(CustomerController.class);
    @Autowired
    private ICustomerService iCustomerService;

    @RequestMapping(value = "/customer/list", method = RequestMethod.GET)
    public ModelAndView showList(){
        ModelAndView mav = new ModelAndView("list-customers");
        List<Customer> listCustomer = iCustomerService.getCustomer();
        mav.addObject("listCustomer",listCustomer);
        return mav;
    }

}
