package co.com.springboot.jpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface JPARepository extends CrudRepository<Object/* change for adapter model */, String>, QueryByExampleExecutor<Object/* change for adapter model */> {
}
