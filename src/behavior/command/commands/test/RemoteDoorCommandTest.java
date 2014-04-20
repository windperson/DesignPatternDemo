package behavior.command.commands.test;

import org.junit.Test;

import behavior.command.*;
import behavior.command.commands.remoteDoor.*;

public class RemoteDoorCommandTest {
	
	class MockRemoteDoor extends RemoteDoor
	{
		
		public MockRemoteDoor(String ip)
		{
			super(ip);
		}
		
		public MockRemoteDoor(String ip, String status)
		{
			super(ip, status);
		}
	}
	
	
	private Server _server;

	@Test
	public void test() {
		
		_server = new Server();
		
		testDoorCommand();
		
		
	}
	
	private void testDoorCommand()
	{
		RemoteDoor door = new MockRemoteDoor("192.168.0.1", "open");
		ICommand doorCmd = new RemoteDoorCommand(door);
		_server.addCmd(doorCmd);
		
		_server.monitor();
	}

}
