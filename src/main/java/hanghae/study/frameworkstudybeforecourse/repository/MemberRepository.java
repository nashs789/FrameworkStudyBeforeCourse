package hanghae.study.frameworkstudybeforecourse.repository;

import hanghae.study.frameworkstudybeforecourse.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {

    Optional<Member> findByUserNameAndPw(String userName, String pw);
}
