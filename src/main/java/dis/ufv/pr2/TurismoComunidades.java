package dis.ufv.pr2;
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Clase TurismoComunidades
// Esta clase contiene los campos necesarios para convertir el json en formto clase.java
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public class TurismoComunidades {
    private String _id;
    private OrigenDestino origen;
    private OrigenDestino destino;
    private Periodo periodo;
    private int total;

    public TurismoComunidades() {
    }

    public TurismoComunidades(String _id, OrigenDestino origen, OrigenDestino destino, Periodo periodo, int total) {
        this._id = _id;
        this.origen = origen;
        this.destino = destino;
        this.periodo = periodo;
        this.total = total;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public OrigenDestino getOrigen() {
        return origen;
    }

    public void setOrigen(OrigenDestino origen) {
        this.origen = origen;
    }

    public OrigenDestino getDestino() {
        return destino;
    }

    public void setDestino(OrigenDestino destino) {
        this.destino = destino;
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Clase OrigenDestino
    // Esta clase contiene los campos necesarios para el origen y destino de turismo y así evitar más variables de las necesarias
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private class OrigenDestino{
        private String origen;
        private String destino;

        public OrigenDestino() {
        }

        public OrigenDestino(String origen, String destino) {
            this.origen = origen;
            this.destino = destino;
        }

        public String getOrigen() {
            return origen;
        }

        public void setOrigen(String origen) {
            this.origen = origen;
        }

        public String getDestino() {
            return destino;
        }

        public void setDestino(String destino) {
            this.destino = destino;
        }
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Clase Periodo
    // Esta clase contiene los campos necesarios para almacenar la fecha de inicio, la fecha de fin y el periodo del .json
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private class Periodo{
        private String fecha_inicio;
        private String fecha_fin;
        private String periodo;

        public Periodo() {
        }

        public Periodo(String fecha_inicio, String fecha_fin, String periodo) {
            this.fecha_inicio = fecha_inicio;
            this.fecha_fin = fecha_fin;
            this.periodo = periodo;
        }

        public String getFecha_inicio() {
            return fecha_inicio;
        }

        public void setFecha_inicio(String fecha_inicio) {
            this.fecha_inicio = fecha_inicio;
        }

        public String getFecha_fin() {
            return fecha_fin;
        }

        public void setFecha_fin(String fecha_fin) {
            this.fecha_fin = fecha_fin;
        }

        public String getPeriodo() {
            return periodo;
        }

        public void setPeriodo(String periodo) {
            this.periodo = periodo;
        }
    }
}
