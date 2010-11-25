/*

@ShortLicense@

Authors: @JS@
         @MJL@

Released: @ReleaseDate@

*/

package de.jskat.data.iss;

/**
 * Chat message from ISS
 */
public class ISSChatMessage {

	private String chatName;
	private String message;

	/**
	 * Constructor
	 * 
	 * @param newChatName Chat name
	 * @param messageText Message text
	 */
	public ISSChatMessage(String newChatName, String messageText) {
		
		this.chatName = newChatName;
		this.message = messageText;
	}
	
	/**
	 * Gets the name of the chat
	 * 
	 * @return Chat name
	 */
	public String getChatName() {
		
		return this.chatName;
	}
	
	/**
	 * Gets the message text
	 * 
	 * @return Message text
	 */
	public String getMessage() {
		
		return this.message;
	}
}
