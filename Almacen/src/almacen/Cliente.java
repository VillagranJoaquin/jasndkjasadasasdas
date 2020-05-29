package almacen;

class Cliente {

    private String nombre;
    private int telefono;
    private Ventas[] ventas;

      public Cliente(String nombre, int telefono,int cantidadVentas) {
        this.nombre = nombre;
        this.telefono = telefono;
        ventas = new Ventas[cantidadVentas];
    }
    public Cliente(){
     
        this.nombre = "";
        this.telefono = 0;
        ventas = null;
    }
    

    public Ventas[] getVenta() {
        return ventas;
    }

    public void setVenta(Ventas[] venta) {
        this.ventas = venta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void agregarVenta(Ventas v) {
        for (int i = 0; i < ventas.length; i++) {
            if (ventas[i] == null) {
                ventas[i] = v;
                break;
            }
        }
    }

    public float PromImporte() {
        double suma = 0;
        int c = 0;
        float resultado=0;
        for (int i = 0; i < ventas.length; i++) {
            if (ventas[i] != null) {
                c += ventas[i].getImporteTotal();

            }
        }
        return resultado=(float)suma/c;
    }
    
    public int sumTotal(){
        int c=0;
        for (int i = 0; i < ventas.length; i++) {
            if (ventas[i] !=null) {
                c+= ventas[i].getSaldoDeuda();
                
            }
            
        }
        return c;
    }
public int VentasSuperior(double cant)
    {
        int sum = 0;
        for (int i = 0; i < ventas.length; i++) {
            if(ventas[i] != null && ventas[i].getImporteTotal() > cant)
            {
                sum += 1;
            }
        }
        return sum;
    }
}
