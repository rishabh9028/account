package com.cg.dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.NamingException;

import com.cg.bean.AccountBean;

public interface IAccountDao {

	ArrayList<Integer> getAcc_Id() throws NamingException, IOException;

	

	public int AddAccountDetails(AccountBean bean) throws SQLException, NamingException, IOException;

}
