package com.proyecto.gym.demo.DAO;

import java.io.Serializable;

public interface GenericDAOInterface <T, P extends Serializable> {

    /**
     * Crea un nuevo objeto en la base de datos.
     * 
     * @param objeto el objeto a crear en la base de datos.
     * @return el objeto creado en la base de datos.
     */
    public T create(T objeto);
    
    /**
     * Elimina un objeto de la base de datos según su identificador.
     * 
     * @param id el identificador del objeto a eliminar.
     * @return true si el objeto se eliminó correctamente, false en caso contrario.
     */
    public boolean delete(P id);
    
    /**
     * Busca un objeto en la base de datos según su identificador.
     * 
     * @param id el identificador del objeto a buscar.
     * @return el objeto encontrado en la base de datos, o null si no se encontró.
     */
    public T find(P id);
    
    /**
     * Actualiza un objeto en la base de datos.
     * 
     * @param objeto el objeto a actualizar en la base de datos.
     * @return el objeto actualizado en la base de datos.
     */
    public T update(T objeto);
}
