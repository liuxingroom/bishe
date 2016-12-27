package com.xing.leaveSystem.service;

import java.util.List;
import java.util.Map;

import com.xing.leaveSystem.entity.User;

public interface UserService {

	/**
	 * �����û�����ҳ��ѯ���ϵ��û���Ϣ
	 * @param map
	 * @return
	 */
	List<User> find(Map<String, Object> map);

	/**
	 * ��ȡ���ݵļ�¼��
	 * @param map
	 * @return
	 */
	Long getTotal(Map<String, Object> map);

	/**
	 * �����û���Ϣ
	 * @param user
	 * @return
	 */
	int add(User user);

	/**
	 * �����û���Ϣ
	 * @param user
	 * @return
	 */
	int update(User user);

	/**
	 * ͨ���û��������û���Ϣ
	 * @param userName
	 * @return
	 */
	User findByUserName(String userName);

}