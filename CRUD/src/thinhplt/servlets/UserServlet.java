package thinhplt.servlets;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import thinhplt.models.User;
import thinhplt.util.UrlConstant;

@WebServlet(name = "userServlet", urlPatterns = { UrlConstant.URL_USER, UrlConstant.URL_USER_ADD,
		UrlConstant.URL_USER_DELETE, UrlConstant.URL_USER_EDIT })
public class UserServlet extends HttpServlet {

	private List<User> users = new ArrayList<User>();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String servletPath = req.getServletPath();

		switch (servletPath) {
		case UrlConstant.URL_USER:
			req.getRequestDispatcher("/WEB-INF/views/user/user_list.jsp").forward(req, resp);
			break;
		case UrlConstant.URL_USER_ADD:
			req.getRequestDispatcher("/WEB-INF/views/user/user_add.jsp").forward(req, resp);
			break;
		case UrlConstant.URL_USER_DELETE:
			// Lay id cua user can xoa
			int id = Integer.parseInt(req.getParameter("id"));

			for (User user : users) {
				if (user.getId() == id) {
					users.remove(user);
					break;
				}
			}
			req.setAttribute("users", users);
			req.getRequestDispatcher("/WEB-INF/views/user/user_list.jsp").forward(req, resp);
			break;
		case UrlConstant.URL_USER_EDIT:
			// lay id
			int editId = Integer.parseInt(req.getParameter("id"));
			//tim user
			User editUser = null;
			for (User user : users) {
				if (user.getId() == editId) {
					editUser = user;
					break;
				}
			}
			//Truyen user den trang edit de hien thi
			if (editUser != null)
				req.setAttribute("user", editUser);
			req.getRequestDispatcher("/WEB-INF/views/user/user_edit.jsp").forward(req, resp);
			break;
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String servletPath = req.getServletPath();

		switch (servletPath) {
		case UrlConstant.URL_USER_ADD:
			User newUser = new User();

			newUser.setId(Integer.parseInt(req.getParameter("id")));
			newUser.setHoten(req.getParameter("fullname"));
			newUser.setEmail(req.getParameter("email"));
			newUser.setSdt(req.getParameter("phone"));

			users.add(newUser);

			req.setAttribute("users", users);

			req.getRequestDispatcher("/WEB-INF/views/user/user_list.jsp").forward(req, resp);

			break;
		case UrlConstant.URL_USER_EDIT:
			// Lay Id user can edit
			int idOfUserNeedToEdit = Integer.parseInt(req.getParameter("id"));

			// Tim user can edit
			for (User user : users) {
				if (user.getId() == idOfUserNeedToEdit) {
					user.setId(Integer.parseInt((req.getParameter("id"))));
					user.setHoten(req.getParameter("fullname"));
					user.setEmail(req.getParameter("email"));
					user.setSdt(req.getParameter("phone"));
					break;
				}
			}

			// Chuyen ve trang user list
			req.setAttribute("users", users);
			req.getRequestDispatcher("/WEB-INF/views/user/user_list.jsp").forward(req, resp);
			break;
		}
	}
}
