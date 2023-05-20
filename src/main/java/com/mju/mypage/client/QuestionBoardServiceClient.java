package com.mju.mypage.client;

import com.mju.mypage.domain.model.other.Result.SingleResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@FeignClient(name = "board-service")
public interface QuestionBoardServiceClient {
    @GetMapping("/board-service/question/show/request/{questionIndex}")
    SingleResult findById(@PathVariable("questionIndex") long questionIndex);

}
