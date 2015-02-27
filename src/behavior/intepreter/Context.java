package behavior.intepreter;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Context implements IContext {

	private Iterator<String> _tokens;
	private String _currentToken;
	private Map<String, INode> _blocks = new HashMap<>();
	
	public Context(String fileName) throws FileNotFoundException{
		List<String> tokenList = new ArrayList<String>();
		BufferedReader reader = new BufferedReader(new FileReader(fileName));
		
		String input = null;
		try{
			while((input = reader.readLine())!= null){
				for(String token : input.trim().split("\\s+")){
					tokenList.add(token);
				}
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
		finally{
			closeStream(reader);
		}
		_tokens = tokenList.iterator();
		//prepare the 1st to be processed _currentToken
		nextToken();
	}
	
	private void closeStream(Closeable io){
		try{
			io.close();
		} catch(IOException e){
			e.printStackTrace();
		}
	}
	
	@Override
	public void skipToken(String token) {
		if(!token.equals(_currentToken)){
			System.err.println("Warning: " + token + " is expected, but " + _currentToken + " is found.");
		}
		nextToken();
	}

	@Override
	public String nextToken() {
		_currentToken = null;
		if(_tokens.hasNext()){
			_currentToken = _tokens.next();
		}
		return _currentToken;
	}

	@Override
	public String currentToken() {
		return _currentToken;
	}

	@Override
	public boolean containsBlock(String blockID) {
		return _blocks.containsKey(blockID);
	}

	@Override
	public void putBlock(String blockID, INode blockNode) {
		_blocks.put(blockID, blockNode);
	}

	@Override
	public INode getBlock(String blockID) {
		return _blocks.get(blockID);
	}

}
