<%@ page language="java" contentType="application/json; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList,bean.Ticket" %>
<%
	ArrayList<Ticket> ticketList = (ArrayList<Ticket>)request.getAttribute("ticketList");
	out.println("[");
	for(Ticket ticket : ticketList){
		out.print("{\"ID\":"+ticket.getId()+",");
		out.print("\"OptName\":\""+ticket.getOptName()+"\",");
		out.println("\"POINT\":"+ticket.getPoint()+"},");
	}
	out.print("]");
%>
