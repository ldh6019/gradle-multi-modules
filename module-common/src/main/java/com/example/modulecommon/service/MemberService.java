package com.example.modulecommon.service;

import com.example.modulecommon.domain.Member;
import com.example.modulecommon.repository.MemberRepository;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    private MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Long signup(Member member) {
        return memberRepository.save(member).getId();
    }
}
