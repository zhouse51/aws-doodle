package aws.doodle.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class HelloPojo implements RequestHandler<RequestClass, ResponseClass> {

    public ResponseClass handleRequest(RequestClass requestClass, Context context) {
        return new ResponseClass("Hello " + requestClass.getFirstName() + " " + requestClass.getLastName());
    }
}
