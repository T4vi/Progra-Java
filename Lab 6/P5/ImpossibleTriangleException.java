package P5;

public class ImpossibleTriangleException extends Exception {
	private static final long serialVersionUID = 1L;

	ImpossibleTriangleException(String msg) {
		super(msg);
	}
}

class AcuteTriangleException extends Exception {
	private static final long serialVersionUID = 1L;

	AcuteTriangleException(String msg) {
		super(msg);
	}
}

class RightTriangleException extends Exception {
	private static final long serialVersionUID = 1L;

	RightTriangleException(String msg) {
		super(msg);
	}
}