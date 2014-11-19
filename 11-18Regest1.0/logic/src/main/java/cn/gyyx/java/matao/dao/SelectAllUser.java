/*------------------------------------------------------------------------- 
* 版权所有：北京光宇在线科技有限责任公司 
* 作者：马涛
* 联系方式：matao@gyyx.cn
* 创建时间： 2014年11月18日 
* 版本号：v1.0 
* 本类主要用途描述： 
* 查询所有用户的信息 
-------------------------------------------------------------------------*/ 


package cn.gyyx.java.matao.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import cn.gyyx.java.matao.beans.UserInfo;

public class SelectAllUser {
	private SqlSessionFactory sessionFactory= null;
	
	public List<UserInfo> selectAllUserInfo () {
		sessionFactory = BuildSqlSessionFactory.getSqlSessionFactory();
		SqlSession session = sessionFactory.openSession();
		List<UserInfo> list = new ArrayList<UserInfo>();
		
		return null;
		
	}
}
