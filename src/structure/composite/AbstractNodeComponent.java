package structure.composite;

public abstract class AbstractNodeComponent implements IComponent {

	abstract IComponent getChild(int index);

}
