package com.fy.fyy.back.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.tuple.Pair;


public class ControllerServlet extends HttpServlet {

  private static final long serialVersionUID = -423807766712107605L;
  private static final String R404 = "404.jsp";
  private static final String R500 = "500.jsp";

  @Override
  protected void doGet( HttpServletRequest req, HttpServletResponse resp ) throws ServletException, IOException {
    this.doPost( req, resp );
  }

  @Override
  protected void doPost( HttpServletRequest req, HttpServletResponse resp ) throws ServletException, IOException {
    //invoke action
    Pair<String, Boolean> pair = ServletUtil.exec( req );
    //forward or redirect
    ServletUtil.go( pair.getLeft(), pair.getRight(), req, resp );
  }

  public static void go404( HttpServletResponse resp ) {
    try {
      resp.sendRedirect( R404 );
    }
    catch ( IOException e ) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  public static void go500( HttpServletResponse resp ) {
    try {
      resp.sendRedirect( R500 );
    }
    catch ( IOException e ) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
