package com.sinse.hiberasync.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sinse.hiberasync.repository.StoreDAO;

public class StoreDelete extends HttpServlet {

	Logger logger = LoggerFactory.getLogger(getClass());
	StoreDAO storeDAO = new StoreDAO();

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String store_id = request.getParameter("store_id");

		logger.debug("store_id= " + store_id);

	}

}
