package it.univpm.progogg.enums;

public enum Complexity {
	CONSTANT {

		@Override
		public double getValue(double inputSize) {
			return K + inputSize;
		}

	},

	PROPORTIONAL {

		@Override
		public double getValue(double inputSize) {
			return K * inputSize;
		}

	},

	EXPONENTIAL {

		@Override
		public double getValue(double inputSize) {
			return Math.pow(inputSize, K);
		}

	};

	private static final double K = 7.0;

	public abstract double getValue(double inputSize);
}
