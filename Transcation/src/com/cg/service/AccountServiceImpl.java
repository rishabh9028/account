package com.cg.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.NamingException;

import com.cg.bean.AccountBean;
import com.cg.dao.AccountDaoImpl;
import com.cg.dao.IAccountDao;

public class AccountServiceImpl implements IAccountService {
	IAccountDao dao=new AccountDaoImpl();
	@Override
	public ArrayList<Integer> getAcc_Id() throws NamingException, IOException {
		// TODO Auto-generated method stub
		
		return dao.getAcc_Id();
	}
	@Override
	public int getBal_Amt(int total, int withdrawl) {
		// TODO Auto-generated method stub
		return (total-withdrawl);
	}
	@Override
	public int AddAccountDetails(AccountBean bean) throws SQLException, NamingException, IOException {
		// TODO Auto-generated method stub
		int i=bean.getWithdrawl_Amt();
		int j=bean.getTotal_Amt();
		return dao.AddAccountDetails(bean);
	}

}
