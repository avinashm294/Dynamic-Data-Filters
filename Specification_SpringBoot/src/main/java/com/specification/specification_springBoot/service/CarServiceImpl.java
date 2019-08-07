package com.specification.specification_springBoot.service;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import com.specification.specification_springBoot.UIWrapper.UIWrapper;
import com.specification.specification_springBoot.datafilter.UIParam;

@Component
public class CarServiceImpl {

    public UIWrapper filterAll(UIParam uiParam){
    
        System.err.println("uiParam.getUbFilter().getUbFilterDetails()"+uiParam.getUbFilter().getUbFilterDetails());
        
        return null;
        
    }
}
