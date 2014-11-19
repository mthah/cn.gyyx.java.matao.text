/*------------------------------------------------------------------------- 
* 版权所有：北京光宇在线科技有限责任公司 
* 作者：马涛
* 联系方式：matao@gyyx.cn
* 创建时间： 2014年11月19日 
* 版本号：v1.0 
* 本类主要用途描述： 
* pageing 1.0 之前 木有用上啊！！ 
-------------------------------------------------------------------------*/ 


package cn.gyyx.java.matao.beans;

public class PageInfo {
	private int sumNum;
	private int nowPage;
	
	public int getSumNum() {
		return sumNum;
	}
	public void setSumNum(int sumNum) {
		this.sumNum = sumNum;
	}
	public int getNowPage() {
		return nowPage;
	}
	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}
	
	
}
