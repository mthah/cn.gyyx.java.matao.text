/*------------------------------------------------------------------------- 
* 版权所有：北京光宇在线科技有限责任公司 
* 作者：马涛
* 联系方式：matao@gyyx.cn 
* 创建时间： 2014年11月18日
* 版本号：v1.0 
* 本类主要用途描述： 
* xxxxxxxxxxxxxxxxxxxxxx 
-------------------------------------------------------------------------*/ 

package cn.gyyx.m;

public class UserBean {
	private int age;
	private String name ;
	private String sex;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
	
	@Override
	public String toString () {
		return "******" + name + "****" + age + "****" + sex ;
	}
	
}
