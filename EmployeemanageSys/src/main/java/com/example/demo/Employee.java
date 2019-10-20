package com.example.demo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@Entity
public class Employee implements Serializable

{
private static final long SerialVersionUid= 1L;
@Id
private int eid;
private String ename;
private String  etech;
private float Esalary;
public float getEsalary() {
	return Esalary;
}
public void setEsalary(float esalary) {
	Esalary = esalary;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getEtech() {
	return etech;
}
public void setEtech(String etech) {
	this.etech = etech;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", etech=" + etech + "]";
}

}
