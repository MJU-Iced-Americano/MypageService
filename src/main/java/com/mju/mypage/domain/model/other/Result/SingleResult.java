package com.mju.mypage.domain.model.other.Result;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SingleResult<T> extends CommonResult{
    private T data;
}