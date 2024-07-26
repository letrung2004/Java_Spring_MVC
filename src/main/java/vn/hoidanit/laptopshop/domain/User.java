package vn.hoidanit.laptopshop.domain;

public class User {
    private String email;
    private String name;
    private long id;
    private String passWord;
    private String address;
    private String phone;

    public User() {

    }

    @Override
    public String toString() {
        return "User [email=" + email + ", name=" + name + ", id=" + id + ", passWord=" + passWord + ", address="
                + address + ", phone=" + phone + ", getEmail()=" + getEmail() + ", getName()=" + getName()
                + ", getId()=" + getId() + ", getPassWord()=" + getPassWord() + ", getAddress()=" + getAddress()
                + ", getPhone()=" + getPhone() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
                + ", toString()=" + super.toString() + "]";
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
