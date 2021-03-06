package me.fwilson.ircclient;

import me.fwilson.jirc.entities.User;
import me.fwilson.jirc.events.Event;
import me.fwilson.jirc.events.EventDispatcher;
import me.fwilson.jirc.events.EventHandler;

public class ChanmsgPrinter implements EventHandler {
	public void handle(EventDispatcher d, Event e) {
		User sender = (User)e.getInfo("from");
		String to = (String)e.getInfo("to");
		String text = (String)e.getInfo("text");
		System.out.printf("--- | (%s) <%s> %s\n", to, sender.getNickname(), text);
	}
}
