package P5;

import java.util.ArrayList;
import java.util.Comparator;
class SortDouble implements Comparator<Double> {
	@Override
	public int compare(Double t1, Double t2) {
		return ((t1 - t2 < 0) ? -1 : ((t1 - t2 > 0) ? 1 : 0));
	}
}

public class Triangle{
	private Point pa, pb, pc;
	private ArrayList<Double> sides = new ArrayList<>();
	private ArrayList<Double> angles = new ArrayList<>();
	
	public Triangle() {
		pa = pb = pc = new Point();
	}
	
	public Triangle(int pax, int pay, int pbx, int pby, int pcx, int pcy) throws ImpossibleTriangleException, AcuteTriangleException, RightTriangleException {
		pa = new Point(pax, pay);
		pb = new Point(pbx, pby);
		pc = new Point(pcx, pcy);
		calcSides_Angles();
	}
	
	public Triangle(Point pa, Point pb, Point pc) throws ImpossibleTriangleException, AcuteTriangleException, RightTriangleException {
		pa = new Point(pa);
		pb = new Point(pb);
		pc = new Point(pc);
		calcSides_Angles();
	}
	
	private void calcSides_Angles() throws ImpossibleTriangleException, AcuteTriangleException, RightTriangleException
	{
		sides.add(pa.distTo(pb));
		sides.add(pb.distTo(pc));
		sides.add(pc.distTo(pa));
		sides.sort(new SortDouble());
		
		if (sides.get(0) + sides.get(1) < sides.get(2))
			throw new ImpossibleTriangleException("a + b < c");
		if (sides.get(0) + sides.get(1) == sides.get(2))
			throw new ImpossibleTriangleException("Points on a line");
		//System.out.println(sides);
		
		// largest angle :
		angles.add(Math.acos((	Math.pow(sides.get(0), 2) + 
								Math.pow(sides.get(1), 2) -
								Math.pow(sides.get(2), 2)) /
								(2 * sides.get(0) * sides.get(1))));
		
		angles.add(Math.asin( Math.sin(angles.get(0)) * sides.get(0) / sides.get(2)));
		angles.add(180 - angles.get(0) - angles.get(1));

		angles.sort(new SortDouble());
		//System.out.println(angles);
		
		if (angles.get(2) < 90)
			throw new AcuteTriangleException("");
		if (angles.get(2) == 90)
			throw new RightTriangleException("");
	}
	
	public String toString()
	{
		return pa.toString() + " " + pb.toString() + " " + pc.toString();
	}
}
