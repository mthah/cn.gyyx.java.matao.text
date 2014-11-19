/*------------------------------------------------------------------------- 
* 版权所有：北京光宇在线科技有限责任公司 
* 作者：马涛
* 联系方式：matao@gyyx.cn
* 创建时间： 2014年11月18日 
* 版本号：v1.0 
* 本类主要用途描述： 
* 查询所有用户的信息 ，并进行分页
-------------------------------------------------------------------------*/ 


package cn.gyyx.java.matao.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import cn.gyyx.java.matao.beans.PageInfo;
import cn.gyyx.java.matao.beans.UserInfo;

public class SelectAllUser {
	private SqlSessionFactory sessionFactory= null;
	/**
	 * 主要用来执行分页的sql语句
	 * @param page
	 * @return
	 */
	public List<UserInfo> selectAllUserInfo (int page ) {
		sessionFactory = BuildSqlSessionFactory.getSqlSessionFactory();
		SqlSession session = sessionFactory.openSession();
		List<UserInfo> list = new ArrayList<UserInfo>();
		if(page==0) {
			page=1;
		}
		String statement = "mybatis.user.selectAllUserInfo";
		list=session.selectList(statement, page);
		return list;
		
	}
}
