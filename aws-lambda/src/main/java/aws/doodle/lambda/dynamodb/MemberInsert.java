package aws.doodle.lambda.dynamodb;

import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class MemberInsert implements RequestHandler<MemberVO, String> {


	public String handleRequest(MemberVO memberVO, Context context) {
		AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard()
				.withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration("http://localhost:8000", Regions.US_EAST_2.name()))
				.build();

		DynamoDB dynamoDB = new DynamoDB(client);

		Table table = dynamoDB.getTable("member");

		//JsonParser parser = new JsonFactory()..createParser(new File("moviedata.json"));
		return null;
	}
}
