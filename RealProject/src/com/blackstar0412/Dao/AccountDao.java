package com.blackstar0412.Dao;

import java.sql.SQLException;

import com.blackstar0412.domain.Account;

public interface AccountDao {
	/**
	 * ͨ��Ա����Ų�ѯ
	 * @param id  Ա�����
	 * @return
	 * @throws SQLException
	 */
	Account selectAccountById(String id)throws SQLException;
	/**
	 * ��½�Ժ�ˢ�����ĵ�½ʱ��
	 * @param account  ��½�˻�
	 * @throws SQLException
	 */
	void updateLltime(Account account)throws SQLException;
}
