using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Web.Http;
using System.Web.Http.Description;
using Limpeza.Models;

namespace Limpeza.Controllers
{
    [RoutePrefix("api/ColetaLixo")]
    public class ColetaLixoController : ApiController
    {
        private static Random rnd;
        static ColetaLixoController()
        {
            rnd = new Random();
        }

        [Route("{logradouro:alpha}", Name = "GetColetaLixoByLogradouro")]
        [ResponseType(typeof(List<DiaColeta>))]
        public IHttpActionResult Get(string logradouro)
        {

            List<DiaColeta> diasColeta = new List<DiaColeta>();
            diasColeta.Add(new DiaColeta(logradouro, getDayRandom()));
            diasColeta.Add(new DiaColeta(logradouro, getDayRandom()));
            if (diasColeta == null)
            {
                return NotFound();
            }

            return Ok(diasColeta);
        }

        private string getDayRandom()
        {
            DayOfWeek dia = (DayOfWeek)rnd.Next(0, 6);
            return dia.ToString();
        }
    }
}
