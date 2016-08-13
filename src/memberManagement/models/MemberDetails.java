package memberManagement.models;

import memberManagement.service.Member;
import org.hibernate.annotations.CollectionId;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.lang.management.MemoryType;

/**
 * Created by sheebanshaikh on 8/12/16.
 */

@Entity
public class MemberDetails {

    @Id
    @GeneratedValue
    private Long memberId;

    @Column
    private String name;

    @Column
    private MemberType memberType;

    @Column
    private String emailId;

    @Column
    private String password;

    public MemberDetails(String name, String emailId, String password, MemberType memberType) {
        this.name = name;
        this.emailId = emailId;
        this.password = password;
        this.memberType = memberType;
    }

    public MemberDetails(){

    }

    public Long getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public MemberType getDetails() {
        return memberType;
    }
}
