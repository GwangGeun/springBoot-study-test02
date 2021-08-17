package com.carrot.test02;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceCustom {

    private final MemberRepository memberRepository;

    public Long signup (Member member) {
        return memberRepository.save(member).getId();
    }
}
