package org.andres.hotel.controller;

import java.util.List;

import org.andres.hotel.dao.ReservaDao;
import org.andres.hotel.factory.ConnectionFactory;
import org.andres.hotel.modelo.Reserva;

public class ReservaController {

	private ReservaDao reservaDao;
	
	public ReservaController() {
		this.reservaDao = new ReservaDao(new ConnectionFactory().recupetaConexion());
	}
	
	public void guardar(Reserva reserva) {
		reservaDao.guardar(reserva);
	}
	
	public List<Reserva> listar(String campo) {
		return reservaDao.listarReservas(campo);
	}
	
	public int modificar(String fecha_entrada, String fecha_salida, Double valor, String forma_pago, Long id){
		return reservaDao.modificar(fecha_entrada, fecha_salida, valor, forma_pago, id);	
	}
	
	public int eliminar(Integer id) {		
		return reservaDao.eliminar(id);			
	}
}
