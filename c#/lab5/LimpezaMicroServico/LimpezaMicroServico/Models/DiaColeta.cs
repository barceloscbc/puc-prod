using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Web;

namespace Limpeza.Models
{
    public class DiaColeta
    {
      
        [Required]
        public string logradouro { get; set; }

        [Required]
        public string dia { get; set; }

        public DiaColeta(string logradouro, string dia)
        {
            this.dia = dia;
            this.logradouro = logradouro;
        }
    }
}