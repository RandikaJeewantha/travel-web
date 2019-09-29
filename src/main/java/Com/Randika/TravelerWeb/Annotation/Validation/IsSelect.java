package Com.Randika.TravelerWeb.Annotation.Validation;

import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = IsSelectConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface IsSelect {

	public String value();
	
	public String message() default "Is Required !";
		
	public Class<?>[] groups() default {};
	
	public Class<? extends Payload>[] payload() default {};
	
} 
