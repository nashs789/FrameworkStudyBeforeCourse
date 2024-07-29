package hanghae.study.frameworkstudybeforecourse.entity;

import hanghae.study.frameworkstudybeforecourse.enums.Grade;
import jakarta.persistence.*;
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
    private String userName;

    @Column(nullable = false)
    private String pw;

    @Enumerated(EnumType.STRING)
    private Grade grade;
}
