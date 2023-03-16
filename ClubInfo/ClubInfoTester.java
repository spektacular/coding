public class ClubInfoTester {
    public static void main(String[] args) {
        MemberInfo a = new MemberInfo("BOB", 2012, false);
        System.out.println(a);
        MemberInfo b = new MemberInfo("APLUS", 2020, true);
        MemberInfo c = new MemberInfo("APLUS2", 2021, false);

        String[] names = "JANE STEVE MICHAEL MARIA".split(" ");
        ClubMembers cm = new ClubMembers();
        cm.addMembers(names, 2015);
        cm.addMember(a);
        cm.addMember(b);
        cm.addMember(c);
        System.out.println(cm);

        System.out.println(cm.removeMembers(2017));
        System.out.println(cm);
    }
}
