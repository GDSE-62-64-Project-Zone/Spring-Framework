package lk.ijse.spring.advisor;

import lk.ijse.spring.util.ResponseUtil;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//this is also a type of aspect
//this class will handle all the runtime exceptions of the application
@RestControllerAdvice
public class AppWideExceptionHandler {

    //if any runtime error generated inside the container object below
    //method will handle it and generate a response as we wish
    //here we have used the Response Util Class to generate a json object
    @ExceptionHandler({RuntimeException.class})
    public ResponseUtil handleAllRuntimeExceptions(RuntimeException e){
        return new ResponseUtil("Error",e.getMessage(),null);
    }
}
