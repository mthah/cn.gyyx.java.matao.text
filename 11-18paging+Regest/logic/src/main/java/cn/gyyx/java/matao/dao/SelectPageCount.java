/*------------------------------------------------------------------------- 
* 版权所有：北京光宇在线科技有限责任公司 
* 作者：马涛
* 联系方式：matao@gyyx.cn
* 创建时间： 2014年11月19日 
* 版本号：v1.0 
* 本类主要用途描述： 
* 用来计算数据库中的最大页，并把页数存到list中
-------------------------------------------------------------------------*/ 


package cn.gyyx.java.matao.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class SelectPageCount {
	private SqlSessionFactory sessionFactory= null;
	
	/**
	 * 把页数分别存在list中
	 * @param page
	 * @return
	 */
	/*奇葩的功能，但是不把它装到list中，没办法在页面中通过JSTL在页面中一个一个显示*/
	public List<Integer> pageCount( int page ) {
		List<Integer> list = new ArrayList<Integer> ();
		for (int i=1 ; i<=page ; i++){
			list.add( i );
		}
		
		return list;
	}
	/**
	 * 用来计算总共有多少页
	 * @return
	 */
	public int SelectMaxPage () {
		sessionFactory = BuildSqlSessionFactory.getSqlSessionFactory();
		SqlSession session = sessionFactory.openSession();
		String statement = "mybatis.user.selectPageCount";
		int temp =session.selectOne(statement);
		int pageCount=0;
		if( temp%10==0 ){
			pageCount = temp;
		}else {
			pageCount = temp/10 + 1;
		}
		
		return pageCount;
		
	}
}
