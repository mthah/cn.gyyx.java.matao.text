/*------------------------------------------------------------------------- 
* 版权所有：北京光宇在线科技有限责任公司 
* 作者：马涛
* 联系方式：matao@gyyx.cn
* 创建时间： 2014年11月18日 
* 版本号：v1.0 
* 本类主要用途描述： 
* 执行sql语句
-------------------------------------------------------------------------*/ 


package cn.gyyx.java.matao.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import cn.gyyx.java.matao.beans.UserInfo;

public class RegesterUser {
	private SqlSessionFactory sessionFactory= null;
	/**
	 * 执行sql语句
	 * @param userInfo
	 * @return
	 */
	public String regesterUserInfo ( UserInfo userInfo ) {
		sessionFactory = BuildSqlSessionFactory.getSqlSessionFactory();
		SqlSession session = sessionFactory.openSession();
		String statement ="mybatis.user.regesterUser";
		int flag = session.insert(statement, userInfo);
/*		IUser userDao = session.getMapper(IUser.class); 
		String flag = userDao.regesterUser( userInfo );
	//Invalid bound statement (not found): cn.gyyx.java.matao.dao.IUser.regesterUser] with root cause
		
		return flag;*/
		session.commit();
		return Integer.toString(flag);
		
	}
}
