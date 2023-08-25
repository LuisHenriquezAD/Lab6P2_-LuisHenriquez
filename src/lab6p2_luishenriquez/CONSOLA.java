package lab6p2_luishenriquez;


public class CONSOLA {


private String id;

private String fab;

private int anos;

private double precio;

private String modelo;

    public CONSOLA() {
    }

    public CONSOLA(String id, String fab, int anos, double precio, String modelo) {
        this.id = id;
        this.fab = fab;
        this.anos = anos;
        this.precio = precio;
        this.modelo = modelo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFab() {
        return fab;
    }

    public void setFab(String fab) {
        this.fab = fab;
    }

    public int getAnos() {
        return anos;
    }

    public void setAnos(int anos) {
        this.anos = anos;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "CONSOLA:" + "Id = " + id + 
                " Fab = " + fab + 
                " Anos = " + anos + 
                " Precio = " + precio + 
                " Modelo = " + modelo ;
    }



    
}
