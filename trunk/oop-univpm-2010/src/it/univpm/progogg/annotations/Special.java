package it.univpm.progogg.annotations;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Special {
	public int howMuch() default 0;
	public String why() default "for no reason";
}
