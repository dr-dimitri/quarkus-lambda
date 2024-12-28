package org.openapi.quarkus.api_yaml.api;

import org.openapi.quarkus.api_yaml.model.LottoSchein;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import jakarta.enterprise.context.ApplicationScoped;

import io.quarkiverse.openapi.generator.annotations.GeneratedClass;
import io.quarkiverse.openapi.generator.annotations.GeneratedMethod;
import io.quarkiverse.openapi.generator.annotations.GeneratedParam;

/**
  * Lottogesellschaft API
  * <p>API für die Verwaltung von Lottoscheinen und Ziehungen</p>
  */
@Path("/lottoschein")
@RegisterRestClient( configKey="api_yaml")
@GeneratedClass(value="api.yaml", tag = "Default")
@ApplicationScoped
public interface DefaultApi {

    @POST
    @Path("/abgeben")
    @Consumes({"application/json"})
    @GeneratedMethod ("")
    public jakarta.ws.rs.core.Response lottoscheinAbgebenPost(
        LottoSchein lottoSchein
    );

    @GET
    @Path("/erstellen")
    @Produces({"application/json"})
    @GeneratedMethod ("")
    public LottoSchein lottoscheinErstellenGet(
    );

    @GET
    @Path("/zufallsschein")
    @Produces({"application/json"})
    @GeneratedMethod ("")
    public LottoSchein lottoscheinZufallsscheinGet(
    );

}
