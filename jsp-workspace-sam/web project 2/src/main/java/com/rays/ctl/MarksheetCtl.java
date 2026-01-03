package com.rays.ctl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rays.bean.MarksheetBean;
import com.rays.model.MarksheetModel;

@WebServlet("/MarksheetCtl")
public class MarksheetCtl extends HttpServlet {

	private int rollNo;
	private String name;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("in do get method");
		response.sendRedirect("MarksheetView.jsp");

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		MarksheetBean bean = new MarksheetBean();
		MarksheetModel model = new MarksheetModel();

		System.out.println("in do post method");

		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		int phy = Integer.parseInt(request.getParameter("phy"));
		int chm = Integer.parseInt(request.getParameter("chm"));
		int maths = Integer.parseInt(request.getParameter("maths"));
		System.out.println(id + "\n" + name + "\n" + phy + "\n" + chm + "\n" + maths);

		try {

			bean.setId(27);

			bean.setRollno(rollNo);

			bean.setName(name);

			bean.setPhy(phy);

			bean.setChm(chm);

			bean.setMaths(maths);

			model.add(bean);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
