package cn.sxt.shop.service;

import java.util.List;

import cn.sxt.shop.entity.Dinnertable;

/**
 * 餐桌的DAO接口
 *
 */
public interface DinnertableService {

	/**
	 * 查询所有的餐桌信息
	 * @return   餐桌List集合
	 */
	public List<Dinnertable> getAll();
	
	/**
	 * 根据id删除一个餐桌
	 * @param id  餐桌ID
	 * @return    受影响行数
	 */
	public int deleteById(Integer id);
}
