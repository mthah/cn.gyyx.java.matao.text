/*------------------------------------------------------------------------- 
* 版权所有：北京光宇在线科技有限责任公司 
* 作者：马涛
* 联系方式：matao@gyyx.cn
* 创建时间： 2014年11月18日 
* 版本号：v1.0 
* 本类主要用途描述： 
* 用来存储用户注册信息 
-------------------------------------------------------------------------*/ 


package cn.gyyx.java.matao.beans;
/**
 * 用户注册信息
 * @author MT
 *
 */
public class UserInfo {
	/**
	 * code 用户标志号
	 * userName 用户姓名
	 * passWord 用户密码
	 */
	private int code;
	private String userName;
	private String password; 
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
