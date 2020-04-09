package com.product.web;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.model.ProductEntity;
import com.product.service.ProductService;

 
@RestController
@RequestMapping("/api")
public class ProductController
{
    @Autowired
    ProductService service;
 
    @GetMapping("/getproductdetails")
    public ResponseEntity<List<ProductEntity>> getAllProducts() {
        List<ProductEntity> list = service.getAllProducts();
 
        return new ResponseEntity<List<ProductEntity>>(list, new HttpHeaders(), HttpStatus.OK);
    }
 // Properties section
    @Value("${server.port}")
    private String serverPort;
    @Value("${spring.application.name}")
    private String applicationName;
    @Value("${spring.datasource.url}")
    private String dataSourceURL;
    @Value("${spring.jpa.database-platform}")
    private String dielect;
    @Value("${spring.h2.console.path}")
    private String h2Path;
    
    @GetMapping("/getconfigdetails")  
    public ResponseEntity<Map<String, String>> getConfigDetails() {
    	Map<String, String> configDetails= new HashMap<String, String>();
        configDetails.put("serverPort",serverPort);
        configDetails.put("applicationName",applicationName);
        configDetails.put("dataSourceURL",dataSourceURL);
        configDetails.put("dielect",dielect);
        configDetails.put("h2Path",h2Path);
        return new ResponseEntity<Map<String, String>>(configDetails, new HttpHeaders(), HttpStatus.OK);
    }
 
}