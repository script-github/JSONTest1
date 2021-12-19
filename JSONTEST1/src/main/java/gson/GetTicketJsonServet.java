package gson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import bean.Ticket;

/**
 * Servlet implementation class GetTicketJsonServet
 */
@WebServlet("/GetTicketJsonServet")
public class GetTicketJsonServet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetTicketJsonServet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Ticket> ticketList = new ArrayList<>();
		ticketList.add(new Ticket(1,"トッピング無料券",100));
		ticketList.add(new Ticket(2,"チャーハン無料券",100));
		ticketList.add(new Ticket(3,"ファミチキ無料券",100));
		
		Gson gson = new Gson();
		//List<Ticket>オブジェクトを,JSON文字列に変換 
		String jsonStr = gson.toJson(ticketList,List.class);
		System.out.println(jsonStr);
		response.setContentType("application/json");
		request.setAttribute("jsonStr", jsonStr);
		request.getRequestDispatcher("/WEB-INF/jsp/getTicketJson.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
