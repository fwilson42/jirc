package me.fwilson.jirc;

public abstract class Callback implements EventHandler {
	public abstract void callback(Event e);
	public void handle(EventDispatcher d, Event e) {
		this.callback(e);
	}
}
