package com.bbva.locations;

import com.bbva.locations.beans.Locations;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/locationsvip")
public interface LocationsvipResource {
  @GET
  @Produces("application/json")
  List<Locations> generatedMethod1();

  @POST
  @Produces("application/json")
  String generatedMethod2();
}
