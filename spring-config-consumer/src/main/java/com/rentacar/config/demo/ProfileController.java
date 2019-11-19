package com.rentacar.config.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rentacar.config.demo.model.MemberProfileConfiguration;

@RestController
public class ProfileController {


    @Autowired
    MemberProfileConfiguration memberProfileConfiguration;
    
    @GetMapping("/profile")
    public MemberProfileConfiguration getConfig() {
    	return memberProfileConfiguration;
    }


}
