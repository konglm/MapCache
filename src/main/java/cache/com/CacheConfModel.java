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
/**
 * 缓存属性类
 * @author Administrator
 *
 */
public class CacheConfModel implements java.io.Serializable{
	
	 private long beginTime;//缓存开始时间
	 private boolean isForever = false;//是否持久
	 private int durableTime;//持续时间
	 
	 public long getBeginTime() {
		  return beginTime;
		 }
		 public void setBeginTime(long beginTime) {
		  this.beginTime = beginTime;
		 }
		 public boolean isForever() {
		  return isForever;
		 }
		 public void setForever(boolean isForever) {
		  this.isForever = isForever;
		 }
		 public int getDurableTime() {
		  return durableTime;
		 }
		 public void setDurableTime(int durableTime) {
		  this.durableTime = durableTime;
		 }
 
}

