package com.excel.spring.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
private String name;
private List<String> phones;
private Set<String> skills;
private Map<String, String> nominees;


@Override
public String toString() {
	return "Employee [name=" + name + ", phones=" + phones + ", skills=" + skills + ", nominees=" + nominees + "]";
}

public Employee() {
	
}

public Employee(String name, List<String> phones, Set<String> skills, Map<String, String> nominees) {
	super();
	this.name = name;
	this.phones = phones;
	this.skills = skills;
	this.nominees = nominees;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<String> getPhones() {
	return phones;
}
public void setPhones(List<String> phones) {
	this.phones = phones;
}
public Set<String> getSkills() {
	return skills;
}
public void setSkills(Set<String> skills) {
	this.skills = skills;
}
public Map<String, String> getNominees() {
	return nominees;
}
public void setNominees(Map<String, String> nominees) {
	this.nominees = nominees;
}
}
