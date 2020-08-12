package thinhplt.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import thinhplt.models.Role;
import thinhplt.util.UrlConstant;

@WebServlet(name = "roleServlet", urlPatterns = { UrlConstant.URL_ROLE, UrlConstant.URL_ROLE_ADD,
		UrlConstant.URL_ROLE_EDIT, UrlConstant.URL_ROLE_DELETE })

public class RoleServlet extends HttpServlet {

	 private List<Role> roles = new ArrayList<Role>();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String servletPath = req.getServletPath();
		System.setProperty("file.encoding", "UTF-8");
		switch (servletPath) {
		case UrlConstant.URL_ROLE:
			req.getRequestDispatcher("/WEB-INF/views/role/role_list.jsp").forward(req, resp);
			break;
		case UrlConstant.URL_ROLE_ADD:
			req.getRequestDispatcher("/WEB-INF/views/role/role_add.jsp").forward(req, resp);
			break;
		case UrlConstant.URL_ROLE_DELETE:
			int idWantToDelete = Integer.parseInt(req.getParameter("id"));
			
			for(Role role: roles) {
				if (role.getId() == idWantToDelete) {
					roles.remove(role);
					break;
				}
			}
			req.setAttribute("roles", roles);
			req.getRequestDispatcher("/WEB-INF/views/role/role_list.jsp").forward(req, resp);
			break;
		case UrlConstant.URL_ROLE_EDIT:
			int idEdit = Integer.parseInt(req.getParameter("id"));
			Role roleEdit = null;
			
			for(Role role: roles) {
				if(role.getId() == idEdit) {
					roleEdit = role;
					break;
				}
			}
			if(roleEdit != null)
				req.setAttribute("role", roleEdit);
				req.getRequestDispatcher("/WEB-INF/views/role/role_edit.jsp").forward(req, resp);
			
			break;
		default:
			break;
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String servletPath = req.getServletPath();
		
		switch (servletPath) {
		
		case UrlConstant.URL_ROLE_ADD:
			Role newRole = new Role();
			
			newRole.setId(Integer.parseInt(req.getParameter("id")));
			newRole.setName(req.getParameter("name"));
			newRole.setDescription(req.getParameter("description"));
			
			roles.add(newRole);
			
			req.setAttribute("roles", roles);
			req.getRequestDispatcher("/WEB-INF/views/role/role_list.jsp").forward(req, resp);
			break;
		case UrlConstant.URL_ROLE_EDIT:
			int idNeedToEdit = Integer.parseInt(req.getParameter("id"));
			
			for(Role role: roles) {
				if(role.getId() == idNeedToEdit) {
					role.setId(Integer.parseInt(req.getParameter("id")));
					role.setName(req.getParameter("name"));
					role.setDescription(req.getParameter("description"));
					break;
				}
			}
			req.setAttribute("roles", roles);
			req.getRequestDispatcher("/WEB-INF/views/role/role_list.jsp").forward(req, resp);
			
			
			break;
		}
	}
}
