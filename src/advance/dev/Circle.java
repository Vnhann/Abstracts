package advance.dev;

class Circle extends Shape {
	double r;

	Circle(double r) {
		this.r = r;
	}

	double chuVi() {
		return 2 * Math.PI * r;
	}

	double dienTich() {
		return Math.PI * r * r;
	}
}
