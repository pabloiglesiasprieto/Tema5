package Tema5.ejercicioanalisis.ejercicio2;

class Libro extends Ficha {
    private String autor;
    private String editorial;
    
    public Libro(int id, String titulo, String autor, String editorial) {
        super(id, titulo);
        this.autor = autor;
        this.editorial = editorial;
        this.prestamo = "15 días";
    }
    
    // Getters y setters específicos
    public String getAutor() { return autor; }
    public String getEditorial() { return editorial; }
    
    public void setAutor(String autor) { this.autor = autor; }
    public void setEditorial(String editorial) { this.editorial = editorial; }
    
    @Override
    public void mostrarInfo() {
        System.out.println("Libro: " + titulo + ", ID: " + id + 
                          ", Autor: " + autor + ", Editorial: " + editorial +
                          ", Préstamo: " + prestamo);
    }
}