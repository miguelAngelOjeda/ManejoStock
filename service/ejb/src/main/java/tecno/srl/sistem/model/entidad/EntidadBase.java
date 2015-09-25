/**
 * 
 */
package tecno.srl.sistem.model.entidad;

import java.security.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Miguel
 *
 */
@Entity
@Table
public class EntidadBase {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	@Column(name = "activo")
    private String activo;
	
	@Column(name = "fechaAlta")
    private Timestamp fechaAlta;
	
	@Column(name = "fechaBaja")
    private Timestamp fechaBaja;
	
	@Column(name = "fechaModificacion")
    private Timestamp fechaModificacion;

	public EntidadBase() {

	}

	/**
	 * @param id
	 *            el id de EntidadBase
	 */
	public EntidadBase(Long id) {
		this.setId(id);
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

	public Timestamp getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Timestamp fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Timestamp getFechaBaja() {
		return fechaBaja;
	}

	public void setFechaBaja(Timestamp fechaBaja) {
		this.fechaBaja = fechaBaja;
	}

	public Timestamp getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Timestamp fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
	
	
	
}
