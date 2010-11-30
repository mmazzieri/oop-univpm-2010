package it.univpm.progogg.rtti;

import java.lang.reflect.*;

public class Mock {
	public static Object getMockObject(final Class<?> c) {
		return Proxy.newProxyInstance(c.getClassLoader(), new Class<?>[] { c },
				new InvocationHandler() {
					@Override
					public Object invoke(Object proxy, Method method,
							Object[] args) {
						System.out.println("Invoked method " + method.getName() + " for interface " + c.getSimpleName());
						return null;
					}
				});
	}
	
	interface I {
		void f();
	}
	
	public static void main(String[] args) {
		I o = (I)Mock.getMockObject(I.class);
		o.f();
	}
}
