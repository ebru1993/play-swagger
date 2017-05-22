package controllers;


import io.swagger.annotations.*;
import models.Employee;
import models.ErrorMessage;
import play.mvc.Controller;
import play.mvc.Result;


@Api(value = "/employee", description = "All operations with employee", produces = "application/json")
public class EmployeeController extends Controller {

    @ApiOperation(
        nickname = "getAllEmployee",
        value = "Get all employee engaged in the hospital",
        notes = "With this method you can get all employee and all it's informations",
        httpMethod = "GET",
        response = Employee.class)
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "OK", response = Employee.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ErrorMessage.class),
        @ApiResponse(code = 500, message = "Internal Server ErrorMessage", response = ErrorMessage.class) })
    public Result getAllEmployee(){

        //some Stuff here
        return null;
    }

    @ApiOperation(
        nickname = "getOneEmployee",
        value = "Get one employee engaged in the hospital",
        notes = "With this method you can get one particular employee and all it's informations",
        httpMethod = "GET",
        response = Employee.class)
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "OK", response = Employee.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ErrorMessage.class),
        @ApiResponse(code = 500, message = "Internal Server ErrorMessage", response = ErrorMessage.class) })
    public Result getOneEmployee(@ApiParam(value = "PersID", name = "id", required = true) Integer id){

        //some Stuff here
        return null;
    }



}
