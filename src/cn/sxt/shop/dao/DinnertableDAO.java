package cn.sxt.shop.dao;

import java.util.List;

import cn.sxt.shop.entity.Dinnertable;

/**
 * 餐桌的DAO接口
 *
 */
public interface DinnertableDAO {

	/**
	 * 查询所有的餐桌信息
	 * @return   餐桌List集合
	 */
	public List<Dinnertable> getAll();
}
