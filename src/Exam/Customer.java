package Exam;

public class Customer {
    private String name;
    private boolean member;
    private String memberType;

    public Customer() {
        this.member = false;
    }

    public Customer(String name){
        this.name = name;
    }

    public Customer(String name, boolean member, String memberType) {
        this.name = name;
        this.member = member;
        this.memberType = memberType;
    }

    public String getName() {
        return name;
    }

    public boolean isMember() {
        return member;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", member=" + member +
                ", memberType='" + memberType + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Customer customer = new Customer("Murodali",true,null);
        System.out.println(customer);
    }
}
