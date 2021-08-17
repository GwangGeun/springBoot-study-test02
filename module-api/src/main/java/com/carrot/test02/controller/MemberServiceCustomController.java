package com.carrot.test02.controller;

import com.carrot.test02.service.MemberServiceCustom;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberServiceCustomController {

    private final MemberServiceCustom memberServiceCustom;

    @GetMapping("/test01")
    public Long getMemberServiceCustom() {
        return memberServiceCustom.signup();
    }
}
