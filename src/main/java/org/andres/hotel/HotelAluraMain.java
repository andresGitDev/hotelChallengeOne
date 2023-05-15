package org.andres.hotel;

import java.awt.EventQueue;

import org.andres.hotel.view.MenuPrincipal;

public class HotelAluraMain {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
