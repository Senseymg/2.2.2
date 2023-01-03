package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/cars")
public class CarController {
    private final CarDao carDao;

    @Autowired
    public CarController(CarDao carDao) {
        this.carDao = carDao;
    }

    /*  @GetMapping()
      public String index(Model model) {
          model.addAttribute("allCarToShow", carDao.index());
          return "/cars";
      }*/
    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model) {
        model.addAttribute("car", carDao.show(id));

        return "/cars/show";
    }

    @GetMapping()
    public String carsPage(HttpServletRequest request, Model model) {
        if (request.getParameter("count") == null) {
            model.addAttribute("allCarToShow", carDao.index());
        } else {
            int count = Integer.parseInt(request.getParameter("count"));

            model.addAttribute("allCarToShow", carDao.showCarCount(count));
        }
        return "/cars";
    }
}
