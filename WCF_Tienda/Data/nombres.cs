using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Data
{
    public class nombres
    {
        private string nombre;

        public nombres()
        {
            
        }

        public nombres(string n)
        {
            nombre = n;
        }

        public string Nombre
        {
            get { return nombre; }
            set { nombre = value; }
        }
    }
}
