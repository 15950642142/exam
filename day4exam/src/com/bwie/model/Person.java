package com.bwie.model;

public class Person {
		private int id;
		private String name;
		private String sex;
		private int age;
		private String addr;
		private Country cid;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSex() {
			return sex;
		}
		public void setSex(String sex) {
			this.sex = sex;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getAddr() {
			return addr;
		}
		public void setAddr(String addr) {
			this.addr = addr;
		}
		public Country getCid() {
			return cid;
		}
		public void setCid(Country cid) {
			this.cid = cid;
		}
		public Person(int id, String name, String sex, int age, String addr,
				Country cid) {
			super();
			this.id = id;
			this.name = name;
			this.sex = sex;
			this.age = age;
			this.addr = addr;
			this.cid = cid;
		}
		public Person() {
			super();
		}
		public Person(String name, String sex, int age, String addr, Country cid) {
			super();
			this.name = name;
			this.sex = sex;
			this.age = age;
			this.addr = addr;
			this.cid = cid;
		}
		@Override
		public String toString() {
			return "Person [id=" + id + ", name=" + name + ", sex=" + sex
					+ ", age=" + age + ", addr=" + addr + ", cid=" + cid + "]";
		}
		
}
