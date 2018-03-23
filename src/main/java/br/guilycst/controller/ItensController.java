package br.guilycst.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.guilycst.dao.ItemDAO;
import br.guilycst.model.Item;

@Controller
public class ItensController {
	
	@Autowired //spring dependency injection right here boys
	private ItemDAO itemDao;
	
	@RequestMapping("/itens/form")
	public String form() {
		return "itens/form";
	}
	
	@RequestMapping("/itens")
	public String save(Item item) { // You can also receive each parameter separately instead  of using a entity to mirror the form
		System.out.println(item.toString());
		itemDao.save(item);
		return "itens/form";
	}

}
