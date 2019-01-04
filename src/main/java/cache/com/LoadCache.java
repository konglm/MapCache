/*----------------------------------------------------------------
 *  Copyright (C) 2017山东金视野教育科技股份有限公司
 * 版权所有。 
 *
 * 文件名：
 * 文件功能描述：
 *
 * 
 * 创建标识：
 *
 * 修改标识：
 * 修改描述：
 *----------------------------------------------------------------*/

package cache.com;


import java.util.Date;
import javax.servlet.http.HttpServlet;
 
import cache.com.CacheConfModel;
import cache.com.CacheMgr;
/**
 * 项目启动时默认加载缓存数据类
 * @author Administrator
 */
public class LoadCache extends HttpServlet{
	
 
	public void init(){
		addData();
	}
	
	/**
	 * 项目启动时加载缓存
	 */
	public void addData(){
		System.out.println("进入加载缓存addData()………………。");
		CacheMgr cm=CacheMgr.getInstance();
		CacheConfModel cModel=new CacheConfModel();
		Date d=new Date();
		cModel.setBeginTime(d.getTime());
		cModel.setDurableTime(60);
		cModel.setForever(true);
		cm.addCache("kk", "123", cModel);//在缓存加值
	}

}
