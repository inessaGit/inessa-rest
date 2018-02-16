package messages;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.HttpClientBuilder;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MessagesGet {

	private String basicUrl="http://localhost:3030/v1/messages";

	@Test
	public void givenValidEndpoint_whenMessagesRetrieved_then200IsReceived() throws ClientProtocolException, IOException {
	   // Given
	   HttpUriRequest request = new HttpGet( basicUrl);
	   // When
	   HttpResponse httpResponse = HttpClientBuilder.create().build().execute( request );
	   // Then
	   Assert.assertTrue(httpResponse.getStatusLine().getStatusCode()==(HttpStatus.SC_OK)); //200
	}
	
	@Test
	public void givenValidEndpoint_whenMessagesRetrieved_thenDefaultResponseContentTypeIsJson() throws ClientProtocolException, IOException {
	   // Given Testing the Media Type
	   HttpUriRequest request = new HttpGet( basicUrl);
	   // When
	   HttpResponse httpResponse = HttpClientBuilder.create().build().execute( request );
	   // Then
	   String mimeType = ContentType.getOrDefault(httpResponse.getEntity()).getMimeType();

	   System.out.println(mimeType);
	   Assert.assertTrue(mimeType.equalsIgnoreCase(ContentType.APPLICATION_JSON.getMimeType())); 
	}


}
