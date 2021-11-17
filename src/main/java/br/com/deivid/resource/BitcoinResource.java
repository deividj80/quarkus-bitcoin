package br.com.deivid.resource;

import br.com.deivid.model.Bitcoin;
import br.com.deivid.service.BitcoinService;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/bitcoins")
public class BitcoinResource {

    @Inject
    @RestClient
    BitcoinService bitcoinService;

    @GET
    @Produces(APPLICATION_JSON)
    public List<Bitcoin> listar(){
        return bitcoinService.listar();
    }
}
