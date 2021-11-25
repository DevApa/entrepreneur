package com.entrepreneur.core.controllers.contract;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.entrepreneur.core.controllers.dto.EntrepreneurDTO;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

public interface IEntrepreneurController {
	
	@GetMapping(value = "api/es/mies/entrepreneur/list", produces = "application/json")
	@Operation(description = "Listado de emprededores disponibles")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "OK", content = @Content(array = @ArraySchema(schema = @Schema(implementation = EntrepreneurDTO.class)))),
			@ApiResponse(responseCode = "204", description = "No Hay Contenido"),
			@ApiResponse(responseCode = "200", description = "Error Interno", content = @Content(array = @ArraySchema(schema = @Schema(implementation = EntrepreneurDTO.class))))
	})
	@Parameters(value = {
            @Parameter(description = "Sin parámetros"),           
	})
	ResponseEntity<?> list();
	
	@PutMapping(value = "api/es/mies/entrepreneur/entrepreneur", produces = "application/json")
	@Operation(description = "Obtiene un emprendedor por su id")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "OK", content = @Content(array = @ArraySchema(schema = @Schema(implementation = EntrepreneurDTO.class)))),
			@ApiResponse(responseCode = "204", description = "No Hay Contenido"),
			@ApiResponse(responseCode = "200", description = "Error Interno", content = @Content(array = @ArraySchema(schema = @Schema(implementation = EntrepreneurDTO.class))))
	})
	
    @Parameter(name =  "id", description = "Identificador uníco del emprendedor", example = "2" )           
	ResponseEntity<?> entrepreneurById(@PathVariable int id);
	
	@PostMapping(value = "api/es/mies/entrepreneur/create", produces = "application/json")
	@Operation(description = "Creación de emprendedor")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "OK", content = @Content(array = @ArraySchema(schema = @Schema(implementation = EntrepreneurDTO.class)))),
			@ApiResponse(responseCode = "204", description = "No Hay Contenido"),
			@ApiResponse(responseCode = "200", description = "Error Interno", content = @Content(array = @ArraySchema(schema = @Schema(implementation = EntrepreneurDTO.class))))
	})
	@Parameters(value = {
            @Parameter(name =  "name", description = "Nombre de usuario del sistema", example = "usersys" ),
            @Parameter(name =  "lastName", description = "Nombres del usuario", example = "User Systema" ),
            @Parameter(name =  "lastNames", description = "Apellidos del usuario", example = "Usuario User" ),
            @Parameter(name =  "identify", description = "Tipo de documento", example = "0923993286" ),
            @Parameter(name =  "email", description = "Dirección de correo electrónico", example = "enprendedor@cmav.com" ),
            @Parameter(name =  "address", description = "Dirección domiciliaria", example = "Urdesa Central" )
	})
	@io.swagger.v3.oas.annotations.parameters.RequestBody(content = @Content(schema = @Schema(implementation = EntrepreneurDTO.class)))
	ResponseEntity<?> create(@RequestBody EntrepreneurDTO entrepreneurDto);
	
	@PutMapping(value = "api/es/mies/entrepreneur/update", produces = "application/json")
	@Operation(description = "Actualización de emprendedor")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "OK", content = @Content(array = @ArraySchema(schema = @Schema(implementation = EntrepreneurDTO.class)))),
			@ApiResponse(responseCode = "204", description = "No Hay Contenido"),
			@ApiResponse(responseCode = "200", description = "Error Interno", content = @Content(array = @ArraySchema(schema = @Schema(implementation = EntrepreneurDTO.class))))
	})
	@Parameters(value = {
            @Parameter(name =  "name", description = "Nombre de usuario del sistema", example = "usersys" ),
            @Parameter(name =  "lastName", description = "Nombres del usuario", example = "User Systema" ),
            @Parameter(name =  "lastNames", description = "Apellidos del usuario", example = "Usuario User" ),
            @Parameter(name =  "identify", description = "Tipo de documento", example = "0923993286" ),
            @Parameter(name =  "email", description = "Dirección de correo electrónico", example = "enprendedor@cmav.com" ),
            @Parameter(name =  "address", description = "Dirección domiciliaria", example = "Urdesa Central" )
	})
	@io.swagger.v3.oas.annotations.parameters.RequestBody(content = @Content(schema=@Schema(implementation = EntrepreneurDTO.class)))
	ResponseEntity<?> update(@RequestBody EntrepreneurDTO entrepreneurDto);
	
	@DeleteMapping(value = "api/es/mies/entrepreneur/delete", produces = "application/json")
	@Operation(description = "Elimina un recurso por su id")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "OK")
	})
	@Parameter(name = "id", description = "Permite eliminar un registro por su id", example = "3")
	ResponseEntity<?> delete(@PathVariable int id);
}
