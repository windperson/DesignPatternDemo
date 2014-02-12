package behavior.visitor;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class TestVisitor {

	@Test
	public void test() {
		List<MapNode> map = new LinkedList<MapNode>();
		
		map.add(new ArchitectureNode("House"));
		map.add(new ArchitectureNode("Bridge"));
		map.add(new ArchitectureNode("Castle"));
		
		map.add(new FurnitureNode("Bed"));
		map.add(new FurnitureNode("Chair"));
		map.add(new FurnitureNode("Table"));
		map.add(new FurnitureNode("Coffee Table"));
		
		LocationCheckVisitor visitor = new LocationCheckVisitor();
		for(MapNode node : map){
			node.accept(visitor);
		}
		
		CountNumberOfFurnitureVisistor countVisitor = new CountNumberOfFurnitureVisistor();
		for(MapNode node : map){
			node.accept(countVisitor);
		}
		
		assertEquals(4, countVisitor.getNumberOfVisistedFurnitureNode());
		
	}

}
