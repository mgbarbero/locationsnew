package com.bbva.locations;

import com.bbva.locations.beans.Locations;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/locations")
public interface LocationsResource {
  /**
   * Gets a list of all `Locations` entities.
   */
  @GET
  @Produces("application/json")
  List<Locations> getLocations();

  /**
   * Creates a new instance of a `Locations`.
   */
  @POST
  @Consumes("application/json")
  void createLocations(Locations data);

  /**
   * Gets the details of a single instance of a `Locations`.
   */
  @Path("/{locationsId}")
  @GET
  @Produces("application/json")
  Locations getLocations(@PathParam("locationsId") String locationsId);

  /**
   * Updates an existing `Locations`.
   */
  @Path("/{locationsId}")
  @PUT
  @Consumes("application/json")
  void updateLocations(@PathParam("locationsId") String locationsId, Locations data);

  /**
   * Deletes an existing `Locations`.
   */
  @Path("/{locationsId}")
  @DELETE
  void deleteLocations(@PathParam("locationsId") String locationsId);
}
