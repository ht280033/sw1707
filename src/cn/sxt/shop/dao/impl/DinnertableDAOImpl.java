package cn.sxt.shop.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.handlers.BeanListHandler;

import cn.sxt.shop.entity.Dinnertable;
import cn.sxt.shop.utils.ComPoolUtil;

/**
 * 餐桌接口的实现类    DAO实现层与数据库直接打交道
 *
 */
public class DinnertableDAOImpl implements cn.sxt.shop.dao.DinnertableDAO {

	public List<Dinnertable> getAll() {
		
		List<Dinnertable> dinnerTables = null;
		try {
			dinnerTables = ComPoolUtil.getQueryRunner().query(
					"select  * from dinnertable",
					new BeanListHandler<Dinnertable>(Dinnertable.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dinnerTables;
	}

}
