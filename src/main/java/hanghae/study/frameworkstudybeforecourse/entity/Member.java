package hanghae.study.frameworkstudybeforecourse.entity;

import hanghae.study.frameworkstudybeforecourse.enums.Grade;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Member extends Timestamp{

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String pw;

    @Column(nullable = false)
    private Grade grade;
}
