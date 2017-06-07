package com.zzu.entity;

/**
 * Created by 62599 on 2017/06/04.
 */
public class address {
    private Integer id;
    private String name;
    private String salary;
    private String birthday;

    public address(){
        super();
    }

    public address(Integer id, String name, String salary, String birthday) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.birthday = birthday;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "address{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}
