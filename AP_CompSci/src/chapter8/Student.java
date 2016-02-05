package chapter8;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {

	 public double wage;
	 public double hours;
	 public String name;
	 public double salary;
	
	 public Student(String name, double wage, double hours){
		 this.name = name;
		 this.wage = wage;
		 this.hours = hours;
		 this.salary = wage*hours;
	 }
	
	public double getFedTax(){
			
	if(this.salary >413201){
		return 119996.25 + 0.396*(this.salary-413200);}
	else if(this.salary >411501){
		return 119401.25 + 0.35*(this.salary-411500);}
	else if(this.salary >189301){
		return 46075.25 + 0.33*(this.salary-189300);}
	else if(this.salary >90751){
		return 18481.25 + 0.28*(this.salary-90750);}
	else if(this.salary >37451){
		return 5156.25 + 0.25*(this.salary-37450);}
	else if(this.salary >9226){
		return 922.50 + 0.15*(this.salary-9225);}
	else if(this.salary >0){
		return 0.1*(this.salary);}
	return 0;
	
	}
	
	public double getSSTax(){
		if(this.salary>118500){
			return 0.062*118500;
		}
		else{
			return 0.062*this.salary;
		}
	}


}
