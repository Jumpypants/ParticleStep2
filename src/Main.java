public class Main {
	public static void main (String[] args) {
		int maxSteps = 15;
		int numParticles = 10000;

		for (int i = 0; i < maxSteps; i++) {
			double total = 0;
			for (int j = 0; j < numParticles; j++) {
				Particle p = new Particle();
				total += p.simulate(i);
			}
			System.out.println("Average displacement for " + i + " steps is " + (total / numParticles));
		}
	}
}
