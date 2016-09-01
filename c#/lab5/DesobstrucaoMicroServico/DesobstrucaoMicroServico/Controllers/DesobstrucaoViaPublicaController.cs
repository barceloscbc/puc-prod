using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Web.Http;

namespace Desobstrucao.Controllers
{
    [RoutePrefix("api/DesobstrucaoViaPublica")]
    public class DesobstrucaoViaPublicaController : ApiController
    {
        [Route("{logradouro:alpha}", Name = "SolicitacaoDesobstrucaoViaPublicaByLogradouro")]
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
