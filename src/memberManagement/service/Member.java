package memberManagement.service;

import memberManagement.models.MemberDetails;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by sheebanshaikh on 8/9/16.
 */

@Component
public abstract class Member {

    public abstract Boolean addOrUpdateMember(MemberDetails memberDetails);
    public abstract void deleteMember(MemberDetails memberDetails);
    public abstract MemberDetails findMember(Long memberID);
    public abstract List<Member> getMemberDetails();

}
