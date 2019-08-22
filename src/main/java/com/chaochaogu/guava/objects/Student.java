package com.chaochaogu.guava.objects;

import com.google.common.base.Objects;

/**
 * @author Ciwei
 * @date 2019/08/14
 */
public class Student {

    private String firstName;

    private String lastName;

    private int rollNo;

    private String className;

    public Student(String firstName, String lastName, int rollNo, String className) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rollNo = rollNo;
        this.className = className;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return rollNo == student.rollNo &&
                Objects.equal(firstName, student.firstName) &&
                Objects.equal(lastName, student.lastName) &&
                Objects.equal(className, student.className);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(firstName, lastName, rollNo, className);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}