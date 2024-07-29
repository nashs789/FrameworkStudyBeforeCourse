package hanghae.study.frameworkstudybeforecourse.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class Timestamp {

    @CreatedDate
    @Column(name = "REG_AT", updatable = false)
    private LocalDateTime regAt;

    @LastModifiedDate
    @Column(name = "UPT_AT")
    private LocalDateTime uptAt;
}
