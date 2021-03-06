/**
 * 
 */
package com.lzairport.ais.dao.settlement.forecast.impl;

import javax.ejb.Stateless;

import com.lzairport.ais.dao.impl.AodbDaoImpl;
import com.lzairport.ais.dao.settlement.forecast.IForecastSettlementDao;
import com.lzairport.ais.models.settlement.forecast.ForecastSettlement;

/**
 * 
 * FileName      ForecastSettlementDao.java
 * @Description  TODO 预测收入结算的Dao
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017年3月24日
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017年3月24日      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <修改原因描述>
 */

@Stateless
public class ForecastSettlementDao extends AodbDaoImpl<Integer, ForecastSettlement> implements IForecastSettlementDao {

	

}
