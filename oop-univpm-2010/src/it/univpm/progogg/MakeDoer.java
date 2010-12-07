package it.univpm.progogg;

public class MakeDoer {
	class NullDoer implements Doer {
		@Override
		public void doSomething() {
		}
	}

	public Doer makeDoer() {
		return new NullDoer();
	}

	public Doer makeSomeDoer() {
		class TryDo implements Doer {
			@Override
			public void doSomething() {
				System.out.println("let's try");
			}
		}

		return new TryDo();
	}

	public Doer makeAnonymousDoer() {
		return new Doer() {
			@Override
			public void doSomething() {
			}
		};
	}
}
