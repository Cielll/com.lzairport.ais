package com.lzairport.ais.dao.aodb;

import javax.ejb.Local;
import com.lzairport.ais.dao.IDao;
import com.lzairport.ais.models.aodb.DynPayingPassenger;


/**
 * 航班付费旅客实体类的Dao接口
 * @author ZhangYu
 * @version 0.9a 02/09/14
 * @since JDK 1.6
 *
 */

@Local
public interface IDynPayingPassengerDao extends
		IDao<Integer, DynPayingPassenger> {

}
