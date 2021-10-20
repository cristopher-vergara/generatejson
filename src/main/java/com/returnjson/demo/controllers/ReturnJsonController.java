package com.returnjson.demo.controllers;

import com.returnjson.demo.dto.Commerce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.returnjson.demo.service.ReturnJsonService;

import java.util.List;

@RestController
@RequestMapping("/return")
public class ReturnJsonController {

    @Autowired
    private ReturnJsonService returnJsonService ;


    @GetMapping(value = "/commerce/{static_qr_id}")
    //public List<Commerce> getCommerceByStatic_qr_id(@PathVariable(value ="static_qr_id") String static_qr_id)
    public Commerce getCommerceByStatic_qr_id(@PathVariable(value ="static_qr_id") String static_qr_id)

    {
       //return  returnJsonService.myListCommerce();
        return returnJsonService.getCommerceByStatic_qr_id(static_qr_id);

    }

}

