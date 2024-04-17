package advance.dev;

class Rectangle extends Shape {
	double a, b;

	Rectangle(double a, double b) {
		this.a = a;
		this.b = b;
	}

	double chuVi() {
		return 2 * (a + b);
	}

	double dienTich() {
		return a * b;
	}
}