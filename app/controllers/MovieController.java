package controllers;

import io.swagger.annotations.*;
import models.Error;
import models.Movie;
import play.mvc.Controller;
import play.mvc.Result;

@Api(value = "/movies", description = "All operations with movies", produces = "application/json")
public class MovieController extends Controller {

    @ApiOperation(
            nickname = "getMovie",
            value = "Get a simple movie",
            notes = "With this method you can get the selected movie and all it's informations",
            httpMethod = "GET",
            response = Movie.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfull", response = Movie.class),
            @ApiResponse(code = 403, message = "Invalid Authorization", response = Error.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    public Result getMovie(@ApiParam(value = "Movie Id", name = "id") Integer id){
        //some stuff
        return ok();
    }

}
