
package Services;

import java.util.List;

public interface IGenericDAO<T> {
    int create(T t);
    T read(int id);
    int update(T t);
    int delete(int id);
    List<T>getAll();
}
