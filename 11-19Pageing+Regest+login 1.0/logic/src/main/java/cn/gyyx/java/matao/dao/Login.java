/*------------------------------------------------------------------------- 
* 版权所有：北京光宇在线科技有限责任公司 
* 作者：马涛
* 联系方式：matao@gyyx.cn
* 创建时间： 2014年11月19日 
* 版本号：v1.0 
* 本类主要用途描述： 
* 用户登录
-------------------------------------------------------------------------*/ 


package cn.gyyx.java.matao.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import cn.gyyx.java.matao.beans.UserInfo;

public class Login {
	private SqlSessionFactory sessionFactory = null;
	
	public Integer userLongin ( UserInfo userInfo ) {
		sessionFactory = BuildSqlSessionFactory.getSqlSessionFactory();
		SqlSession session = sessionFactory.openSession();
		String statement = "mybatis.user.userLogin";
		Integer code=session.selectOne(statement, userInfo);
		return code;
	}

}
