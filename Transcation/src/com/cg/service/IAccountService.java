package com.cg.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.NamingException;

import com.cg.bean.AccountBean;

public interface IAccountService {

	public ArrayList<Integer> getAcc_Id () throws NamingException, IOException;

	public int getBal_Amt(int total, int withdrawl);

	public int AddAccountDetails(AccountBean bean) throws SQLException, NamingException, IOException;



}
