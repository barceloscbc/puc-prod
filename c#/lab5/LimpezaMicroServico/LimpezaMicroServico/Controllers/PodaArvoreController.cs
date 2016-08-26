using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Web.Http;
using System.Web.Http.Description;

namespace WebApiSwagger.Controllers
{
    [RoutePrefix("api/PodaArvore")]
    public class PodaArvoreController : ApiController
    {

        [Route("{logradouro:alpha}", Name = "SolicitarPodaAvoreByLogradouro")]
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
