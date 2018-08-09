package repository;

import org.hibernate.query.criteria.internal.CriteriaUpdateImpl;
import org.springframework.data.jpa.repository.JpaRepository;

import model.Employee;

public abstract class EmployeeRepository implements JpaRepository<Employee,Long> {

}
