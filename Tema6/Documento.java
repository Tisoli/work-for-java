package JAVA.Tema6;
public class Documento
{
    private String titulo;
    private String autor;
    public Documento()
    {
        this.titulo="Harry potter";
        this.autor="J.K Rowling";
    }
    public Documento(String titulo,String autor)
    {
        this.titulo=titulo;
        this.autor=autor;
    }
    public void setTitulo(String titulo)
    {
        this.titulo=titulo;
    }
    public String getTitulo()
    {
        return this.titulo;
    }
    public void setAutor(String autor)
    {
        this.autor=autor;
    }
    public String getAutor()
    {
        return this.autor;
    }
}
