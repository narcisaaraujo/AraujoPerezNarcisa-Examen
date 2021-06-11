package examen.jpa;

import examen.dao.ComidaDAO;
import examen.dao.DAOFactory;
import examen.dao.PedidoDAO;
import examen.dao.TarjetaCreditoDAO;

public class JPADAOFactory extends DAOFactory{



	@Override
	public PedidoDAO getPedidoDAO() {
		// TODO Auto-generated method stub
		return new JPAPedidoDAO();
	}

	@Override
	public ComidaDAO getComidaDAO() {
		// TODO Auto-generated method stub
		return new JPAComidaDAO();
	}

	@Override
	public TarjetaCreditoDAO getTarjetaCreditoDAO() {
		// TODO Auto-generated method stub
		return new JPATarjetaCreditoDAO();
	}
}
