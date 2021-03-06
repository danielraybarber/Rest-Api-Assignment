package payroll;

class EmployeeNotFoundException extends RuntimeException {

  /**
	 * wanted the variable below autogenerated
	 */
	private static final long serialVersionUID = 1L;

EmployeeNotFoundException(Long id) {
    super("Could not find employee " + id);
  }
}
