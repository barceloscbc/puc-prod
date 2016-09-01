using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Web.Http;

namespace RecolhimentoMicroServico.Controllers
{
    [RoutePrefix("api/RecolhimentoCarro")]
    public class RecolhimentoCarroController : ApiController
    {
        [Route("{logradouro:alpha}", Name = "SolicitarRecolhimentoCarroByLogradouro")]
        public IHttpActionResult Post(string logradouro)
        {
            if (!ModelState.IsValid)
            {
                return BadRequest(ModelState);
            }
            return Ok();
        }
    }
}
