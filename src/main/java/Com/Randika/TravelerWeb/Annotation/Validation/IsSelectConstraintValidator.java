package Com.Randika.TravelerWeb.Annotation.Validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class IsSelectConstraintValidator implements ConstraintValidator<IsSelect, String> {
	
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		
		boolean result = !(value.contentEquals("Select Category"));
	
		return result;
	}
}
