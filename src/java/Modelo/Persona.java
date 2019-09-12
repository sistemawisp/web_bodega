
package Modelo;


public class Persona {
    
    int id;
    String ced;
    String nom;
    String Dir;
    String Email;
    String Telf;
    String Edad;
    String Fecha;
    String Estado;
    String Usuario;
    String Password;

    public Persona() {
    }

    public Persona(String ced, String nom, String Dir,String Email, String Telf, String Edad, String Fecha, String Estado, String Usuario, String Password) {
        this.ced = ced;
        this.nom = nom;
        this.Dir = Dir;
        this.Email = Email;
        this.Telf = Telf;
        this.Edad = Edad;
        this.Fecha = Fecha;
        this.Estado = Estado;
        this.Usuario = Usuario;
        this.Password = Password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCed() {
        return ced;
    }

    public void setCed(String ced) {
        this.ced = ced;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
     public String getDir() {
        return Dir;
    }

    public void setDir(String Dir) {
        this.Dir = Dir;
    }
    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    public String getTelf() {
        return Telf;
    }

    public void setTelf(String Telf) {
        this.Telf = Telf;
    }
    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }
    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }
    
    public String getPassword() {
        return Password;
    }
    public void setPassword(String Password) {
        this.Password = Password;
    }
}
