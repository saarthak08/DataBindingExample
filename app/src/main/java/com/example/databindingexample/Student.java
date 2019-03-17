package com.example.databindingexample;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class Student extends BaseObservable {

    public Student(String studentName, String studentEmail) {
        this.studentName = studentName;
        this.studentEmail = studentEmail;
    }

    public Student() {
    }

    private String studentName;
    private String studentEmail;

    @Bindable
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
        notifyPropertyChanged(BR.studentName);
    }

    @Bindable
    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
        notifyPropertyChanged(BR.studentEmail);
    }
}
