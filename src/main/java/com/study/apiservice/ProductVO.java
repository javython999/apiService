package com.study.apiservice;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductVO {

    public Long id;
    private String name;
    private int price;
    private String type;
}
