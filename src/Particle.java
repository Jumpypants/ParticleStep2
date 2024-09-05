public class Particle {
	double x = 0;
	double y = 0;
	double z = 0;

	public double simulate (int steps) {
		for (int i = 0; i < steps; i++) {
			step();
		}

		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
	}

	private void step () {
		int r = 68;
		double angle1 = Math.random() * Math.PI * 2;
		double angle2 = Math.random() * Math.PI * 2;

		x += r * Math.sin(angle2) * Math.cos(angle1);
		y += r * Math.sin(angle2) * Math.sin(angle1);
		z += r * Math.cos(angle2);
	}
}
