package com.carrot.test02;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.hamcrest.MatcherAssert.assertThat;

@DataJpaTest
class MemberRepositoryTest {

	@Autowired
	private MemberRepository memberRepository;

	@Test
	public void add () {
		memberRepository.save(new Member("name", "xxx@gmail.com"));
		Optional<Member> optionalMember = memberRepository.findById(1L);
		Member member = optionalMember.get();

		Assertions.assertThat(member.getName()).isEqualTo("name");

	}

}
