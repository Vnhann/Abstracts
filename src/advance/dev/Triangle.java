package advance.dev;

class Triangle extends Shape {
	double a, b, c;

	Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	double chuVi() {
		return a + b + c;
	}

	double dienTich() {
		// Using Heron's formula to calculate the area of a triangle
		double p = chuVi() / 2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}
