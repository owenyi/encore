package com.encore.child;

import com.encore.parent.Employee;
import com.encore.util.MyDate;

/*
 * 부모 클래스 Employee로부터 모든 것을 물려받고
 * 자기자신만의 멤버를 추가하는 자식 클래스...
 * 
 * 생성자 호출, 객체가 생성될 때
 */
public class Manager extends Employee{
	
	// 자신만의 멤버를 추가
	private String dept;
	
	public Manager(String name, MyDate birthDay, double salary, String dept) { 
//		this.name = name;
//		this.birthDay = birthDay;
//		this.salary = salary;
		super(name, birthDay, salary);
		this.dept = dept;
	}

	//Method Overriding
	/*
	 * 상속관계에서만 일어난다.
	 * 1step : 부모가 가진 기능을 물려받는다...호출한다
	 * 2step : 그걸 자신에 맞게 고쳐쓴다.
	 * 
	 * Overriding의 Rule
	 * 0. 상속관계의 두 클래스 간에 일어나야 한다
	 * 1. 메소드 선언부는 모두 일치해야 한다
	 * 2. 구현부는 반드시 달라야 한다
	 * --> 하는 일이 달라졌음으로 새로운 메소드가 만들어졌다.
	 *     메소드 재정의
	 */
//	public String getDetails() {
//		return name + ", " + birthDay.getDate() + ", " + salary + ", " + dept;
//	}
	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return super.getDetails() +  ", " + dept;
	}
}
