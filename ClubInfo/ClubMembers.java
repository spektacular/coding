package ClubInfo;

import java.util.ArrayList;

public class ClubMembers {
    private ArrayList<MemberInfo> memberList;

    public ClubMembers() {
        memberList = new ArrayList<MemberInfo>();
    }

    // Question A:
    public void addMembers(String[] names, int gradYear) {
        for (String name : names) {
            this.memberList.add(new MemberInfo(name, gradYear, true));
        }
    }

    public void addMember(MemberInfo mem) {
        memberList.add(mem);
    }

    // Question B:
    public ArrayList<MemberInfo> removeMembers(int year) {
        for (int i = 0; i < this.memberList.size(); i++) {
            if (this.memberList.get(i).getGradYear() <= year
                    && this.memberList.get(i).getHasGoodStanding()) {
                this.memberList.remove(i);
                i--;
            }
        }
        return this.memberList;
    }

    public String toString() {
        return "" + memberList;
    }
}
