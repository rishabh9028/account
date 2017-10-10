package com.cg.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cg.bean.AccountBean;
import com.cg.service.AccountServiceImpl;
import com.cg.service.IAccountService;


@WebServlet("*.obj")
public class AccountController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		int res = 0;
		String path= request.getServletPath();
		String target=null;
		AccountBean bean=new AccountBean();
		IAccountService service=new AccountServiceImpl();
		HttpSession session=request.getSession();
		
		switch(path)
		{
		case "/add.obj":
			target="AddAccountDetails.jsp";
			ArrayList<Integer> list = new ArrayList<Integer>();
			try {
				list=service.getAcc_Id();
			
			session.setAttribute("list",list);
			for(Integer i:list)
			{
				System.out.println(i);
			}
			
			break;
			} catch (NamingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	case "/insert.obj":
			String Acc_Id=request.getParameter("Acc_Id");
			int id=Integer.parseInt(Acc_Id);
			
			String Acc_Type=request.getParameter("Acc_Type");
			
			
			String Total_Amt=request.getParameter("Amount");
			int total=Integer.parseInt(Total_Amt);
			
			String Withdrawl_Amt=request.getParameter("AmountW");
			int withdrawl=Integer.parseInt(Withdrawl_Amt);
			
			
			bean.setAcc_Id(id);
			bean.setAcc_Type(Acc_Type);
			bean.setTotal_Amt(total);
			bean.setWithdrawl_Amt(withdrawl);
			int balance = service.getBal_Amt(total,withdrawl);
			bean.setBal_Amt(balance);
			
			
			
			try {
				res = service.AddAccountDetails(bean);
			
			System.out.println(res);

			if(res==1)
				{
				/*ArrayList<StudentBean> list=service.retrieveDetails();
				System.out.println(list);*/
				session.setAttribute("id", id);
				session.setAttribute("Acc_Type",Acc_Type );
				session.setAttribute("total",total);
				session.setAttribute("withdrawl",withdrawl);
				session.setAttribute("balance",balance);
				
				target="FinalDetails.jsp";
				}
			else
			{
				target="Error.jsp";
			}
			break;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NamingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	
	}
		RequestDispatcher rd  = request.getRequestDispatcher(target);
		rd.forward(request, response);
	
	}
	}

