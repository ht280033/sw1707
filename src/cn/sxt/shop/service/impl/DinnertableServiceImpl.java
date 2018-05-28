package cn.sxt.shop.service.impl;

import java.util.List;

import cn.sxt.shop.dao.DinnertableDAO;
import cn.sxt.shop.dao.impl.DinnertableDAOImpl;
import cn.sxt.shop.entity.Dinnertable;
import cn.sxt.shop.service.DinnertableService;

/**
 * 餐桌业务层实现类
 *
 */
public class DinnertableServiceImpl implements DinnertableService {

	DinnertableDAO dao = new DinnertableDAOImpl();
	
	
	public List<Dinnertable> getAll() {
		return dao.getAll();
	}
	
	
	public int deleteById(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
