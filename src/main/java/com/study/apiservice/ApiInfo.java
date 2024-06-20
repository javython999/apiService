package com.study.apiservice;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ApiInfo {

    private int status;
    private List<? extends ApiReqeustVO> apiReqeusts;
}
