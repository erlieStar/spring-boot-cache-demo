package com.javashitang.service;

import com.javashitang.util.ThreadLocalUtil;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @Author lilimin
 * @Date 2022/5/16
 */
@Service
public class IndexService {

    public String index() {
        if (Objects.equals(ThreadLocalUtil.getPath(), "com.javashitang.service.IndexService.index")) {
            return "test";
        }
        return "before";
    }
}
