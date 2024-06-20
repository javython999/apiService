package com.study.apiservice;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiController {

    @PostMapping("/api/product/1")
    public String product1(@RequestBody ApiInfo apiInfo) {

        List<ProductVO> productVOList = apiInfo.getApiReqeusts()
                .stream()
                .map(item -> item.getProductVO())
                .toList();
        System.out.println("productVOList = " + productVOList);

        return "product1 was successfully proceed";
    }

    @PostMapping("/api/product/2")
    public String product2(@RequestBody ApiInfo apiInfo) {

        List<ProductVO> productVOList = apiInfo.getApiReqeusts()
                .stream()
                .map(item -> item.getProductVO())
                .toList();
        System.out.println("productVOList = " + productVOList);

        return "product2 was successfully proceed";
    }

    @PostMapping("/api/product/3")
    public String product3(@RequestBody ApiInfo apiInfo) {

        List<ProductVO> productVOList = apiInfo.getApiReqeusts()
                .stream()
                .map(item -> item.getProductVO())
                .toList();
        System.out.println("productVOList = " + productVOList);

        return "product3 was successfully proceed";
    }
}
