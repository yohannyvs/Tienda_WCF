using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Data
{
    public class articulos
    {
        private string nombre;
        private string descripcion;
        private int precio;

        public articulos()
        {
            
        }

        public articulos(string n, string d, int p)
        {
            nombre = n;
            descripcion = d;
            precio = p;
        }

        public string Nombre
        {
            get { return nombre; }
            set { nombre = value; }
        }

        public string Descripcion
        {
            get { return descripcion; }
            set { descripcion = value; }
        }

        public int Precio
        {
            get { return precio; }
            set { precio = value; }
        }
    }
}
