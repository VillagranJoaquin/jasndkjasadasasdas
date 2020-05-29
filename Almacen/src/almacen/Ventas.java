
package almacen;

class Ventas {
    private int cantidad;
    private double importeTotal;
    private double saldoDeuda;  

    public Ventas(int prodVendido, double importeTotal, double saldoDeuda) {
        this.cantidad = prodVendido;
        this.importeTotal = importeTotal;
        this.saldoDeuda = saldoDeuda;
    }

    public int getProdVendido() {
        return cantidad;
    }

    public void setProdVendido(int prodVendido) {
        this.cantidad = prodVendido;
    }

    public double getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(double importeTotal) {
        this.importeTotal = importeTotal;
    }

    public double getSaldoDeuda() {
        return saldoDeuda;
    }

    public void setSaldoDeuda(double saldoDeuda) {
        this.saldoDeuda = saldoDeuda;
    }
}

