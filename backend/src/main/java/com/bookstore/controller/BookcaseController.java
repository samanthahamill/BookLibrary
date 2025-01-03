package com.bookstore.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.proto.library.Bookcase;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag( name = "Bookcase" )
@RequestMapping( "/api/bookcase" )
public class BookcaseController
{
    private BookcaseController( )
    {

    }

    @GetMapping( "/request/${_id}" )
    @Operation( summary = "Get the stats of a current bookcase" )
    @ApiResponses( value = {
            @ApiResponse( responseCode = "200", description = "Successfully retrieved" ),
            @ApiResponse( responseCode = "400", description = "Incorrect input" ),
            @ApiResponse( responseCode = "500", description = "Could not access database" )
    } )
    public ResponseEntity<Bookcase> getBookcaseContentById(
            @PathVariable( "_id" )
            String bookcaseId )
    {
        // TODO actually return something substantual
        return ResponseEntity.ok( Bookcase.newBuilder( ).build( ) );
    }

    @GetMapping( "/request/{name}" )
    @Operation( summary = "Get the stats of a current bookcase" )
    @ApiResponses( value = {
            @ApiResponse( responseCode = "200", description = "Successfully retrieved" ),
            @ApiResponse( responseCode = "400", description = "Incorrect input" ),
            @ApiResponse( responseCode = "500", description = "Could not access database" )
    } )
    public ResponseEntity<Bookcase> getBookcaseContentByName(
            @PathVariable( "name" )
            String bookName )
    {
        // TODO actually return something substantual
        return ResponseEntity.ok( Bookcase.newBuilder( ).build( ) );
    }

    @GetMapping( "/request/{_id}/books" )
    @Operation( summary = "Get the stats of a current bookcase" )
    @ApiResponses( value = {
            @ApiResponse( responseCode = "200", description = "Successfully retrieved" ),
            @ApiResponse( responseCode = "400", description = "Incorrect input" ),
            @ApiResponse( responseCode = "500", description = "Could not access database" )
    } )
    public ResponseEntity<Bookcase> getBooksInBookcase(
            @PathVariable( "_id" )
            String bookcaseId )
    {
        // TODO actually return something substantual
        return ResponseEntity.ok( Bookcase.newBuilder( ).build( ) );
    }
}
