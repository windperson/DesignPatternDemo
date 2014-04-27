package behavior.visitor;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class TestVisitor {

	@Test
	public void test() {
		List<MapNode> map = new LinkedList<MapNode>();
		
		map.add(new HouseNode("House"));
		map.add(new ArchitectureNode("Bridge"));
		map.add(new CastleNode("Castle"));
		
		map.add(new FurnitureNode("Bed"));
		map.add(new FurnitureNode("Chair"));
		map.add(new FurnitureNode("Table"));
		map.add(new FurnitureNode("Coffee Table"));
		
		LocationCheckVisitor visitor = new LocationCheckVisitor();
		for(MapNode node : map){
			node.accept(visitor);
		}
		
		CountNumberOfFurnitureVisistor countVisitor = new CountNumberOfFurnitureVisistor();
		GenerateDescriptionVisitor genVisitor = new GenerateDescriptionVisitor();
		
		for(MapNode node : map){
			node.accept(countVisitor);
			node.accept(genVisitor);
		}
		
		assertEquals(4, countVisitor.getNumberOfVisistedFurnitureNode());
		
		
		
		
	}

}
