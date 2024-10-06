package POO2;

public class EMPLEADO {

    private int Id_Empleado;
    private String Nombre;
    private String Apellido;
    private String Tipo_Empleado;
    private String Fecha_Contratacion;

    public String getFecha_Contratacion() {
        return Fecha_Contratacion;
    }
    public void setFecha_Contratacion(String Fecha_Contratacion) {
        Fecha_Contratacion = Fecha_Contratacion;
    }

    public String getTipo_Empleado() {
        return Tipo_Empleado;
    }

    public void setTipo_Empleado(String Tipo_Empleado) {
        Tipo_Empleado = Tipo_Empleado;
    }

    public String Apellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        Apellido = Apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        Nombre = Nombre;
    }

    public int getId_Empleado() {
        return Id_Empleado;
    }

    public void setId_Empleado(int Id_Empleado) {
        Id_Empleado = Id_Empleado;
    }

    public EMPLEADO(int Id_Empleado, String Nombre, String Apellido, String Tipo_Empleado, String Fecha_Contratacion){
            this.Apellido = Apellido;
            this.Nombre = Nombre;
            this.Id_Empleado = Id_Empleado;
            this.Tipo_Empleado = Tipo_Empleado;
            this.Fecha_Contratacion = Fecha_Contratacion;
        }
    }


