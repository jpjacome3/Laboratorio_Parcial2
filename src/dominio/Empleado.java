
package dominio;

/**
 *
 * @author JEAN_PIERRE
 */
public class Empleado {
    private String nombre;
    private int anioN;
    private int mesN;
    private int diaN;
    
    

    public String getNombre() {
        return nombre;
    }

    public int getAnioN() {
        return anioN;
    }

    public int getMesN() {
        return mesN;
    }

    public int getDiaN() {
        return diaN;
    }

    public void llenar(String nombre, int año, int mes, int dia) {
        this.nombre = nombre;
        this.anioN = año;
        this.mesN = mes;
        this.diaN = dia;

    }

    public void calcularAnios() {
        if (mesN <= 7) 
            this.anioN = 2021 - this.anioN;
        else 
            this.anioN = 2021 - this.anioN - 1;
        

    }

    public void calcularMeses() {
        if (mesN <= 7) 
            this.mesN = 7 - this.mesN;
        else {
            int aux = this.mesN - 7;
            this.mesN = 12 - aux;

        }

    }

    public void calcularDia() {
        int t = this.mesN;
        //Esto es considerando que el dia de hoy es 06/07/2021
        if (mesN == 1) {
            this.diaN = 187 - this.diaN;
        }
        if (mesN == 2) {
            this.diaN = 156 - this.diaN;
        }
        if (mesN == 3) {
            this.diaN = 128 - this.diaN;
        }
        if (this.mesN == 4) {
            this.diaN = 97 - this.diaN;
        }
        if (this.mesN == 5) {
            this.diaN = 67 - this.diaN;
        }
        if (this.mesN == 6) {
            this.diaN = 36 - this.diaN;
        }
        if (this.mesN == 7) {
            if (this.diaN <= 6) {
                this.diaN = 6 - this.diaN;
            } else {
                this.diaN = this.diaN - 6;
            }
        }
        if (this.mesN == 8) {
            this.diaN = 366 - (this.diaN + 31);
        }
        if (this.mesN == 9) {
            this.diaN = 366 - (this.diaN + 62);
        }
        if (this.mesN == 10) {
            this.diaN = 366 - (this.diaN + 92);
        }
        if (this.mesN == 11) {
            this.diaN = 366 - (this.diaN + 123);
        }
        if (this.diaN == 12) {
            this.diaN = 366 - (this.diaN + 153);
        }

    }

    }


