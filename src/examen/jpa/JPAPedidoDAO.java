package examen.jpa;

import examen.dao.PedidoDAO;
import examen.entidad.Pedido;

public class JPAPedidoDAO extends JPAGenericDAO<Pedido, Integer> implements PedidoDAO{

	public JPAPedidoDAO() {
		super(Pedido.class);
		// TODO Auto-generated constructor stub
	}

}
