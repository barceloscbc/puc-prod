﻿using Microsoft.Owin;
using Owin;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Http;
using Limpeza.App_Start;

[assembly: OwinStartup(typeof(Limpeza.Startup))]
namespace Limpeza
{
    public class Startup
    {
        public void Configuration(IAppBuilder app)
        {
           
            HttpConfiguration config = new HttpConfiguration();
            
            WebApiConfig.Register(config);

            Swashbuckle.Bootstrapper.Init(config);

            app.UseWebApi(config);

        }
    }
}