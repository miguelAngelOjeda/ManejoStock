/**
 * 
 */
package tecno.srl.sistem.model.entidad;

import javax.persistence.Column;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author Miguel
 *
 */
public class Usuario extends EntidadBase {
	
	private static final long serialVersionUID = 8658961337762195456L;
	
	@NotNull
	@Column(name = "nombre")
    private String nombre;
	
	@NotNull
	@Column(name = "apellido")
    private String apellido;
	
	@NotNull
	@Column(name = "documento")
    private String documento;
	
	
	@Column(name = "direccion")
    private String direccion;
	
	@Size(min = 10, max = 12)
    @Digits(fraction = 0, integer = 12)
	@Column(name = "telefono")
    private String telefono;
	
	@NotNull
	@Column(name = "alias")
    private String alias;
	
	@NotNull
	@Column(name = "passCifrado")
    private String passCifrado;
	
	@NotNull
	@Column(name = "clave")
    private String clave;
	
	public Usuario() {
	
	}
	
	public Usuario(Long id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getPassCifrado() {
		return passCifrado;
	}

	public void setPassCifrado(String passCifrado) {
		this.passCifrado = passCifrado;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}
	
	
}
