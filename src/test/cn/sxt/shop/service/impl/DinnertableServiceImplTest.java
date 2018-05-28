package test.cn.sxt.shop.service.impl;

import java.util.List;

import org.junit.Test;

import cn.sxt.shop.entity.Dinnertable;
import cn.sxt.shop.service.DinnertableService;
import cn.sxt.shop.service.impl.DinnertableServiceImpl;

/**
 * 鍗曞厓Junit 娴嬭瘯浣跨敤姝ラ:
 * 	1.瀵煎叆Junit.jar  
 *  2.鍐欎竴涓獀oid 绫诲瀷鏃犲弬鐨勬柟娉曘�
 *  3.鍦ㄦ柟娉曚笂闈㈡墦涓婁竴涓狜Test娉ㄨВ
 *  
 *
 */
public class DinnertableServiceImplTest {

	DinnertableService service = new DinnertableServiceImpl();
	
	
	@Test
	public void getAll(){//娴嬭瘯鎵�湁鐨勯妗屽垪琛ㄤ俊鎭煡璇�
		
		//int a = 10 / 0;
		List<Dinnertable> tabls = service.getAll();
		
		for(Dinnertable table : tabls){
			
			System.out.println("椁愭鍚嶇О:"+table.getTablename());
		}
	}
	
	@Test
	public void deleteById(){//娴嬭瘯鍒犻櫎涓�釜椁愭
		
		//妯℃嫙jsp浼犻�杩囨潵鐨勫弬鏁� id
		Integer id = 1;
		
		int count = service.deleteById(id);
	}
}
