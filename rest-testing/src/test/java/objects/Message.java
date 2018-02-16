package objects;

import util.RandomInput;

/*
- UID is a long specifying a message id,
- Sender is a string specifying name of the sender,
- Subject is a string specifying a subject of the message,
- Message is a string specifying a text of the message (no restrictions for the size of the message),
- Time sent is a long specifying a time when the message was sent.
      "time_sent": 1459239867

 */
public class Message {

	private Long uid; 
	private String sender; 
	private String subject; 
	private String message ;
	private Long time_sent;
	private boolean archived = false;
	private boolean read=false;

	public void setAllParametersWithValidData(){
		setUid(33L);
		setSender("inessa test sender");
		setSubject("inessa test subject");
		setMessage("inessa test message");
		setArchived (false);
		setRead(false);
		setTimeSent(RandomInput.generateLong());
	}
	
	
	public void setTime_sent(Long time_sent) {
		this.time_sent = time_sent;
	}

	public boolean isArchived() {
		return archived;
	}

	public void setArchived(boolean archived) {
		this.archived = archived;
	}

	public boolean isRead() {
		return read;
	}

	public void setRead(boolean read) {
		this.read = read;
	}

	

	public Long getUid() {
		return uid;
	}
	public void setUid(Long uid) {
		this.uid = uid;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Long getTimeSent() {
		return time_sent;
	}
	public void setTimeSent(Long time_sent) {
		this.time_sent = time_sent;
	}

}
