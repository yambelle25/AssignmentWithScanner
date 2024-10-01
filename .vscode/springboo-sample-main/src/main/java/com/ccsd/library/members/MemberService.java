package com.ccsd.library.members;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberService {
    
    @Autowired
    private MemberRepository memberRepository;

    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }

    public Optional<Member> getMemberById(String id) {
        return memberRepository.findById(id);
    }

    public Member addMember(Member member) {
        return memberRepository.save(member);
    }

    public Member updateMember(String id, Member memberDetails) {
        Optional<Member> memberOpt = memberRepository.findById(id);
        if (memberOpt.isPresent()) {
            Member member = memberOpt.get();
            member.setName(memberDetails.getName());
            member.setBorrowedBooks(memberDetails.getBorrowedBooks());
            return memberRepository.save(member);
        }
        return null;
    }

    public void deleteMember(String id) {
        memberRepository.deleteById(id);
    }
}
