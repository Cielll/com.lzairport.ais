package com.lzairport.ais.service;

import javax.ejb.Remote;

import com.lzairport.ais.models.ViewGroup;


/**
 * ��ʾ����ViewGroup��Service��ӿ�
 * @author ZhangYu
 * @version 0.9a  01/05/15
 * @since JDK 1.6
 *
 */

@Remote
public interface IViewGroupService extends IService<Integer, ViewGroup> {
	
	
}