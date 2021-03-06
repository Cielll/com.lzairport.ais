package com.lzairport.ais.dao.settlement;

import javax.ejb.Local;

import com.lzairport.ais.dao.IDao;
import com.lzairport.ais.models.settlement.BoardingCard;


/**
 * 
 * FileName      IBoardingCardDao.java
 * @Description  TODO 登机牌收费标准的Dao接口
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2016年11月7日 
 * @ModificationHistory
 * Date         Author     Version   Discription
 * <p>---------------------------------------------
 * <p>2016年11月7日      Administrator    1.0        1.0
 * <p>Why & What is modified: <修改原因描述>
 */
@Local
public interface IBoardingCardDao extends IDao<Integer, BoardingCard> {

}
