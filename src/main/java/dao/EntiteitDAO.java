package dao;

import model.Entiteit;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by x085177 on 1/4/2016.
 */
public interface EntiteitDAO extends CrudRepository<Entiteit,Long> {
}
