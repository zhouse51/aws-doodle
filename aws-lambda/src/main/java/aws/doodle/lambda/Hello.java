package aws.doodle.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.Map;

public class Hello implements RequestHandler <Map<String,Object>, String> {

    public String handleRequest(Map<String,Object> input, Context context) {
        return "Hello, message: " + input.get("message").toString();
    }
}
