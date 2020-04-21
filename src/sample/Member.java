package sample;

public class Member {

    private String name;
    private static int member_id_tracker = 1;
    private int member_id;
    private String email;
    private int age;

    public Member(String name, int member_id, String email, int age) {
        this.name = name;
        this.member_id = member_id_tracker;
        member_id_tracker++;
        this.email = email;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return member_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", member_id=" + member_id +
                ", email='" + email;
    }

}
