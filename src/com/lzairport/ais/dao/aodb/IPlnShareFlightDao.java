package com.lzairport.ais.dao.aodb;

import javax.ejb.Local;
import com.lzairport.ais.dao.IDao;
import com.lzairport.ais.models.aodb.PlnShareFlight;

/**
 * 共享航班计划的实体类的Dao接口
 * @author ZhangYu
 * @version 0.9a 16/08/14
 * @since JDK 1.6
 *
 */

@Local
public interface IPlnShareFlightDao extends IDao<Integer, PlnShareFlight> {

}
