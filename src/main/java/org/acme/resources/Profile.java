package org.acme.resources;

import jakarta.annotation.security.RolesAllowed;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.SecurityContext;
import org.acme.persistence.dto.Usuario;

@Path("/api/user")
@Produces(MediaType.APPLICATION_JSON)
public class Profile {

    @GET
    @RolesAllowed({"user", "admin"})
    @Path("/me")
    public Usuario me(@Context SecurityContext context) {
        Usuario usuario = new Usuario();

        usuario.setName(context.getUserPrincipal().getName());
        return usuario;
    }
}
