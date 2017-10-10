package com.cg.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.NamingException;

import com.cg.bean.AccountBean;
import com.cg.dbutil.DbUtil;

public class AccountDaoImpl implements IAccountDao {
	Connection conn=null;
	
	@Override
	public ArrayList<Integer> getAcc_Id() throws NamingException, IOException {
		ArrayList<Integer> list = new ArrayList<Integer>();
		try{
			conn=DbUtil.getConnection();
			String str="Select Acc_id from accountdetails";
			PreparedStatement pst=conn.prepareStatement(str);
			ResultSet rs= pst.executeQuery();
			while(rs.next())
			{
				int ids=rs.getInt(1);
				list.add(ids);
			}
		}	
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		return list;
	}

	@Override
	public int AddAccountDetails(AccountBean bean) throws SQLException, NamingException, IOException {
		// TODO Auto-generated method stub
		int rows=0;
		conn=DbUtil.getConnection();
		System.out.println(conn);
		PreparedStatement ps=conn.prepareStatement("insert into userdetails values(trans_id.nextval,?,?,?,?,?)");
		ps.setInt(1,bean.getAcc_Id());
		ps.setString(2,bean.getAcc_Type());
		ps.setInt(3, bean.getTotal_Amt());
		ps.setInt(4,bean.getWithdrawl_Amt());
		ps.setInt(5,bean.getBal_Amt());
	
		rows=ps.executeUpdate();

return rows;
	}

	
}
