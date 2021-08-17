package com.carrot.test02.service;

import com.carrot.test02.Member;
import com.carrot.test02.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceCustom {

    private final MemberRepository memberRepository;

    public Long signup () {
        Member member = memberRepository.save(new Member("name", "xxx@gmail.com"));
        return member.getId();
    }
}
