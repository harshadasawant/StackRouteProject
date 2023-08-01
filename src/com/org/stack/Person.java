package com.org.stack;

public class Person {
 String name;
 int age;

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public int getAge() {
  return age;
 }

 public void setAge(int age) {
  this.age = age;
 }
}
class PersonTest{
 public static void main(String[] args) {
  Person obj = new Person();
 obj.setName("Harshada");
 obj.setAge(20);
  System.out.println(obj.getName()+"  "+obj.getAge());
 }
}
