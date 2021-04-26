package no.hvl.dat109.BOATSHR;

import no.hvl.dat109.BOATSHR.domain.Selskap;
import no.hvl.dat109.BOATSHR.repositories.SelskapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

public class selskapController
{
    @Autowired
    SelskapRepository repo;

    @RequestMapping("/")
    public ModelAndView home() {

        return "home.jsp";
    }

    @RequestMapping("/addSelskap")
    public String addSelskap(Selskap selskap)
    {
        repo.save(selskap);
        return "home.jsp";
    }

    @RequestMapping("/getSelskap")
    public String getSelskap(@RequestParam String selskap_id)
    {
        repo.save(selskap);
        return "home.jsp";
    }

}
