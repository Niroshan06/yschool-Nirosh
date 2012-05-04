/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myschoo_lmini_niroshan;

/**
 *
 * @author Niroshan
 */
public class StudentDetails {
    private String stuName;
    private String grade;
    private String subject;
    private int marks;

    /**
     * @return the stuName
     */
    public String getStuName() {
        return stuName;
    }

    /**
     * @param stuName the stuName to set
     */
    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    /**
     * @return the grade
     */
    public String getGrade() {
        return grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * @return the subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * @param subject the subject to set
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * @return the marks
     */
    public int getMarks() {
        return marks;
    }

    /**
     * @param marks the marks to set
     */
    public void setMarks(int marks) {
        this.marks = marks;
    }
}
