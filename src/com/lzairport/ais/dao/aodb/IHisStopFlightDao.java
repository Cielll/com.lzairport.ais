package com.lzairport.ais.dao.aodb;

import javax.ejb.Local;
import com.lzairport.ais.dao.IDao;
import com.lzairport.ais.models.aodb.HisStopFlight;

/**
 * 航班经停历史的实体类的Dao接口
 * @author ZhangYu
 * @version 0.9a 24/08/14
 * @since JDK 1.6
 *
 */

@Local
public interface IHisStopFlightDao extends IDao<Integer, HisStopFlight> {

}
