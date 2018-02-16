package message;

import java.io.IOException;

import objects.Message;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPatch;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.google.gson.Gson;

//Archive message
public class MessageUpdate {
	
    private String basicUrl="http://localhost:3030//v1/messages/";
	
	@Test
	public void givenValidPatchParameters_then204IsReceived() throws ClientProtocolException, IOException {
		
	   // Given
	   HttpPatch patch = new HttpPatch( basicUrl+"21" );
	   
	   //{ "op": "replace", "path": "/messages/21/archived", "value": "true" }

	   StringEntity patchString = new StringEntity("[ { \"op\":\"replace\", \"path\":\"/archived\", \"value\":true } ]");
	   
	   //set PATCH body parameters
	   patch.setEntity(patchString);
	   patch.setHeader("Content-type", "application/json");
	   
	   // When
	   HttpResponse httpResponse = HttpClientBuilder.create().build().execute(patch);
	   System.out.println(httpResponse.getStatusLine().getStatusCode());
	   // Then
	   Assert.assertTrue(httpResponse.getStatusLine().getStatusCode()==(HttpStatus.SC_NO_CONTENT)); //204
	}
	

}
