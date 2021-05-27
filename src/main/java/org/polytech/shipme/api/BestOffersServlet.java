package org.polytech.shipme.api;

import com.google.gson.Gson;
import org.polytech.shipme.buisness.delivery_manager.ShipmentRequest;
import org.polytech.shipme.buisness.best_offer.BestOffersService;
import org.polytech.shipme.buisness.best_offer.ShippingOffer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class BestOffersServlet extends HttpServlet {

    private BestOffersService bestOffersService=new BestOffersService();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // deserialize map string to object
        Gson gson = new Gson();
        ShipmentRequest shippingRequest = gson.fromJson(req.getReader(),ShipmentRequest.class);

        // call business logic
        List<ShippingOffer> shippingOffers = bestOffersService.propose(shippingRequest);

        //  serialize ShippingOffer
        resp.setContentType("application/json");
        resp.getWriter().println(gson.toJson(shippingOffers));

    }
}
