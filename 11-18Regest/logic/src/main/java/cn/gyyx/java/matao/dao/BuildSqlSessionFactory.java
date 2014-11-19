/*------------------------------------------------------------------------- 
* 版权所有：北京光宇在线科技有限责任公司 
* 作者：马涛
* 联系方式：matao@gyyx.cn
* 创建时间： 2014年11月18日 
* 版本号：v1.0 
* 本类主要用途描述： 
* 新建SqlSessionFaction
-------------------------------------------------------------------------*/ 


package cn.gyyx.java.matao.dao;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class BuildSqlSessionFactory {
	private static SqlSessionFactory factory = null;
	
	private BuildSqlSessionFactory () {
		
	}
	/**
	 * 新建SqlSessionFactory
	 * @return
	 */
	public static SqlSessionFactory getSqlSessionFactory () {
		if( factory==null ) {
			try {
				String resource = "mybatis/config.xml";
				Reader reader = Resources.getResourceAsReader(resource);
				SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
				factory = sessionFactory;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return factory;
	}
	
}
