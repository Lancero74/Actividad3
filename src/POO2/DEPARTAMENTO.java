package POO2;

public class DEPARTAMENTO {
    private int idDepartamento;
    private String Nombre;
    private String Area;


    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getArea() {
        return Area;
    }

    public void setListaEmpleados(String Area) {
        Area = Area;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public DEPARTAMENTO(int idDepartamento, String Nombre, String Area){

        this.idDepartamento = idDepartamento;
        this.Nombre = Nombre;
        this.Area = Area;
    }
}
