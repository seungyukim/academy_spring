package com.mis.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mis.domain.PageMaker;
import com.mis.domain.ProductVO;
import com.mis.domain.SearchCriteria;
import com.mis.service.ProductService;

@Controller
@RequestMapping("/shop/*")
public class ProductController {

	private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

	@Inject
	private ProductService service;

	@RequestMapping(value = "/searchlist", method = RequestMethod.GET)
	public void searchlist(Model model) throws Exception {
		
		logger.info("show all list.............");
		model.addAttribute("list", service.searchlist());
	}
	
	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public void read(@RequestParam("prodcod") int prodcod, Model model) throws Exception {
		
		model.addAttribute(service.read(prodcod));
	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String delete(@RequestParam("prodcod") int prodcod, RedirectAttributes rttr) throws Exception {
		
		service.delete(prodcod);
		
		rttr.addFlashAttribute("msg", "SUCCESS");
		return "redirect:/shop/searchlist";
		
	}

	@RequestMapping(value = "/modify", method = RequestMethod.GET)
	public void modifyGET(int prodcod, Model model) throws Exception {
		model.addAttribute(service.read(prodcod));
	}
	
	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public String modifyPOST(ProductVO product, RedirectAttributes rttr) throws Exception {
	
		logger.info("modify post.............");
		
		service.modify(product);
		rttr.addFlashAttribute("msg", "SUCCESS");
		
		return "redirect:/shop/searchlist";
		
	}
	
	@RequestMapping(value = "/listCri", method = RequestMethod.GET)
	public void listCri(SearchCriteria cri, Model model) throws Exception {
		
		logger.info("show list page with SearchCriteria.............");
		
		model.addAttribute("list", service.listSearchCriteria(cri));
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public void listPage(SearchCriteria cri, Model model) throws Exception {
		
		logger.info(cri.toString());
		
//		model.addAttribute("list", service.listCriteria(cri));
		model.addAttribute("list", service.listSearchCriteria(cri));
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
//		pageMaker.setTotalCount(service.listSearchCount(cri));
		pageMaker.setTotalCount(service.listCountCriteria(cri));
		
		model.addAttribute("pageMaker", pageMaker);
	}
	
	@RequestMapping(value = "/readPage", method = RequestMethod.GET)
	public void readPage(@RequestParam("prodcod") int prodcod
			          , @ModelAttribute("cri") SearchCriteria cri
			          , Model model) throws Exception {
		
		model.addAttribute(service.read(prodcod));
	}
	
	@RequestMapping(value = "/deletePage", method = RequestMethod.POST)
	public String deletePage(@RequestParam("prodcod") int prodcod
			              , @ModelAttribute("cri") SearchCriteria cri
			              , RedirectAttributes rttr) throws Exception {
		
		service.delete(prodcod);
		
		rttr.addAttribute("page", cri.getPage());
		rttr.addAttribute("perPageNum", cri.getPerPageNum());
		rttr.addAttribute("searchType", cri.getSearchType());
		rttr.addAttribute("keyword", cri.getKeyword());
		
		rttr.addFlashAttribute("msg", "SUCCESS");
		
		return "redirect:/shop/list";
	}
		
	@RequestMapping(value = "/modifyPage", method = RequestMethod.GET)
	public void modifyPageGET(int prodcod
			               , @ModelAttribute("cri") SearchCriteria cri, Model model) throws Exception {
	
		model.addAttribute(service.read(prodcod));
	}
		
	@RequestMapping(value = "/modifyPage", method = RequestMethod.POST)
	public String modifyPagePOST(ProductVO product
			                  , @ModelAttribute("cri") SearchCriteria cri
			                  , RedirectAttributes rttr) throws Exception {
		
		logger.info(cri.toString());
		service.modify(product);

		rttr.addAttribute("page", cri.getPage());
		rttr.addAttribute("perPageNum", cri.getPerPageNum());
		rttr.addAttribute("searchType", cri.getSearchType());
		rttr.addAttribute("keyword", cri.getKeyword());
		
		rttr.addFlashAttribute("msg", "SUCCESS");
		
		return "redirect:/shop/list";
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public void registGET() throws Exception {
		
		logger.info("register post.............");
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registPOST(ProductVO product, RedirectAttributes rttr) throws Exception {
		
		logger.info("register post.............");
		logger.info(product.toString());
		
		service.regist(product);
		
		rttr.addFlashAttribute("msg", "SUCCESS");
		return "redirect:/shop/list";
	}
	
}
