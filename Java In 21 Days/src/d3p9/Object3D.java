package d3p9;

public class Object3D {

	private int height, weight, depth;
	
	public Object3D(int height, int weight, int depth) {
		this.height = height;
		this.weight = weight;
		this.depth = depth;
	}
	
	public String toString() {
		return "[height = " + height + ", weight = " + weight + ", depth = " + depth + "]";
	}
	
}
